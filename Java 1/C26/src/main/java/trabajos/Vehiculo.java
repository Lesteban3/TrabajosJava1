package trabajos;

public class Vehiculo {

    Vehiculo(){}

    Vehiculo (String marca){
        this.marca=marca;
    }

    Vehiculo (String marca,String modelo_año){
        this.marca=marca;
        this.modelo_año=modelo_año;

    }
    Vehiculo (String marca,String modelo_año,String color){
        this.marca=marca;
        this.modelo_año=modelo_año;
        this.color=color;
    }
    Vehiculo (String marca,String modelo_año,String color, int valor){
        this.marca=marca;
        this.modelo_año=modelo_año;
        this.color=color;
        this.valor=valor;
    }

    private String marca;
    private String color;
    private String modelo_año;
    private int valor;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getModelo_año() {
        return modelo_año;
    }

    public void setModelo_año(String modelo_año) {
        this.modelo_año = modelo_año;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
