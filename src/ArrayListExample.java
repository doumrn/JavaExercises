import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListExample {
    public static void main(String[] args) {

        /*Creación del Array*/
        ArrayList<String> movies = new ArrayList<>();

        /*List de elementos del Array*/
        movies.add("Back to the Future");
        movies.add("Back to the Future 2");
        movies.add("Back to the Future 3");
        movies.add("Predator");
        movies.add("Alien");
        movies.add("Terminator");
        movies.add("Interstellar");

        Scanner scanner = new Scanner(System.in);
        int option;

        do {
            /*Mostrar el menú al usuario*/
            System.out.println("\nMenú de opciones:");
            System.out.println("1. Ver lista de películas");
            System.out.println("2. Eliminar una película");
            System.out.println("3. Salir");
            System.out.print("Selecciona una opción: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    /*Imprimir todos los elementos del Array con su índice*/
                    System.out.println("\nLista de películas disponibles:");
                    for (int i = 0; i < movies.size(); i++) {
                        System.out.println((i + 1) + ". " + movies.get(i));  /*Imprime el índice + 1 y el nombre de la película*/
                    }
                    /*Pedir al usuario que ingrese la posición de la película que desea seleccionar*/
                    System.out.print("\nIngresa el número de la película que deseas ver (1 a " + movies.size() + "): ");
                    int movieIndex = scanner.nextInt() - 1; /*-1 para ajustar el índice*/

                    /*Verificar que el número ingresado es válido y acceder a la película*/
                    if (movieIndex >= 0 && movieIndex < movies.size()) {
                        System.out.println("\nPelícula en la posición " + (movieIndex + 1) + ": " + movies.get(movieIndex));
                    } else {
                        System.out.println("\nNúmero inválido. Por favor, ingresa un número entre 1 y " + movies.size() + ".");
                    }
                    break;

                case 2:
                    /*Mostrar lista nuevamente para el usuario*/
                    System.out.println("\nLista de peliculas:");
                    for(int i = 0; i < movies.size(); i++) {
                        System.out.println((i + 1) + ". " + movies.get(i));
                    }

                    /*Eliminar un elemento de la lista*/
                    System.out.print("\nIngresa el número de la película que deseas eliminar (1 a " + movies.size() + "): ");
                    int deleteIndex = scanner.nextInt() - 1; /*-1 para ajustar el índice*/

                    /*Verificar que el número ingresado es válido y eliminar la película*/
                    if (deleteIndex >= 0 && deleteIndex < movies.size()) {
                        System.out.println("\nEliminando la película: " + movies.get(deleteIndex));
                        movies.remove(deleteIndex);
                        System.out.println("\nLista de películas después de la eliminación:");
                        for (int i = 0; i < movies.size(); i++) {
                            System.out.println((i + 1) + ". " + movies.get(i));
                        }
                    } else {
                        System.out.println("\nNúmero inválido. Por favor, ingresa un número entre 1 y " + movies.size() + ".");
                    }
                    break;

                case 3:
                    System.out.println("\nSaliendo del programa...");
                    break;

                default:
                    System.out.println("\nOpción no válida. Por favor, selecciona una opción entre 1 y 3.");
            }
        } while (option != 3);

        scanner.close();
    }
}


