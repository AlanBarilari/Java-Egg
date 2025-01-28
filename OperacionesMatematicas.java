
import java.util.Scanner;

public class OperacionesMatematicas {

    public static void main(String[] args) {

        int num1;
        int num2;
        int a = 10;
        int b = 5;

        Scanner scanner = new Scanner(System.in);

        System.out.println("El resultado es suma " + (a + b));
        System.out.println("El resultado es resta " + (a - b));
        System.out.println("El resultado es multi " + (a * b));
        System.out.println("El resultado es modulo " + (b % a));
        System.out.println("El resultado es division " + (a / b));

        System.out.println("Ingrese el primer numero entero");
        num1 = scanner.nextInt();

        System.out.println("Ingrese el seugndo numero entero");
        num2 = scanner.nextInt();

        int resultado = num1 + num2;

        System.out.println("El resultado de la suma entre " + num1 + " y " + num2 + " es igual a: " + resultado);

        scanner.close();

    }

}