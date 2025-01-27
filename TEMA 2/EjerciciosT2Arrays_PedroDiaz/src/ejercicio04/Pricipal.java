package ejercicio04;

import java.util.Random;

import utilidades.Leer;

public class Pricipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam=10, chico=1, mayor=99, buscar, suma=0;
		int numeros[] = new int [tam];
		double media;
		Random num= new Random(System.nanoTime());
		
		System.out.println("Bienvendio al programa");
		
		
		for (int i = 0; i < numeros.length; i++) {
			
			numeros[i]=num.nextInt(mayor-chico+1)+chico;			
			suma+=numeros[i];
		}
		media=suma/numeros.length;
		
		System.out.println("¿Qué número quiere ver?");
		buscar=Leer.datoInt();
		
		System.out.println(numeros[buscar-1]); 
		
		System.out.println("La suma es "+ suma);
		System.out.println();
		System.out.printf("La media es %.2f", media);
		
		
		
		
		
		
	}

}
