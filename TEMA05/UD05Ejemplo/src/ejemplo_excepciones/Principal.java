package ejemplo_excepciones;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=8,den=0;
		double resul=0.0;
		
		Scanner sc = new Scanner(System.in);
		
		try {
			System.out.println("Dime el denominador");
			den=Integer.parseInt(sc.nextLine());
			System.out.println("Dime el numerador");
			num= Integer.parseInt(sc.nextLine());
			resul=num/den;
			System.out.println(resul);
		} catch (ArithmeticException e) {
			System.err.println("El denominador no es ese");
		}
		
		
		
		
		
		
	}

}
