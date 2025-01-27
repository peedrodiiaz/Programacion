package Ejercicio01;

public class Producto {
	private double precioFabrica;
	private int id;
	private int seccion;
	private String nombre;
	private boolean fragil;
	public double getPrecioFabrica() {
		return precioFabrica;
	}
	public void setPrecioFabrica(double precioFabrica) {
		this.precioFabrica = precioFabrica;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getSeccion() {
		return seccion;
	}
	public void setSeccion(int seccion) {
		this.seccion = seccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isFragil() {
		return fragil;
	}
	public void setFragil(boolean fragil) {
		this.fragil = fragil;
	}
	@Override
	public String toString() {
		return "Producto [precioFabrica=" + precioFabrica + ", id=" + id + ", seccion=" + seccion + ", nombre=" + nombre
				+ ", fragil=" + fragil + "]";
	}
	public Producto(double precioFabrica, int id, int seccion, String nombre, boolean fragil) {
		super();
		this.precioFabrica = precioFabrica;
		this.id = id;
		this.seccion = seccion;
		this.nombre = nombre;
		this.fragil = fragil;
	}
	
	
	public double calcularPrecioCoste(double trasporte) {
		double divisior=100;
		
		return precioFabrica+precioFabrica*trasporte/divisior;
		
		
	}
	
}
