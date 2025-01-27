package Ejemplo03_polmorfismo;

public class Circulo extends Figura {

	private double radio;

	public double getRadio() {
		return radio;
	}

	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [radio=" + radio + "]";
	}

	public Circulo(String nombre, String color, double radio) {
		super(nombre, color);
		this.radio = radio;
	}

	public Circulo(String nombre, String color) {
		super(nombre, color);
	}

	
	public double calculararea() {
		return Math.PI*Math.pow(radio, 2);
	}
	
	public double calcularPerimetro() {
		return 2 * Math.PI * radio;
	}
	
	public void mostrarRadianes() {
		System.out.println("Solo estoy en la clase circulo");
		System.out.println("Los demás no pueden");
	}

	
}
