package Ejercicio03_2;

public class Operaciones {

	public boolean posNeg ( int num) {
		boolean res;
		if (num <=0) {
			res=false;
		}else {
			res=true;
		}
		return res;
	}
	
	public void devolver(boolean res) {
		if (res) {
			System.out.println("Es positivo");
		}else {
			System.out.println("Es negativo");
		}
	}
		
	
	public boolean parImp (int num) {
		boolean res;
		if (num %2 == 0) {
			res=true;
		}else {
			res=false;
		}
		return res;
	}
	
	public void delvolverParidad(boolean res) {
		if (res) {
			System.out.println("Es par");
		}else {
			System.out.println("Es impar");
		}
	}
	
}
