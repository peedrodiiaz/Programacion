package ejercicio;

public class Magdalena {
	private int id;
	private String sabor;
	private boolean tipo;
	private double volumen;
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSabor() {
		return sabor;
	}
	public void setSabor(String sabor) {
		this.sabor = sabor;
	}
	public boolean isTipo() {
		return tipo;
	}
	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	public double getVolumen() {
		return volumen;
	}
	public void setVolumen(double volumen) {
		this.volumen = volumen;
	}
	@Override
	public String toString() {
		return "Magdalena [id=" + id + ", sabor=" + sabor + ", tipo=" + tipo + ", volumen=" + volumen + "]";
	}
	public Magdalena(int id, String sabor, boolean tipo, double volumen) {
		super();
		this.id = id;
		this.sabor = sabor;
		this.tipo = tipo;
		this.volumen = volumen;
	}
	
	
	
	
	
	
	
}
