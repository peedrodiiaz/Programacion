package ejemploif;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int edad, mayoria = 18;
		double saldo;

		System.out.println("¿Cuál es tu edad?");
		edad = Leer.datoInt();
		System.out.println("¿Qué saldo tienes?");
		saldo = Leer.datoDouble();
		if (edad >= mayoria) {
			if (saldo >= 100) {
				System.out.println("Adelante");
			} else {
				System.out.println("Ve al cajero y saca dinero");
			}

		} else {
			System.out.println("No puedes pasar");
		}
		System.out.println("Adiós");
	}

}
