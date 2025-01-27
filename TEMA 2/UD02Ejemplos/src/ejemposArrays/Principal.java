package ejemposArrays;

import utilidades.Leer;

public class Principal {
	public static void main(String[] args) {
		// 3 formas de declarar un array
		// Forma 1:
		int tam;
		int notas[];
		int sum = 0, resul, opcion, error;
		
		System.out.println("Diga el número de notas");
		
		tam = Leer.datoInt();
		
		notas = new int[tam];
		// Forma 2:
		// Tengo que conocer el tamaño
		// int edades2[] = new int [tam];
		// Forma 3: Inicializando con valores
		for (int i = 0; i < notas.length; i++) {
			
			System.out.println("Diga la nota " + (i + 1));
			notas[i] = Leer.datoInt();
			sum += notas[i];
			}
	
		
		resul = sum / tam;
		// imprimir un valor
		
		System.out.println("El valor es: " + resul);
		
		
		System.out.println("Te has equivocado en alguna no?\n1.Si\t2.No");
		
		opcion = Leer.datoInt();
		
		if (opcion == 1) {
			System.out.println("Nota erronea");
			error = Leer.datoInt();
			System.out.println("Escriba la nueva nota");
			notas[error - 1] = Leer.datoInt();
			System.out.println("Tu nueva nota es " + notas[error - 1]);

			for (int i = 0; i < tam; i++) {
				
				System.out.print(notas[i]+" ");
			}
			
		} else {
			
			System.out.println("Flama");
		}
	}
}

