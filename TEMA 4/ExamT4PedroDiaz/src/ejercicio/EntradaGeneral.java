package ejercicio;


public class EntradaGeneral implements IDonativo{

	
	private boolean arriba;
	private int numFila;
	private int numAsiento;
	private double precioBasico;
	
	public boolean isArriba() {
		return arriba;
	}
	public void setArriba(boolean arriba) {
		this.arriba = arriba;
	}
	public int getNumFila() {
		return numFila;
	}
	public void setNumFila(int numFila) {
		this.numFila = numFila;
	}
	public int getNumAsiento() {
		return numAsiento;
	}
	public void setNumAsiento(int numAsiento) {
		this.numAsiento = numAsiento;
	}
	public double getPrecioBasico() {
		return precioBasico;
	}
	public void setPrecioBasico(double precioBasico) {
		this.precioBasico = precioBasico;
	}
	@Override
	public String toString() {
		return "EntradaGeneral [arriba=" + arriba + ", numFila=" + numFila + ", numAsiento=" + numAsiento
				+ ", precioBasico=" + precioBasico + "]";
	}
	public EntradaGeneral(boolean arriba, int numFila, int numAsiento, double precioBasico) {
		super();
		this.arriba = arriba;
		this.numFila = numFila;
		this.numAsiento = numAsiento;
		this.precioBasico = precioBasico;
	}


	public double calcularPrecioEntrada(double descuento,  double cantidadExtra) {
		double dinArriba = 3;
		double dinAbajo = 4;
		if (arriba) {
			return precioBasico+dinArriba;
		}else {
			return precioBasico+dinAbajo;
		}
	}
	@Override
	public double calcularDonativo(double descuento, double porcentajeDonativo, double cantidadExtra) {
		return calcularPrecioEntrada(descuento, cantidadExtra)*porcentajeDonativo/100;
	}



}
