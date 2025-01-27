package ejercicio21;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int opcion;
		double num1;
		double num2;
		double res;
		
		
		do {
			
		System.out.println("Bienvenido a la calculadora");
		System.out.println("Seleciona una opción");
		System.out.println("1. SUMA");
		System.out.println("2. RESTA");
		System.out.println("3. DIVISIÓN");
		System.out.println("4. MULTIPLICACIÓN");
		System.out.println("5. INDICA SI ES PAR O IMPAR");
		System.out.println("\n");
		System.out.println("0. Salir");
		opcion=Leer.datoInt();
		switch (opcion) {
			case 1:
				System.out.println("Dame el primer número");
				num1=Leer.datoDouble();
				System.out.println("2.Dame el segundo número");
				num2=Leer.datoDouble();
				
				res=num1+num2;
				System.out.println("El resultado es "+res);
				
				break;
	
			case 2:	
				System.out.println("Dame el primer número");
				num1=Leer.datoDouble();
				System.out.println("2.Dame el segundo número");
				num2=Leer.datoDouble();
				
				res=num1-num2;
				System.out.println("El resultado es "+res);
				break;
			case 3:
				System.out.println("Dame el primer número");
				num1=Leer.datoDouble();
				System.out.println("2.Dame el segundo número");
				num2=Leer.datoDouble();
				
				res=num1/num2;
				System.out.println("El resultado es "+res);
				break;
			case 4:
				System.out.println("Dame el primer número");
				num1=Leer.datoDouble();
				System.out.println("2.Dame el segundo número");
				num2=Leer.datoDouble();
				
				res=num1*num2;
				System.out.println("El resultado es "+res);
				break;
			case 5:
				System.out.println("Dame el un número");
				num1=Leer.datoDouble();
			
				res=num1%2;
				
				if (res==0) {
					System.out.println("El número "+num1+" es par");
				}else {
					System.out.println("El número es impar");
				}
				break;
				
			case 0:
				System.out.println("Saliendo");
				break;
			default:
				System.out.println("Error, opción no valida");
				break;
			}
		
		
		
		
		
		
		} while (opcion!=0);
		System.out.println("Gracias por usar el programa");
		
	}

}
