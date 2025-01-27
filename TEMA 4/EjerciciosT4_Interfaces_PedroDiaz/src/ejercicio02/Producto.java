package ejercicio02;

public class Producto implements IImpuesto {

	private String nombre;
	private double precio;
	
	public Producto(String nombre, double precio) {
		super();
		this.nombre = nombre;
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [nombre=" + nombre + "]";
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public double calcularIva( int iva) {
		return  precio*iva/100;
	}

	public double calcularPVP() {
		return precio+10;
	}
	
	
	@Override
	public double calculoIrpf(double sueldo) {
		return 0;
	}

}
