package trabajos;

public class Trabajo2 {
    public static void main(String[] args) {

    Vehiculo vehiculo= new Vehiculo("BMW","2020","Negro",50000000);

        System.out.println("La marca del vehiculo 1 es "+ vehiculo.getMarca()+
                ", El año del modelo es "+ vehiculo.getModelo_año()+
                ", el color del vehiculo es "+ vehiculo.getColor()+
                " y el valor del vehiculo es de  "+ vehiculo.getValor());


        Vehiculo vehiculo2 = new Vehiculo("TOYOTA","2007","BLANCO",21000000);

        System.out.println("La marca del vehiculo 2 es "+ vehiculo2.getMarca()+
                ", El año del modelo es  "+ vehiculo2.getModelo_año()+
                ", el color del vehiculo es "+ vehiculo2.getColor()+
                " y el valor del vehiculo es de  "+ vehiculo2.getValor());




    }
}
