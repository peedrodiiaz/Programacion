package Ejercicio03;

public class Operaciones {

	public boolean posNeg (int numero) {
		boolean res;
		if (numero >= 0) {
	            res=true;
	      } else {
	            res=false;
	     }
		return res;
		
		}

	public void imprimiRes (boolean res) {
	 if (res) {
		System.out.println("Numero positivo");
	 }else {
		System.out.println("El numero es negativo");
	}
}
	
    
    public boolean ParImp2 (int numero) {
    	boolean res;
    	if (numero%2 == 0) {
			res=true;
		}else {
			res=false;
		}
    	return res;
    	
    }
    
    public void devolver (boolean res) {
    	if (res) {
			System.out.println("Numero par");
		}else {
			System.out.println("Numero Impar");
		}
    }
    
    
    
    
}
