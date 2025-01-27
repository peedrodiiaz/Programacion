package ejemplo02_figura;

public abstract class Figura {
	private String color;
	
	public Figura(String color) {
		super();
		this.color = color;
	}

	@Override
	public String toString() {
		return "Figura [color=" + color + "]";
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public abstract double calcularArea(); 
	
	public void imprimirDetalles() {
		System.out.println("Soy una figura");
	}
	
}
