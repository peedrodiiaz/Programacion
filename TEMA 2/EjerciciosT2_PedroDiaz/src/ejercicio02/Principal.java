package ejercicio02;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Variables
		double numerador;
		double denominador;
		double resultado;
		System.out.println("Indicam el primer número");

		numerador=Leer.datoDouble();
		System.out.println("Indicame el segundo número");
		denominador=Leer.datoDouble();		
	
		if (denominador==0) {
			System.out.println("Error no se puede dividir entre 0");
		}else {
			resultado=numerador/denominador;
			System.out.printf("El resultado es %.2f\n", resultado);
		}
		
		System.out.println("chao");
	}

}
