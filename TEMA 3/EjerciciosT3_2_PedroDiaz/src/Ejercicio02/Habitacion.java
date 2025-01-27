package Ejercicio02;

public class Habitacion {

	private double precio; 
	private String servicio;
	private String nombre;
	private int nDias;
	private boolean limpio;
	private double precioMinibar;
	private double precioExtra;
	private boolean ocupado;
	

	
	public Habitacion(double precio, String servicio, String nombre, int nDias, boolean limpio, double precioMinibar,
			double precioExtra, boolean ocuapado, boolean ocupado) {
		super();
		this.precio = precio;
		this.servicio = servicio;
		this.nombre = nombre;
		this.nDias = nDias;
		this.limpio = limpio;
		this.precioMinibar = precioMinibar;
		this.precioExtra = precioExtra;
		this.ocupado = ocupado;
	}



	public double getPrecio() {
		return precio;
	}



	public void setPrecio(double precio) {
		this.precio = precio;
	}



	public String getServicio() {
		return servicio;
	}



	public void setServicio(String servicio) {
		this.servicio = servicio;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getnDias() {
		return nDias;
	}



	public void setnDias(int nDias) {
		this.nDias = nDias;
	}



	public boolean isLimpio() {
		return limpio;
	}



	public void setLimpio(boolean limpio) {
		this.limpio = limpio;
	}



	public double getPrecioMinibar() {
		return precioMinibar;
	}



	public void setPrecioMinibar(double precioMinibar) {
		this.precioMinibar = precioMinibar;
	}



	public double getPrecioExtra() {
		return precioExtra;
	}



	public void setPrecioExtra(double precioExtra) {
		this.precioExtra = precioExtra;
	}



	public boolean isOcupado() {
		return ocupado;
	}



	public void setOcupado(boolean ocupado) {
		this.ocupado = ocupado;
	}



	@Override
	public String toString() {
		return "Habitacion [precio=" + precio + ", servicio=" + servicio + ", nombre=" + nombre + ", nDias=" + nDias
				+ ", limpio=" + limpio + ", precioMinibar=" + precioMinibar + ", precioExtra=" + precioExtra
				+ ", ocupado=" + ocupado + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
