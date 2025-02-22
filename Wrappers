import java.util.Scanner;

public class Wrappers {

    public static void main(String[] args) {

        // ejercicio01();
        // ejercicio02();
        // ejercicio03();
        ejercicio04();

    }

    // Pídele al usuario que introduzca una cadena. Intenta convertir la cadena a un
    // número decimal usando Double.valueOf().
    // Si la cadena no representa un número válido, Double.valueOf() lanzará una
    // excepción. Captura esta excepción y muestra un mensaje al usuario indicando
    // que la entrada no es un número válido.
    public static void ejercicio01() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();
        try {
            double numero = Double.valueOf(cadena);
            System.out.println("La cadena es de: " + numero);
        } catch (Exception e) {
            System.out.println("Numero Invalido");

        }
        scanner.close();
    }

    // Escribe un programa que lea una cadena que represente un número
    // entero como entrada utilizando la clase Scanner. Luego, convierte la cadena
    // en un número entero utilizando la clase de envoltura Integer.
    public static void ejercicio02() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena que represente un entero:");
        String cadena = sc.nextLine();

        try {
            int num = Integer.parseInt(cadena);
            System.out.println("Cadena ingresada: " + cadena);
            System.out.println("Representa el entero: " + num);
        } catch (Exception e) {
            System.out.println("La cadena ingresada no es un entero.");
        }
        sc.close();
    }

    // Pide al usuario que introduzca una cadena. Crea un bucle que recorra cada
    // carácter en la cadena
    // y utiliza Character.isLetter() para verificar si todos los caracteres son
    // letras. Muestra un mensaje al usuario indicando si la cadena contiene solo
    // letras o no.
    public static void ejercicio03() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa una cadena: ");
        String cadena = scanner.nextLine();

        boolean soloLetras = true;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (!Character.isLetter(caracter)) {
                soloLetras = false;
            }

        }
        if (soloLetras) {
            System.out.print("Contiene letras");
        } else {
            System.out.print("No contiene letras");
        }
        scanner.close();
    }

    // Contando los espacios en blanco en una cadena
    // Pídele al usuario que introduzca una cadena. Crea un bucle que recorra cada
    // carácter en la cadena y utiliza Character.isWhitespace()
    // para contar el número de espacios en blanco en la cadena. Muestra el recuento
    // al usuario.
    public static void ejercicio04() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una cadena:");

        String cadena = sc.nextLine();

        int contador = 0;

        for (int i = 0; i < cadena.length(); i++) {
            char caracter = cadena.charAt(i);
            if (Character.isWhitespace(caracter)) {
                contador++;
            }
        }

        System.out.println("La cadena tiene estos espacios en blanco " + contador);

        sc.close();

    }
}
