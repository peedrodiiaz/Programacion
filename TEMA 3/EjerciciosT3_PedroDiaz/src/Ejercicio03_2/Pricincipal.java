package Ejercicio03_2;

import utilidades.Leer;

public class Pricincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		System.out.println("Dime un número");
		numero=Leer.datoInt();
		
		Operaciones o= new Operaciones();
		o.devolver(o.posNeg(numero));
		o.delvolverParidad(o.parImp(numero));
		
	}

}
