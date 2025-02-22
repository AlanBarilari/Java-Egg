import java.util.Scanner;
public class claseDeif {
    public static void main(String[] args) {
        Scanner numerito = new Scanner (System.in);
        int numeroUsuario; 
        System.out.println("Ingrese un numero ");
        numeroUsuario = numerito.nextInt();
        if (numeroUsuario >= 90 && numeroUsuario <=100 ) { 
            System.out.println("A");
        } else if (numeroUsuario >= 80 && numeroUsuario <=89 ) {
            System.out.println("B"); }
            else if (numeroUsuario >= 70 && numeroUsuario <=79 ) {
                System.out.println("C"); }
                else if (numeroUsuario >= 60 && numeroUsuario <=69 ) {
                    System.out.println("D"); }
                    else if ( numeroUsuario <=60 ) {
                        System.out.println("F"); }
                        else if ( numeroUsuario >100) {
                            System.out.println("ingrese un numero dentro del rango");
                        }
    numerito.close(); 
    }
}



//Si la puntuación está entre 90 y 100, se mostrará "A".

//Si la puntuación está entre 80 y 89, se mostrará "B".

//Si la puntuación está entre 70 y 79, se mostrará "C".

//Si la puntuación está entre 60 y 69, se mostrará "D".

//Si la puntuación es menor a 60, se mostrará "F".

//Si el usuario ingresa un número que no está dentro del rango establecido (es decir, fuera del intervalo de 0 a 100), el programa debe informar al usuario que el número ingresado está fuera del rango válido.
