package Ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int numero;
		System.out.println("Dime un número");
		numero=Leer.datoInt();
        Operaciones o=new Operaciones();
        o.posNeg(numero);
        o.imprimiRes(o.posNeg(numero));

        o.ParImp2(numero);
        o.devolver(o.ParImp2(numero));
	
		}

}
