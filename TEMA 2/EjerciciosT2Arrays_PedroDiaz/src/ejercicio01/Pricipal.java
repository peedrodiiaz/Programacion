package ejercicio01;

import utilidades.Leer;

public class Pricipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam=5;
		String nombre[];
		nombre=new String[tam];
		
		System.out.println("Bienvenido al programa");
		
		for (int i = 0; i < nombre.length; i++) {
			System.out.println("Indica el nombre de cada persoana");
			nombre[i]=Leer.dato();
		}
		
		for (int i = 0; i < nombre.length; i++) {
			System.out.print(nombre[i]+"\t");
		}
		
		
		
	}

}
