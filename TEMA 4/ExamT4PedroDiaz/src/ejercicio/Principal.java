package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double descuento= 15;
		double precioExtra=10;
		double porcentajeBenefico=5;
		int op;
		
		EntradaGeneral eg = new EntradaGeneral(false, 3, 2, 10);
		EntradaGeneral eg2 = new Familia(true, 4, 3, 10, 5);
		EntradaGeneral eg3 = new Vip(true, 2,2, 10, "PEPE");
		EntradaGeneral eg4 = new Vip(true, 2,2, 10, "Juan");
		
		EntradaGeneral[]lista = {eg,eg2,eg3,eg4};
		
		Taquilla t = new Taquilla(lista);
		
		do {
			
		
		System.out.println("Bienvenido al programa");
		System.out.println("1. Calcula el precio de la entrada pasándole el nombre de entrada");
		System.out.println("2. Calcular el total recaudado en las entradas de las zonas de arriba ");
		System.out.println("3. Imprimir el ticket para las personas VIP");
		System.out.println("4. Calcular la cantidad total que se donará entre todos los donativos");
		System.out.println("5.Calcular recaudación por VIP");
		System.out.println("0. Para salir");
		System.out.println("Elige una opción");
		
		op=Leer.datoInt();
		switch (op) {
			case 1:
				t.calcularPrecioCualquiera(eg2, descuento, precioExtra);
			
			break;

			case 2:
				System.out.println("El total recaudado por las entradas de arribas es de:");
				System.out.printf("%.2f€",t.calcularRecaudadoAriiba(descuento, precioExtra));
				System.out.println();
				break;
			case 3:
				t.devolverTicket();
				System.out.println();
				break;
			case 4:
				System.out.println("La cantidada total para donar es de:");
				System.out.printf("%.2f€",t.calcularRecaudacionDonativos(descuento, porcentajeBenefico, precioExtra));
				System.out.println();
				break;
			case 5:
				System.out.println("La recaudacion del vip es");
				System.out.printf("%.2f€",t.calcularRecogidoVip(descuento, porcentajeBenefico, precioExtra));
				System.out.println();
				break;
			default:
			break;
		}
	
		} while (op!=0);
		
		System.out.println("Saliendo");
		

		
	}

}
