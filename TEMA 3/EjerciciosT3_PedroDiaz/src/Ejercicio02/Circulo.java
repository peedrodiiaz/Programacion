package Ejercicio02;

public class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double areaCm2() {
        return  Math.PI * Math.pow(radio, 2);
    }

    public double areaM2() {
        return areaCm2() / 10000; 
    }
}
