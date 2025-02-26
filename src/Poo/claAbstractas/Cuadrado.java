package Poo.claAbstractas;

public class Cuadrado implements Figura, Dibujable {

    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado) {
        this.lado = lado;
    }

    // Override -Sobrescribir texto
    @Override
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }

    @Override
    public void dibujar() {
        System.out.println("Hola, estoy dibujand un Cuadrado");
    }
}





















