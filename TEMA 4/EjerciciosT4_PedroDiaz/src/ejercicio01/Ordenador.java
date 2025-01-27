package ejercicio01;

public class Ordenador {
//capacidad disco
//frecuencia
//precio base 
//marca
	
	private double capacidadDisco;
	private double frecuencia;
	private double precioBase;
	private String marca;
	
	
	@Override
	public String toString() {
		return "Ordenador [capacidadDisco=" + capacidadDisco + ", frecuencia=" + frecuencia + ", precioBase="
				+ precioBase + ", marca=" + marca + "]";
	}


	public Ordenador(double capacidadDisco, double frecuencia, double precioBase, String marca) {
		super();
		this.capacidadDisco = capacidadDisco;
		this.frecuencia = frecuencia;
		this.precioBase = precioBase;
		this.marca = marca;
	}


	public double getCapacidadDisco() {
		return capacidadDisco;
	}


	public void setCapacidadDisco(double capacidadDisco) {
		this.capacidadDisco = capacidadDisco;
	}


	public double getFrecuencia() {
		return frecuencia;
	}


	public void setFrecuencia(double frecuencia) {
		this.frecuencia = frecuencia;
	}


	public double getPrecioBase() {
		return precioBase;
	}


	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public double calcularPrecioVenta (double porcentaje) {
		return precioBase+(precioBase*(porcentaje/100));
	}

//calcular precio de venta al publico aplicando un porcentaje
}
