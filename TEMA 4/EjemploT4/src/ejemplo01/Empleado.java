package ejemplo01;

public class Empleado extends Trabajador{

	private double sueldo;
	private double impuestos;
	
	
	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	public double getImpuestos() {
		return impuestos;
	}

	@Override
	public String toString() {
		return "Empleado [sueldo=" + sueldo + ", impuestos=" + impuestos + "]";
	}

	public void setImpuestos(double impuestos) {
		this.impuestos = impuestos;
	}

	public Empleado(String nombre, String puesto, double sueldo, double impuestos) {
		super(nombre, puesto);
		this.sueldo = sueldo;
		this.impuestos = impuestos;
		// Este constructor tiene los parametros de esta clase y de la madre con el super llama a los atributos de la madre.
	}

	public double calcularPaga () {
				
		return sueldo-impuestos;
	}
	
}
