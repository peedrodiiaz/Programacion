package ejemploGetSET;

public class Animal {
	private String nombre;
	private double peso;
	private int numpatas;
	private int edad;
	private boolean mamifero;
	
	
		
	public Animal(String nombre, double peso, int numpatas, int edad, boolean mamifero) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.numpatas = numpatas;
		this.edad = edad;
		this.mamifero = mamifero;
	}

	
	public String toString() {
		return "Animal [nombre=" + nombre + ", peso=" + peso + ", numpatas=" + numpatas + ", edad=" + edad
				+ ", mamifero=" + mamifero + "]";
	}
	

	public Animal() {
		
	}


	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public int getNumpatas() {
		return numpatas;
	}
	public void setNumpatas(int numpatas) {
		this.numpatas = numpatas;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	//ante la duda devolvemos, si nos dice que no lo devuelve lo hacemos igual pero con void y sin devolver.
	public int cambiarEdad(int cantidad) {
		edad+=cantidad;
		return edad;
	}
	public int cambiarEdad (int cantidad, String nombre) {
		return edad;
	}
	
	//cuando es boolenao se le pone al  get is.
	public boolean isMamifero() {
		return mamifero;
	}
	public void setMamifero(boolean mamifero) {
		this.mamifero = mamifero;
	}

	
	

}
