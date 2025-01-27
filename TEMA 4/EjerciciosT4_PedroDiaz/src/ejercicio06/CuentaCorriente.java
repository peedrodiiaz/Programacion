package ejercicio06;

public class CuentaCorriente extends Cuenta {

	private double manteniminetoFijo;
	private int puntos;
	public double getManteniminetoFijo() {
		return manteniminetoFijo;
	}
	public void setManteniminetoFijo(double manteniminetoFijo) {
		this.manteniminetoFijo = manteniminetoFijo;
	}
	public int getPuntos() {
		return puntos;
	}
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}
	@Override
	public String toString() {
		return "CuentaCorriente [manteniminetoFijo=" + manteniminetoFijo + ", puntos=" + puntos + "]";
	}
	public CuentaCorriente(double sueldo, double manteniminetoFijo, int puntos) {
		super(sueldo);
		this.manteniminetoFijo = manteniminetoFijo;
		this.puntos = puntos;
	}
	
	
	
}
