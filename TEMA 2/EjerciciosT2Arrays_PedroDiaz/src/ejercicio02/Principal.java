package ejercicio02;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam=10;
		int enteros[];
		enteros=new int [tam];
		int num;
		int respuesta;
		int elementCambiar;
		int numCambiar;
		
	
		System.out.println("Bienvenido al programa");
		
		for (int i = 0; i < enteros.length; i++) {
			System.out.println("Indicame otro número para multiplar por 2");
			num=Leer.datoInt();
			enteros[i]=num*2;
			
		
		}
		for (int i = 0; i < enteros.length; i++) {
			System.out.println(enteros[i]);
		}
		
		System.out.println("¿Deseas cambiar el resultado de algún elemento? 1. SI 2. NO");
		respuesta=Leer.datoInt();
		
		while (respuesta!=2) {
			
		 {
			System.out.println("¿Qué elemento quieres cambiar?");
			elementCambiar=Leer.datoInt();
			System.out.println("¿Por qúe numero lo vas a cambiar?");
			numCambiar=Leer.datoInt();
			enteros[elementCambiar-1]=numCambiar*2;
			System.out.println();
			
			for (int i = 0; i < enteros.length; i++) {
				System.out.println(enteros[i]);
						
			}
			System.out.println("¿Deseas cambiar el resultado de algún elemento? 1. SI 2. NO");
			respuesta=Leer.datoInt();	
			
		 }
				
	}
			System.out.println("Gracias por usar el programa");
	}
}
