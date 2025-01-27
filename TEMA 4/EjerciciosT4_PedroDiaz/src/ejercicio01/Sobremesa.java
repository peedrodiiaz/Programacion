package ejercicio01;

public class Sobremesa extends Ordenador {
//precio montaje
	private double precioMontaje;

	@Override
	public String toString() {
		return "Sobremesa [precioMontaje=" + precioMontaje + "]";
	}



	public Sobremesa(double capacidadDisco, double frecuencia, double precioBase, String marca, double precioMontaje) {
		super(capacidadDisco, frecuencia, precioBase, marca);
		this.precioMontaje = precioMontaje;
	}



	public double getPrecioMontaje() {
		return precioMontaje;
	}

	public void setPrecioMontaje(double precioMontaje) {
		this.precioMontaje = precioMontaje;
	}

	public double calcularPrecioVenta (double porcentaje) {
		return super.calcularPrecioVenta(porcentaje)+precioMontaje;
	}

}
