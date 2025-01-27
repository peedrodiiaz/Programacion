//Hecho por Mauro
package controller;

import java.util.Random;

public class GeneradorRandom {
	
	public int generarRandom(int contadorPreguntas) {
		int desde=0, hasta=contadorPreguntas-1, generado;
		Random rnd=new Random(System.nanoTime());
		
		generado=rnd.nextInt(hasta-desde+1)+desde;
		
		return generado;
	}
	
	
}
