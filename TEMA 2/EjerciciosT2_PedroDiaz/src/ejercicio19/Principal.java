package ejercicio19;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double salario;
		int sueldoFijo=1000;
		int porcentajeVentas;
		int numdeVentas;
		int pocentajeAñadir=20;
		int seguir;
		do {
			
			System.out.println("Indíca el número de ventas realizadas este mes");
			numdeVentas=Leer.datoInt();
			
			porcentajeVentas=numdeVentas*pocentajeAñadir;
			
			salario=sueldoFijo+porcentajeVentas;
			
			System.out.println("Salario total= "+salario);
				
			
			System.out.println("¿Quieres calcular otro salario?  1. SI   2.NO");
			
			seguir=Leer.datoInt();
			
			
			
		} while (seguir==1);
			System.out.println("Gracias.");
		
		

		
	}

}
