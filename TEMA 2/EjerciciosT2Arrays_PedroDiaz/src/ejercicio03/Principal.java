package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam=8;
		int enteros[];
		enteros=new int [tam];
		int num;
		double media;
		int suma=0;
		int contador=0;
		
		System.out.println("Bienvenido al programa");
		
		
		for (int i = 0; i < enteros.length; i++) {
			System.out.println("Indica el número "+(i+1));
			num=Leer.datoInt();
			enteros[i]=num;	
			suma+=num;		
			
		}
		
		media=suma/enteros.length;
		
		System.out.println(media);
		
		for (int i = 0; i < enteros.length; i++) {
			if (enteros[i]==0) {
				contador++;
			}
		}
		
		System.out.println("Hay un total de "+contador+" n0");
	}

}
