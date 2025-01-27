package ejemplofor;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int tope;
		
		System.out.println("¿Cuántas veces quieres hacerlo?");
		tope = Leer.datoInt();
		for (int i=0;i<tope;i++) {
			System.out.println("Viva el Real Betis Balompié");
			
		}

	}

}
