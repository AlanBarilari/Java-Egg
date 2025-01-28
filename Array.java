import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Array {
    public static void main(String[] args) {

        // ejercicio01();
        // ejercicio02();
        ejercicio03();
    }

    // Escribe un programa en el que declares una variable de tipo array que
    // contenga 10 elementos de tipo entero. Inicializa el arreglo con valores
    // aleatorios entre 1 y 100, imprime por consola el arreglo inicial y luego
    // ordenalo en
    // forma descendente utilizando el método Arrays.sort(). Finalmente, imprime los
    // elementos ordenados en la consola.
    public static void ejercicio01() {
        int[] arr = new int[10];
        Random random = new Random();
        Arrays.setAll(arr, i -> random.nextInt(100) + 1);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length / 2; i++) {
            int temporal = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temporal;
        }
        System.out.println(Arrays.toString(arr));
    }
    
    // La búsqueda binaria es un algoritmo eficiente para encontrar un elemento en
    // una lista ordenada de elementos. La clase Arrays ya incluye su implementación
    // mediante el método binarySearch().
    // Escribe un programa que realice una búsqueda binaria en un arreglo ordenado
    // de enteros utilizando el método Arrays.binarySearch(). El programa debe
    // imprimir el
    // arreglo generado originalmente, solicitar al usuario el valor buscado e
    // imprimir el índice del valor buscado si está presente en el arreglo.

    public static void ejercicio02() {
        int[] arr = new int[10];
        Random random = new Random();
        Arrays.setAll(arr, i -> random.nextInt(100) + 1);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Scanner usuario = new Scanner(System.in);
        System.out.println("Que valor desea buscar?");
        int valorBuscado = usuario.nextInt();
        int buscador = Arrays.binarySearch(arr, valorBuscado);
        if (buscador >= 0) {
            System.out.println("Valor encontrado en el índice: " + buscador);
        } else {
            System.out.println("Valor no encontrado en el array.");
        }
        usuario.close();
    }

    // Escribe un programa que compare dos arreglos de enteros utilizando el método
    // Arrays.equals(). El programa debe imprimir si los arreglos son iguales o no.
    public static void ejercicio03() {
        {
            int[] arr = new int[10];
            Random random = new Random();
            Arrays.setAll(arr, i -> random.nextInt(100) + 1);
            Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));

            System.out.println(Arrays.toString(arr));
            int[] arr2 = new int[10];
            Random random2 = new Random();
            Arrays.setAll(arr2, i -> random2.nextInt(100) + 1);
            Arrays.sort(arr2);
            System.out.println(Arrays.toString(arr2));

            boolean compararArr = Arrays.equals(arr, arr2);

            if (compararArr) {
                System.out.println(" Los arrays son iguales ");
            } else {
                System.out.println(" Los arrays son diferentes ");
            }
        }
    }
}
