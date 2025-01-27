package ejemplo01;

public class Trabajador {

	private String nombre;
	private String puesto;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public Trabajador(String nombre, String puesto) {
		super();
		this.nombre = nombre;
		this.puesto = puesto;
	}
	@Override
	public String toString() {
		return "Trabajador [nombre=" + nombre + ", puesto=" + puesto + "]";
	}

	
	//Los metodos que sean reescritura tienen que ser exactemnte iguakles en todas las clcases poara qu eno sea sobreescritura
	
	
	
	public double calcularPaga () {
		double total;
		total=1000*200;
		total=total+350-10;
		total=total-total+20/100;
		
		return total;
		}
	
	
	
	
	
}
