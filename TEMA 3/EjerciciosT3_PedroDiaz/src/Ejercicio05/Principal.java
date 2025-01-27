package Ejercicio05;


import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int numRep;
		String frase;
		
		System.out.println("Indícame una frase");
		frase=Leer.dato();
		System.out.println("¿Cúantas veces quiere que se repita?");
		numRep=Leer.datoInt();
		
		Copiado c= new Copiado();
		
		c.repetirFrase(numRep,frase);
	}

}
