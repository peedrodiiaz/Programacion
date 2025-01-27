package ejemploobjetos;

import java.util.Random;

public class alumno3 {
	private int id;
	private String nombre;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "alumno3 [id=" + id + ", nombre=" + nombre + "]";
	}
	public alumno3(int id, String nombre) {
		super();
		this.id = id;
		this.nombre = nombre;
	}
	
	
	
	
	public double hacernotamedia(double []notas) {
		double suma=0;
		for (int i = 0; i < notas.length; i++) {
			suma+=notas[i];
			
		}
		return suma/notas.length;
	
	}
	
	//este metodo no deberia ir aqui, pero para no hacer la profesor lo hacemos aqui.
	public double [] introducirnota(int tam, int desde, int hasta) {
		double [] notas=new double [tam];
		Random r1=new Random(System.nanoTime());		
		for (int i = 0; i < notas.length ; i++) {
			notas[i]=r1.nextInt(hasta-desde+1)+desde;	
		}
	
		return notas;
	}


	
	
	
	
	
}
