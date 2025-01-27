package ejercicio;

public class Familia extends EntradaGeneral {

	private int numHijosCole;

	public int getNumHijosCole() {
		return numHijosCole;
	}

	public void setNumHijosCole(int numHijosCole) {
		this.numHijosCole = numHijosCole;
	}

	@Override
	public String toString() {
		return "Familia [numHijosCole=" + numHijosCole + "]";
	}

	public Familia(boolean arriba, int numFila, int numAsiento, double precioBasico, int numHijosCole) {
		super(arriba, numFila, numAsiento, precioBasico);
		this.numHijosCole = numHijosCole;
	}
	
	
	public double calcularPrecioEntrada(double descuento, double cantidadExtra) {
		if (numHijosCole>=3) {
		     return	super.calcularPrecioEntrada(descuento, cantidadExtra)-(getPrecioBasico()*(descuento/100));
		}else {
			return super.calcularPrecioEntrada(descuento,cantidadExtra);
		}
		
	}
	
	
	
}
