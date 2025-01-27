package ejemploobjetos;

public class Secretaria3 {
	private String nombreColegio;

	public String getNombreColegio() {
		return nombreColegio;
	}

	public void setNombreColegio(String nombreColegio) {
		this.nombreColegio = nombreColegio;
	}

	@Override
	public String toString() {
		return "Secretaria3 [nombreColegio=" + nombreColegio + "]";
	}

	public Secretaria3(String nombreColegio) {
		super();
		this.nombreColegio = nombreColegio;
	}
	
	

}
