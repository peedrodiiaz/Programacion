package ejercicio;

public class Vip extends EntradaGeneral {

	private String nombrePersImpor;

	public String getNombrePersImpor() {
		return nombrePersImpor;
	}

	public void setNombrePersImpor(String nombrePersImpor) {
		this.nombrePersImpor = nombrePersImpor;
	}

	@Override
	public String toString() {
		return "Vip [nombrePersImpor=" + nombrePersImpor + "]";
	}

	public Vip(boolean arriba, int numFila, int numAsiento, double precioBasico, String nombrePersImpor) {
		super(arriba, numFila, numAsiento, precioBasico);
		this.nombrePersImpor = nombrePersImpor;
	}
	
	
	public double calcularPrecioEntrada(double descuento, double cantidadExtra) {
		return super.calcularPrecioEntrada(descuento,0)+cantidadExtra;
		
	}
	
	public void valeConsumicion() {
		System.out.println("Consumición gratis para " + nombrePersImpor);
	}
	
	
	
}
