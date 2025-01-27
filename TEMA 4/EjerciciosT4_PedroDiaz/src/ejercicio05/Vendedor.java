package ejercicio05;

public class Vendedor extends Empleado{

	private int cantidadVenta;
	public double incentivo;
	public int getCantidadVenta() {
		return cantidadVenta;
	}
	public void setCantidadVenta(int cantidadVenta) {
		this.cantidadVenta = cantidadVenta;
	}
	public double getIncentivo() {
		return incentivo;
	}
	public void setIncentivo(double incentivo) {
		this.incentivo = incentivo;
	}
	public Vendedor(String nombre, String apellidos, double sueldoBase, int numEmpleado, int cantidadVenta,
			double incentivo) {
		super(nombre, apellidos, sueldoBase, numEmpleado);
		this.cantidadVenta = cantidadVenta;
		this.incentivo = incentivo;
	}
	@Override
	public String toString() {
		return "Vendedor [cantidadVenta=" + cantidadVenta + ", incentivo=" + incentivo + "]";
	}
	
	public double calcularIncentivo(){
		return cantidadVenta*incentivo/100;
	}
	
	public double calcularSueldo() {
		return	super.calcularSueldo()+calcularIncentivo();
	
	}
	
	public void felicitacion(int cantidad) {
		
		if (cantidadVenta>cantidad) {
			System.out.println("Enhorabuena has cumplido el objetivo");
		}
		
	}
	
	
}
