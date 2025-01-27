package practica_examen;

public class Vehiculo {
	private String tipo;
	private String modelo;
	private String matricula;
	private double precio;
	private boolean estado;
	private int vastidor;
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public int getVastidor() {
		return vastidor;
	}
	public void setVastidor(int vastidor) {
		this.vastidor = vastidor;
	}
	@Override
	public String toString() {
		return "Vehiculo [tipo=" + tipo + ", modelo=" + modelo + ", matricula=" + matricula + ", precio=" + precio
				+ ", estado=" + estado + ", vastidor=" + vastidor + "]";
	}
	public Vehiculo(String tipo, String modelo, String matricula, double precio, boolean estado, int vastidor) {
		super();
		this.tipo = tipo;
		this.modelo = modelo;
		this.matricula = matricula;
		this.precio = precio;
		this.estado = estado;
		this.vastidor = vastidor;
	}

	
	public double calcularPrecioDIA (int numDias) {
		return precio*numDias;
	}
	
	
}

