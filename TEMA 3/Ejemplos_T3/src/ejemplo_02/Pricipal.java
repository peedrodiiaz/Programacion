package ejemplo_02;

import utilidades.Leer;

public class Pricipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double suma;
		int a;
		double b;
		Numero n= new Numero();
		System.out.println("Dime el primer num");
		a=Leer.datoInt();
		System.out.println("Dime el segundo num");
		b=Leer.datoDouble();
		suma=n.suma(a,b);
		System.out.println(n.suma(a, b));
		System.out.println(suma);
	
	
	
	}

}
