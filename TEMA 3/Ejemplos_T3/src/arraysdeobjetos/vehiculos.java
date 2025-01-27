package arraysdeobjetos;

public class vehiculos {

	private String modelo;
	private double potencia;
	
	
	public vehiculos() {
		super();
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public double getPotencia() {
		return potencia;
	}
	public void setPotencia(double potencia) {
		this.potencia = potencia;
	}
	@Override
	public String toString() {
		return "vehiculos [modelo=" + modelo + ", potencia=" + potencia + "]";
	}
	public vehiculos(String modelo, double potencia) {
		super();
		this.modelo = modelo;
		this.potencia = potencia;
	}







}
