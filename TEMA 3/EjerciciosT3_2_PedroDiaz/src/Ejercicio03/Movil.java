package Ejercicio03;

public class Movil {

	private String marca;
	private String modelo;
	private boolean vendido;
	private boolean nuevo;
	private double precioUni;
	
	public Movil(String marca, String modelo, boolean vendido, boolean nuevo, double precioUni) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.vendido = vendido;
		this.nuevo = nuevo;
		this.precioUni = precioUni;
	}
	@Override
	public String toString() {
		return "Movil [marca=" + marca + ", modelo=" + modelo + ", vendido=" + vendido + ", nuevo=" + nuevo
				+ ", precioUni=" + precioUni + "]";
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public boolean isVendido() {
		return vendido;
	}
	public void setVendido(boolean vendido) {
		this.vendido = vendido;
	}
	public boolean isNuevo() {
		return nuevo;
	}
	public void setNuevo(boolean nuevo) {
		this.nuevo = nuevo;
	}
	public double getPrecioUni() {
		return precioUni;
	}
	public void setPrecioUni(double precioUni) {
		this.precioUni = precioUni;
	}
}
