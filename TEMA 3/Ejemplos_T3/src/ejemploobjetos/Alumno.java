package ejemploobjetos;

public class Alumno {

	private String nombre;
	private String apellido;
	private double notaPro;
	private double notaSis;
	
	public Alumno(String nombre, String apellido, double notaPro, double notaSis) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.notaPro = notaPro;
		this.notaSis = notaSis;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public double getNotaPro() {
		return notaPro;
	}
	public void setNotaPro(double notaPro) {
		this.notaPro = notaPro;
	}
	public double getNotaSis() {
		return notaSis;
	}
	public void setNotaSis(double notaSis) {
		this.notaSis = notaSis;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido=" + apellido + ", notaPro=" + notaPro + ", notaSis=" + notaSis
				+ "]";
	}
	
	public double calcularMedia() {
		double dos=2;
		return (notaPro+notaSis)/dos;
		
	}
	
	
	
}
