package ejemploobjetos;

public class Secretaria {

	private String nombreColergio;
	private Alumno a; //primera vez que el atributo de una clase no es básico, es el tipo de la clase Alumno
	public Secretaria(String nombreColergio, Alumno a) {
		super();
		this.nombreColergio = nombreColergio;
		this.a = a;
	}
	public String getNombreColergio() {
		return nombreColergio;
	}
	public void setNombreColergio(String nombreColergio) {
		this.nombreColergio = nombreColergio;
	}
	public Alumno getA() {
		return a;
	}
	public void setA(Alumno a) {
		this.a = a;
	}
	@Override
	public String toString() {
		return "Secretaria [nombreColergio=" + nombreColergio + ", a=" + a + "]";
	}
	
	public double calcularMediav2() {
		//double dos=2;
		// opción 1 return (a.getNotaPro()+a.getNotaSis())/dos;
		//opocion 2 y mejor
		return a.calcularMedia();

		
		
	}
}
