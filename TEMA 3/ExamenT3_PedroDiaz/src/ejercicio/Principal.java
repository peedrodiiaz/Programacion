package ejercicio;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Cupkaes true      Normales false
		int id , tam, op, tipoElegido;
		String sabor;
		boolean tipo;
		double volumen, precioCoste;
		
		Magdalena [] lista;
		System.out.println("Bienvenido al programa");
		System.out.println("Indica el número de magdalenas que caben en la pastelería");
		tam=Leer.datoInt();
		lista=new Magdalena[tam];
		Pasteleria p = new Pasteleria("Pastelería Pedro", 200, lista);
		
		p.anadirMagdalenas(new Magdalena(21312, "Fresa", true, 12));
		p.anadirMagdalenas(new Magdalena(34242, "Chocolate", true, 10));
		p.anadirMagdalenas(new Magdalena(7432, "Manzana", false, 7.5));
		p.anadirMagdalenas(new Magdalena(923675, "Limón", false, 5.8));
		
		do {
			System.out.println("------------MENU.------------");
			System.out.println("1. Añadir magdalena");
			System.out.println("2. Buscar magdalenas de un sabor");
			System.out.println("3. Buscar una magadalena por id");
			System.out.println("4. Calcular la media de cm3");
			System.out.println("5. Calcular el precio coste");
			System.out.println("6. Mostrar lista solo de Cupcakes");
			System.out.println("7. Calcular porcentaje del presupuesto");
			System.out.println("8. Calcualar total precio coste");
			System.out.println("0. Para salir");
			
			System.out.println("Selecciona una opción");
			op=Leer.datoInt();
		
			switch (op) {
			case 0:
				System.out.println("Saliendo");
				
				break;

			case 1:
				System.out.println("Introduce el ID:");
				id=Leer.datoInt();
				System.out.println("Introduce el sabor");
				sabor=Leer.dato();
				System.out.println("Introduce el tipo (1. CupCakes(true)   2.Normales(false))");
				tipoElegido=Leer.datoInt();
				
				if (tipoElegido==1) {
					tipo=true;
				}else {
					tipo=false;
						
				}
				
				System.out.println("Indica el volumen");
				volumen=Leer.datoDouble();
				
				p.anadirMagdalenas(new Magdalena(id, sabor, tipo, volumen));
				
				break;
				
				
				
			case 2:
				
				System.out.println("Introduce un sabor");
				sabor=Leer.dato();
				
				p.devolverMagSabor(p.buscarMagdalena(sabor));
				
				
				break;
				
			case 3:
				
				System.out.println("Introduce el id de la magdalena para ver su sabor");
				id=Leer.datoInt();
				p.devolverSaborByID(p.findByID(id));
				
				
				break;
			case 4:
				System.out.printf("La media de volumenes es %.2f\n ", p.mediaVolumen());
				
				break;
				
				
				
			case 5:
				System.out.println("Introduce el id de una magdalena");
				id=Leer.datoInt();
				System.out.println("Introduce el precio centímetro/masa");
				precioCoste=Leer.datoDouble();
				System.out.println("El precio de fabrica es "+p.calcularPrecioFab(id, precioCoste));
				
				break;
				
				
				default:
				System.out.println("Opción no valida");
				break;
				
			case 6:
				p.devolverCupKakes(p.buscarMagdalenav2());
				break;
			
			case 7:
				System.out.println("Introduce el id de la magdalena");
				id=Leer.datoInt();
				System.out.println("¿Cuánto vale la masa por volumen?");
				precioCoste=Leer.datoDouble();
				
				System.out.printf("El porcentaje de gasto del presupuesto total es de %.2f %%",p.devolverPorcentaje(p.calcularPrecioFab(id, precioCoste)) );
				System.out.println();
				
				break;
			case 8:
				System.out.println("Indicame el precio de masa");
				precioCoste=Leer.datoDouble();
				System.out.println(	p.calcularMagNor(p.buscarMagdalenav3(), precioCoste));
			
				
				break;
				
			}
			
		
		
		} while (op!=0);
		
		
		
		
	}

}
