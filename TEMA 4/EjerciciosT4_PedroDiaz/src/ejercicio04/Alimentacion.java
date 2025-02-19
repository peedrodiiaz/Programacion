package ejercicio04;

public class Alimentacion extends Producto {

	private boolean refrigerado;
	private int diasCaducidad;
	
	public boolean isRefrigerado() {
		return refrigerado;
	}
	public void setRefrigerado(boolean refrigerado) {
		this.refrigerado = refrigerado;
	}
	public int getDiasCaducidad() {
		return diasCaducidad;
	}
	public void setDiasCaducidad(int diasCaducidad) {
		this.diasCaducidad = diasCaducidad;
	}
	@Override
	public String toString() {
		return "Alimentacion [refrigerado=" + refrigerado + ", diasCaducidad=" + diasCaducidad + "]";
	}
	public Alimentacion(double precioUnitario, String nombre, int id, boolean refrigerado, int diasCaducidad) {
		super(precioUnitario, nombre, id);
		this.refrigerado = refrigerado;
		this.diasCaducidad = diasCaducidad;
	}
	
	
	public double calcularPVP(int iva, int descuento, int numDiasProducto) {
		
		if (diasCaducidad>numDiasProducto) {
			return super.calcularPVP(iva, descuento, numDiasProducto)-super.calcularPVP(iva, descuento, numDiasProducto)*descuento/100;
		}else {
			return super.calcularPVP(iva, descuento, numDiasProducto);
		}
		
	}
	
	public void mostrarAviso(int diasAviso) {
		
		if (diasCaducidad<diasAviso) {
			System.out.println("El producto esta a punto de caducar");
		
		
	}
	
}
}
