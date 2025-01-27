package Ejemplo03_polmorfismo;

public abstract class Figura {

	private String nombre,color;

	public Figura(String nombre, String color) {
		super();
		this.nombre = nombre;
		this.color = color;
	}

	public Figura() {
		super();
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getColor() {
		return color;
	}

	@Override
	public String toString() {
		return "Figura [nombre=" + nombre + ", color=" + color + "]";
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public abstract double calculararea();
	public abstract double calcularPerimetro();

	public void metodoSoloDeFigura() {
		System.out.println("Hola soy una figura, solo de la clase figura");
	}
}
