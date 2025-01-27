package PracticaExamen;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int tam=5, cont=0, op, numero;
		String producto []=new String[tam];
		String nombre, eliminar;
		Random num= new Random(System.nanoTime());
		boolean encontrado;
		
		System.out.println("Bienvenido al supermercado");
		
		do {
			System.out.println("1. Ingrese un producto\t 2. Listar productos\t 3. Eliminar producto\t 4.Salir");
			System.out.println("Introduzca una opción");
			op=Leer.datoInt();
			
			switch (op) {
				case 1:
					if (cont<producto.length) {
						System.out.println("Ingrese el nombre del producto");
						nombre=Leer.dato();
						System.out.println("Introduzca en que número de la lista lo va a guardar");
						numero=Leer.datoInt();
						
						if(producto[numero-1]!=null) {
							System.out.println("Ese numero esta ocupado");}
						else {
							producto[numero-1]=nombre;
							cont++;
						}
												
					}else {
						System.out.println("La lista esta llena");
					}
					
					break;
				
				case 2:
					for (int i = 0; i < producto.length; i++) {
						System.out.println(producto[i]);
					}
					System.out.println();
					break;
				
				case 3:
					System.out.println("Introduca el producto a eliminar");
					eliminar=Leer.dato();
					for (int i = 0; i < producto.length; i++) {
						if (eliminar.equalsIgnoreCase(producto[i])) {
							encontrado=true;
							if (encontrado=true) {
								producto[i]=null;
							}
						}else {
							encontrado=false;
							System.out.println("El producto no existe");
						}
					}
				
			
					
				default:
					break;
				case 4:
					System.out.println("Gracias por usar el programa");
					
		
			
		}
			
			
		} while (op!=4);
		
		System.out.println("Saliendo");
}
	}



