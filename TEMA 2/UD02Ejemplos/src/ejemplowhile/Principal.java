package ejemplowhile;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int contador = 0;
		int tope;
		
		
		System.out.println("Cuántas veces el bucle:");
		tope = Leer.datoInt();
		while(contador < tope) {
			System.out.println("Soy la caña");
			contador++;
		}
		System.out.println("Bye");
	}

}
