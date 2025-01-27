package ejercicio06;
import java.util.Random;

import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double numeros[];
		int tam=12, opcion;
		String meses[]= {"enero","febrero","Marzo","Abril","Mayo","Junio","Julio","Agosto","Septimbre","Octubre","Noviembre","Diciembre"};
		Random num=new Random(System.nanoTime());
		
		do {
		System.out.println("Bienvenido al programa");
		numeros=new double [tam];
		
		
			for (int i = 0; i < meses.length; i++) {
				System.out.printf(" %s ",meses[i]);
			}
			System.out.println("\n-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
			
			for (int i = 0; i < numeros.length; i++) {
				numeros[i]=num.nextDouble();
			}
			for (int i = 0; i < numeros.length; i++) {
				System.out.printf("  %.2f  ",numeros[i]);
			}
			System.out.println("\n 1. Para repetir 2. Para salir");
			opcion=Leer.datoInt();
		} while (opcion!=2); {
		System.out.println("Gracias por usar el programa");
	}

}
}