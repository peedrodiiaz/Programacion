package Ejercicio01;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op, numeroProductos=0, seleccion = 0, Id,tam=5, seccion;
		double	precioBase, porcentaje;
		String nombre;
		boolean fragil;
		Tienda t;
		Producto []lista = new Producto [tam];
		
		System.out.println("Bienvenido al programa");
		
		do {
			System.out.println("Introduzca el id del producto");
			Id=Leer.datoInt();
			System.out.println("Introduzca el nombre");
			nombre=Leer.dato();
			System.out.println("Introduzca la seccion");
			seccion=Leer.datoInt();
			System.out.println("Introduza si es fragil");
			fragil=Leer.datoBoolean();
			System.out.println("Introduce el precio fábrica");
			precioBase=Leer.datoDouble();
			
			
			lista[numeroProductos]= new Producto(precioBase, Id, seccion, nombre, fragil);
			numeroProductos++;
			
			System.out.println("Pulsa 0 para salir. Otro numero para añadir más");
			seleccion=Leer.datoInt();
			
			
		} while (seleccion!=0 && numeroProductos<tam);
		
		t= new Tienda(lista);
		
		
		do {
			
			System.out.println("1. Listar Productos");
			System.out.println("2. Comprobar si es fragil");
			System.out.println("3. Añadir producto");
			System.out.println("4. Calcular cantidad invertida");
			System.out.println("5. Calcular el PVP");
			System.out.println("6. Calcular las ganacias");
			
			System.out.println("0.Para salir");
			op=Leer.datoInt();
			
			switch (op) {
			case 1:
				t.listarProductos(numeroProductos);
				break;
				
			case 2:
				System.out.println("Indica el id del producto");
				Id=Leer.datoInt();
				t.devolverBoolean(t.esFragil(Id,numeroProductos));
				
				break;
			
			case 3:
				System.out.println("Introduzca el id del producto");
				Id=Leer.datoInt();
				System.out.println("Introduzca el nombre");
				nombre=Leer.dato();
				System.out.println("Introduzca la seccion");
				seccion=Leer.datoInt();
				System.out.println("Introduza si es fragil");
				fragil=Leer.datoBoolean();
				System.out.println("Introduce el precio fábrica");
				precioBase=Leer.datoDouble();
				
				t.aniadirProducto(Id, precioBase, nombre, fragil, seccion, numeroProductos);
				numeroProductos++;
				break;
			case 4:
				t.devolverCantidadInvertida(t.calcularCantidadInvertidad(numeroProductos));
				break;
				
			case 5:
				System.out.println("Introduza el id del producto");
				Id=Leer.datoInt();
				System.out.println("Indica el porcentaje de ganacia");
				porcentaje=Leer.datoInt();
				t.devolverPVP(Id, porcentaje,numeroProductos);
				break;
			case 6:
				
				System.out.println("Introduzca el porcentaje");
				porcentaje=Leer.datoDouble();
				t.devolverGnancia(porcentaje, numeroProductos);
				
				break;

			
			default:
				break;
			}
			
			
			
		} while (op!=0);
		
		
				
	}

}
