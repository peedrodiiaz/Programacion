package ejercicio07;

import utilidades.Leer;

public class Pricipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		String nomProducto;
		double preProd, cantidad, descuento, eurodescuento , total, total2;
		
		System.out.println("Bienvenido a mi tienda");
		System.out.println("Indica que producto se va a llevar");
		nomProducto=Leer.dato();
		System.out.println("Indica el precio del producto");
		preProd=Leer.datoDouble();
		System.out.println("¿Cuánto productos se va a llevar?");
		cantidad=Leer.datoDouble();
		System.out.println("¿Cuánto descuento se va a aplicar si"
				+ "pasa de 100€ ");
		descuento=Leer.datoDouble();
		
		total2=preProd*cantidad;
		
		if(total2>=100) {
			eurodescuento= (total2*descuento)/100;
			
			total=total2-eurodescuento;
			
			System.out.printf("La compra de %s es de\n:", nomProducto);		
			System.out.printf(" %.2f", total);
		}else {
			System.out.printf("La compra de %s es de:\n", nomProducto);
			System.out.printf(" %.2f y no hay decuento", total2);
			
		}
		
		
		
		
		
	}

}
