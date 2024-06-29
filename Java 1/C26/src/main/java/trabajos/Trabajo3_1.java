package trabajos;

import java.util.Scanner;

public class Trabajo3_1 {
    //   hacer un algoritmo que detecte en que mes estamos segun un numero del 1 al 12
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Señor usuario, por favor ingrese numero del 1 al 12 para detectar el mes en el que se encuentra ");

        int numero=scanner.nextInt();

        int mesDelAño =numero;

        switch (mesDelAño){
            case 1:
                System.out.println("Usted esta en el mes de Enero");
                break;
            case 2:
                System.out.println("Usted esta en el mes de Febrero");
                break;
            case 3:
                System.out.println("Usted esta en el mes de Marzo");
                break;
            case 4:
                System.out.println("Usted esta en el mes de Abril");
                break;
            case 5:
                System.out.println("Usted esta en el mes de Mayo");
                break;
            case 6:
                System.out.println("Usted esta en el mes de Junio");
                break;
            case 7:
                System.out.println("Usted esta en el mes de Julio");
                break;
            case 8:
                System.out.println("Usted esta en el mes de Agosto");
                break;
            case 9:
                System.out.println("Usted esta en el mes de Septiembre");
                break;
            case 10:
                System.out.println("Usted esta en el mes de Octubre");
                break;
            case 11:
                System.out.println("Usted esta en el mes de Noviembre");
                break;
            case 12:
                System.out.println("Usted esta en el mes de Diciembre");
                break;
            default:
                System.out.println("Mes no valido ");
        }
    }
    }
