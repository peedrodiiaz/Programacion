package ejercicio04;

public class LineadeVenta {

	private	Producto p = new Producto();
	private int numProductos;

	public Producto getP() {
		return p;
	}
	public void setP(Producto p) {
		this.p = p;
	}
	public int getNumProductos() {
		return numProductos;
	}
	public void setNumProductos(int numProductos) {
		this.numProductos = numProductos;
	}
	@Override
	public String toString() {
		return "LineadeVenta [p=" + p + ", numProductos=" + numProductos + "]";
	}
	public LineadeVenta(Producto p, int numProductos) {
		super();
		this.p = p;
		this.numProductos = numProductos;
	}
	
	public double calcularSubTotal (int iva, int descuento, int topeCaducidad) {
		return p.calcularPVP(iva,descuento,topeCaducidad)*numProductos;
	}
	
	
	
	
	
	
}
