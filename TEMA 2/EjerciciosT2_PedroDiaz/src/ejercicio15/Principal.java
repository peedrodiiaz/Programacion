package ejercicio15;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numTabla;
		int res;
		System.out.println("Hola, vamos a hacer una tabla de mutiplicar");
		
		System.out.println("Indica un número");
		
		numTabla=Leer.datoInt();
		
		for (int i = 0; i <= 10; i++) {
			res=numTabla*i;
			System.out.println(numTabla+" x "+i+" = "+res);			
		}
		
		
		
		
	}

}
