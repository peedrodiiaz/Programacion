package ejemploobjetos;

public class Secretaria2 {

	private String nombreColegio;

	public Secretaria2(String nombreColegio) {
		super();
		this.nombreColegio = nombreColegio;
	}

	public String getNombreColegio() {
		return nombreColegio;
	}

	public void setNombreColegio(String nombreColegio) {
		this.nombreColegio = nombreColegio;
	}

	@Override
	public String toString() {
		return "Secretaria2 [nombreColegio=" + nombreColegio + "]";
	}
	
	//As� no
	public double  calcularMediav3() {

		Alumno a= new Alumno("Pedro","D�az" , 8, 4);
		return a.calcularMedia();
		
	}
	//As� tamooco
	
	public double calcularMediav4(String nombre,String Apellido, double Notasis, double notaPro){
	
		double dos=2;
		return Notasis+notaPro/dos;
		

	}
	//este s�
	public double calcularMediav5(Alumno a) {
		return a.calcularMedia();
		
	}
	
	
}
