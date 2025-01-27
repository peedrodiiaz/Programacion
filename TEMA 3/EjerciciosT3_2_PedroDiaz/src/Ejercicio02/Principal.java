package Ejercicio02;


import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op,nDias, tam=5, nHab = 0;
		String nombre,servicio, nombreHabElegida, habTicket ;
		boolean limpio, ocupado;
		double precio,preciMInibar,servicioExtra;
		Habitacion lista[];		
		Hotel h ;
		System.out.println("Indica las habiataciones que tiene la casa");
		tam=Leer.datoInt();
		lista=new Habitacion[tam];
		do {
			System.out.println("Introduzca el precio de la habitación");
		precio=Leer.datoInt();
		System.out.println("Introduzca el nombre de la habitación");
		nombre=Leer.dato();
		System.out.println("Introduzca el servicio de la habitación");
		servicio=Leer.dato();
		System.out.println("Indica si esta limpio");
		limpio=Leer.datoBoolean();
		System.out.println("Introduca el nunmero de dias");
		nDias=Leer.datoInt();
		System.out.println("Introduzca el precio del minibar");
		preciMInibar=Leer.datoDouble();
		System.out.println("Introduzca el precio de servicio");
		servicioExtra=Leer.datoDouble();
		System.out.println("Indica si esta ocupada");
		ocupado=Leer.datoBoolean();
		
		System.out.println();
		System.out.println("0 Para ejecutar el programa, cualquier otra tecla para añadir otra habitración");
		op=Leer.datoInt();
		
		
		lista[nHab]= new Habitacion(precio, servicio, nombre, nDias, limpio, preciMInibar, servicioExtra, limpio, ocupado);
		h=new Hotel(lista);
		nHab++;
		} while (op!=0 || nHab>lista.length);
		
		do {
			
			
			System.out.println("0. Para salir");
			System.out.println("1. Añadir habitación");
			System.out.println("2. Comprobar ocuipacion");
			System.out.println("3. Calcular precio");
			System.out.println("4. Mostrar factura");
			op=Leer.datoInt();
			
			
			switch (op) {
				case 1:
					System.out.println("Introduzca el precio de la habitación");
					precio=Leer.datoInt();
					System.out.println("Introduzca el nombre de la habitación");
					nombre=Leer.dato();
					System.out.println("Introduzca el servicio de la habitación");
					servicio=Leer.dato();
					System.out.println("Indica si esta limpio");
					limpio=Leer.datoBoolean();
					System.out.println("Introduca el número de dias");
					nDias=Leer.datoInt();
					System.out.println("Introduzca el precio del minibar");
					preciMInibar=Leer.datoDouble();
					System.out.println("Introduzca el precio de servicio");
					servicioExtra=Leer.datoDouble();
					System.out.println("Indica si esta ocupada");
					ocupado=Leer.datoBoolean();
					
					
					lista[nHab]= new Habitacion(precio, servicio, nombre, nDias, limpio, precio, servicioExtra, limpio, ocupado);
					nHab++;
					h=new Hotel(lista);
					
					break;
					
					
				case 2: 
					System.out.println("Introduce el nombre de la habitación");
					nombre=Leer.dato();
					ocupado=h.estaocupada(nHab, nombre);
					h.devolverOcup(ocupado);
					
					break;
					
				case 3:
					System.out.println("¿En que habitación deseas ver los gastos totales?");
					nombreHabElegida=Leer.dato();
					System.out.println(h.calcularPrecioFinal(nombreHabElegida, nHab));
					
					break;
					
				default:
					break;
					
				case 4:
					System.out.println("Indícame la habitación de la que quieres el ticket:");
					habTicket=Leer.dato();
					h.encontrarHab(habTicket, nHab);
					break;
			
				case 0:
					System.out.println("Saliendo");
			
				}
			
			
			
			
		} while (op!=0);
			
			System.out.println("Gracias por usar el programa");
		
		
		
		
		
	}

}
