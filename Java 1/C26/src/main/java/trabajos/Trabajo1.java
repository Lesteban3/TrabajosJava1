package trabajos;

import java.util.Scanner;

public class Trabajo1 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);


        System.out.println("Señor usuario, por favor, ingrese el primer número. ");
        int num1=scanner.nextInt();

        System.out.println("Señor usuario, por favor, ingrese el segundo número. ");
        int num2=scanner.nextInt();

        System.out.println("La Suma de "+ num1+" y "+ num2+" es: "+(num1+num2));
        System.out.println("La Resta de "+ num1+" y "+ num2+" es: "+(num1-num2));
        System.out.println("La Multiplicacion de "+ num1+" y "+ num2+" es: "+ (num1*num2));
        System.out.println("La Divicion de "+ num1+" y "+ num2+" es: "+ (num1/num2));

    }
}
