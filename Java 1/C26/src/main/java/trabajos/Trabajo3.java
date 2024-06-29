package trabajos;

import java.util.Scanner;
//   dados 3 numeros digitables decir cual es el mayor.
//   hacer un algoritmo que detecte en que mes estamos segun un numero del 1 al 12

public class Trabajo3 {
    public static void main(String[] args) {
        Scanner Scanner= new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        int num1= Scanner.nextInt();
        System.out.println("Ingrese el Segundo numero: ");
        int num2= Scanner.nextInt();
        System.out.println("Ingrese el Tercer numero: ");
        int num3= Scanner.nextInt();

        int max = num1;

        if (num2 > max) {
            max = num2;
        }

        if (num3 > max) {
            max = num3;
        }


        System.out.println("El número mayor es: " + max);
    }
}
//   hacer un algoritmo que detecte en que mes estamos segun un numero del 1 al 12



