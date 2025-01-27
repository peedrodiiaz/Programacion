package ejemploArrays3;



import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam;
		int edades[];
		System.out.println("Diga el tamaño");
		tam=Leer.datoInt();		
		edades=new int [tam];
		Random rnd=new Random(System.nanoTime());
		int hasta;
		int desde;
		int buscar;
		int contNum=0;
		int suma=0;
		double media;
		
		
		//rellenamos
		System.out.println("Diga el número más chico");
		desde=Leer.datoInt();
		System.out.println("Diga el mayor");
		hasta=Leer.datoInt();
		for (int i = 0; i < edades.length; i++) {
			
			edades[i]=rnd.nextInt(hasta-desde+1)+desde;
			
		}
		
		for (int valor : edades) {
			System.out.print(valor+"\t");
		}
		System.out.println("\nDiga el numero que quiere buscar");
		buscar=Leer.datoInt();
		
		for (int i = 0; i < edades.length; i++) {
			if (edades[i]==buscar) {
				contNum++;
				
			}

		}
		
		System.out.println("Hay "+contNum+" numeros "+buscar);
		
		
		for (int i = 0; i < edades.length; i++) {
			suma+=edades[i];
		}
		
		media=suma/edades.length;
		
		System.out.println(media);
	}

}
