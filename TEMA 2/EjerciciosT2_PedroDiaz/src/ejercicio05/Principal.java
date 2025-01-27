package ejercicio05;

import ejercicio02.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables
		double numero, exponente, resultado;
		
		
		System.out.println("Indicame un número");
		numero=Leer.datoDouble();
		
		System.out.println("Indicame un exponente");
		exponente=Leer.datoDouble();
		
		
		
		if (exponente>=0) {
			
			resultado=Math.pow(numero, exponente);
			System.out.printf("%.2f",resultado);
			
			
			
		}else { resultado=1/Math.pow(numero, -exponente);
			System.out.printf("El resultado es %.2f", resultado);
		
		}
	}
}
			
		
	



