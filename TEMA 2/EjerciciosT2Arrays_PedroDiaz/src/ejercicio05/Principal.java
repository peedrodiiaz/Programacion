package ejercicio05;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		// TODO Auto-generated method stub

		int tam, desde, hasta, suma = 0, mayor = 0, menor = 0, valorCambiar, nuevoValor;

		int entero[];

		Random num = new Random(System.nanoTime());

		System.out.println("Bienvenido al programa");
		System.out.println("Indicame el tamaño de la tabla");

		tam = Leer.datoInt();

		entero = new int[tam];

		System.out.println("Dime el numero menor de la tabla de números aleatorios");

		desde = Leer.datoInt();

		System.out.println("Ahora indicame el mayor");

		hasta = Leer.datoInt();

		for (int i = 0; i < entero.length; i++) {

			entero[i] = num.nextInt(hasta - desde + 1) + desde;

			suma += entero[i];

		}

		System.out.println("La suma de los numeros aleatorios es " + suma);

		for (int i = 0; i < entero.length; i++) {

			System.out.println(entero[i]);

		}
		System.out.println();
		menor = entero[0];
		mayor = entero[0];
		for (int i = 0; i < entero.length; i++) {

			if (entero[i] > mayor) {
				mayor = entero[i];
			}

			if (entero[i] < menor) {

				menor = entero[i];
			}
		}

		System.out.println();

		System.out.println(mayor);

		System.out.println(menor);

		do {

			System.out.println("¿Qué valor quieres cambiar?");

			valorCambiar = Leer.datoInt();

		} while (valorCambiar < 0 || valorCambiar > entero.length);

		System.out.println("¿Por qué valor lo quienes cambiar");

		nuevoValor = Leer.datoInt();

		entero[valorCambiar - 1] = nuevoValor;

		for (int i = 0; i < entero.length; i++) {

			System.out.println(entero[i]);

		}

		System.out.println("Programa acabado");

	}

}