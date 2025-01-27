package ejemplo01;

public class Producto {

	private double precioBase;
	private boolean esRefrigerado;
	private String nombreString;
	public double getPrecioBase() {
		return precioBase;
	}
	public void setPrecioBase(double precioBase) {
		this.precioBase = precioBase;
	}
	public boolean isEsRefrigerado() {
		return esRefrigerado;
	}
	public void setEsRefrigerado(boolean esRefrigerado) {
		this.esRefrigerado = esRefrigerado;
	}
	public String getNombreString() {
		return nombreString;
	}
	public void setNombreString(String nombreString) {
		this.nombreString = nombreString;
	}
	@Override
	public String toString() {
		return "Producto [precioBase=" + precioBase + ", esRefrigerado=" + esRefrigerado + ", nombreString="
				+ nombreString + "]";
	}
	public Producto(double precioBase, boolean esRefrigerado, String nombreString) {
		super();
		this.precioBase = precioBase;
		this.esRefrigerado = esRefrigerado;
		this.nombreString = nombreString;
	}
	
	
	
	
	
}
