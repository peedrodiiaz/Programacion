package ejercicio06;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// variables
		double nota1;
		double nota2;
		double nota3;
		double media;
		double aprobado=5;
		int numsuspensos=0;

		System.out.println("Introduce la primera nota: ");
		nota1 = Leer.datoDouble();
		System.out.println("Introduce la segunda nota: ");
		nota2 = Leer.datoDouble();
		System.out.println("Introduce la tercera nota: ");
		nota3 = Leer.datoDouble();

		media = (nota1 + nota2 + nota3) / 3;
		System.out.printf("La media es:%.2f ",media);
		if (media >= 5) {
			System.out.println("¡Aprobado!");
		} else {
			System.out.println("Suspendido.");
		}
		
		if (nota1<aprobado) {
			numsuspensos++;
		}
		if (nota2<aprobado) {
			numsuspensos++;
			
		}
		if (nota3<aprobado) {
			numsuspensos++;
		}
		System.out.println("El número de supensos es de "+numsuspensos);
	}

}
