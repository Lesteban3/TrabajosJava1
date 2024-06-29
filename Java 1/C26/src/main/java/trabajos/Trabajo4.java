package trabajos;

import java.util.ArrayList;

public class Trabajo4 {

        public static void main(String[] args) {

            ArrayList<Integer> calificaciones = new ArrayList<>();
            calificaciones.add(85);
            calificaciones.add(90);
            calificaciones.add(88);
            calificaciones.add(92);
            calificaciones.add(95);

            Estudiante Esteban = new Estudiante("Esteban", 25, calificaciones);


            Esteban.mostrarInformacion();
        }

        static class Estudiante {
            private String nombre;
            private int edad;
            private java.util.ArrayList<Integer> calificaciones;


            public Estudiante(String nombre, int edad, java.util.ArrayList<Integer> calificaciones) {
                this.nombre = nombre;
                this.edad = edad;
                this.calificaciones = calificaciones;
            }


            public double calcularPromedio() {
                if (calificaciones.isEmpty()) {
                    return 0;
                }
                double suma = 0;
                for (int calificacion : calificaciones) {
                    suma += calificacion;
                }
                return suma / calificaciones.size();
            }


            public void mostrarInformacion() {

                System.out.println("Información del estudiante:");
                System.out.println("Nombre: " + nombre);
                System.out.println("Edad: " + edad);
                if (!calificaciones.isEmpty()) {
                    System.out.print("Calificaciones: ");
                    for (int calificacion : calificaciones) {
                        System.out.print(calificacion + " ");
                    }
                    System.out.println();
                    System.out.println("Promedio de calificaciones: " + calcularPromedio());
                } else {
                    System.out.println("Calificaciones: No disponibles");
                }
            }
        }
    }



