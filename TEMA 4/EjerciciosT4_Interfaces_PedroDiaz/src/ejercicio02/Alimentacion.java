package ejercicio02;

public class Alimentacion extends Producto {
	public Alimentacion(String nombre, double precio) {
		super(nombre, precio);
		// TODO Auto-generated constructor stub
	}

	
	public double calcularPVP() {
		return super.calcularPVP()+calcularIva(21);
	}
	
}

