package ejercicio17;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int numAsignaturas = 6;

		double media;

		double suma = 0;

		double nota;

		int suspensos = 0;

		for (int i = 0; i < numAsignaturas; i++) {

			System.out.println("Indica la nota de la asignatura " + (i + 1));

			nota = Leer.datoDouble();

			suma = suma + nota;

			if (nota < 5) {

				suspensos++;

			}

		}

		media = suma / numAsignaturas;

		System.out.printf("El número de suspensos es: %d y la media es %.0f", suspensos, media);

	}

}
