package arraysdeobjetos;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam;
		vehiculos [] lista;
		String modelo;
		double potencia;
		int nvs=0, salir, modeloElegir;
		
		
		System.out.println("Indica cuántos vehiculos hay");
		tam=Leer.datoInt();
		
				
		lista=new vehiculos[tam];
		
//		
//		System.out.println("Indica el modelo");
//		modelo=Leer.dato();
//		
//		System.out.println("Indica la potencia");
//		potencia=Leer.datoDouble();
//		
//		//varias posibilidades
//		
//		//aqui esta guardando un elemento de tipo vehiculo dentro de la lista. En este caso en el espacio 0
//		lista[0]=new vehiculos(modelo,potencia);
//		
//		System.out.println(lista[0]);
		
		do {
			System.out.println("Indica el modelo");
			modelo=Leer.dato();
			
			System.out.println("Indica la potencia");
			potencia=Leer.datoDouble();
			
			lista[nvs]=new vehiculos(modelo,potencia);
			System.out.println(lista[nvs]);
			nvs++;
			
			
			
			System.out.println("Quieres terminar? 1.No 0.Si");
			salir=Leer.datoInt();
			
		} while (nvs<lista.length && salir!=0);
		
		System.out.println("Saliendo");
		
		for (int i = 0; i < nvs; i++) {
			System.out.println(lista[i]);
		}
		
		System.out.println("Indica que modelo quieres verle la potencia");
		modeloElegir=Leer.datoInt();
		
		System.out.println(lista[modeloElegir-1].getPotencia());
		
	}

}
