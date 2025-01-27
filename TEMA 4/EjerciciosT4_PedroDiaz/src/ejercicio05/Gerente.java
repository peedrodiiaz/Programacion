package ejercicio05;

public class Gerente extends Empleado {

	private double porcentajeReduccion;

	public double getPorcentajeReduccion() {
		return porcentajeReduccion;
	}

	public void setPorcentajeReduccion(double porcentajeReduccion) {
		this.porcentajeReduccion = porcentajeReduccion;
	}

	@Override
	public String toString() {
		return "Gerente [porcentajeReduccion=" + porcentajeReduccion + "]";
	}

	public Gerente(String nombre, String apellidos, double sueldoBase, int numEmpleado, double porcentajeReduccion) {
		super(nombre, apellidos, sueldoBase, numEmpleado);
		this.porcentajeReduccion = porcentajeReduccion;
	}
	
	public  double calcularSueldo() {
		return super.calcularSueldo()-super.calcularSueldo()*porcentajeReduccion/100;
	}

	
	
}
