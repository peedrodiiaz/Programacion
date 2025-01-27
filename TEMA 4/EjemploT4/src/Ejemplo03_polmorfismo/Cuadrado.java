package Ejemplo03_polmorfismo;

public class Cuadrado extends Figura {

	private double lado;

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	@Override
	public String toString() {
		return "Cuadrado [lado=" + lado + "]";
	}

	public Cuadrado(String nombre, String color) {
		super(nombre, color);
	}

	public Cuadrado(String nombre, String color, double lado) {
		super(nombre, color);
		this.lado = lado;
	}

	public double calculararea() {
		return lado*lado;
		
	}
	
	public double calcularPerimetro() {
		int numLado=4;
		return lado*numLado;
	}
	public void mostrarLado() {
		System.out.println("Solo estoy en la clase cuadrado y tengo 4 lados");
	}
	
}
