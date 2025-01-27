package ejercicio16;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int suma = 0;

		int producto = 1;

		System.out.println("Ingrese 10 números:");

		for (int i = 1; i <= 10; i++) {

			System.out.print("Número " + i + ": ");

			int numero = Leer.datoInt();

			suma += numero;

			producto *= numero;

		}

		System.out.println("La suma de los 10 números es: " + suma);

		System.out.println("El producto de los 10 números es: " + producto);

	}

}