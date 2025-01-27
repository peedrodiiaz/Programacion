package ejercicio;

import java.util.Random;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random num = new Random(System.nanoTime());
		int dinero[];
		int tam, op, menor, mayor,claseElegida,cantidad, suma=0, media,dinSumar,claseSumar, sumaFinal, masDinero, clasePorcentaje, mediaAños=90, porcentajeFin, porcentaje=100;

	
		
		System.out.println("Bienvenido al programa, vamos a gestionar el dinero recaudado en el DOMUND");
		System.out.println("Introduzca el número de clases donde se ha recaudado el dinero");
		tam=Leer.datoInt();
		dinero= new  int [tam];
		
		do {
			System.out.println("Seleccione una opción:");
			System.out.println("1. Generar aleatoriamente el número de euros recogidos por cada clase");
			System.out.println("2. Mostrar los euros de una clase");
			System.out.println("3. Mostrar el número de clases que han conseguido más dinero que el solicitado");
			System.out.println("4. Mostrar la media de dinero recaudada");
			System.out.println("5. Mostrar todos los datos de una forma ordenada");
			System.out.println("6. Sumar al dinero de una clase el dinero que introduzcas");
			System.out.println("7. Calcular el porcentaje recogido de euros de una clase");
			System.out.println("8. Mostrar la clase que más dinero ha recaudado");
			System.out.println("0. Para salir del programa");
			System.out.println();
			System.out.println("Introduzca una opción");
		
			op=Leer.datoInt();
			
			switch (op) {
				case 1:
					System.out.println("Por favor, introduza entre que valores van a estar los números");
					System.out.println("Número menor:");
					menor=Leer.datoInt();
					System.out.println("Número mayor");
					mayor=Leer.datoInt();
					
					for (int i = 0; i < dinero.length; i++) {
						dinero[i]=num.nextInt(mayor-menor+1)+menor;
					}
					
										
					break;
					
				case 2: 
					System.out.println("Introduza  una clase para ver el dinero recaudado");
					claseElegida=Leer.datoInt();
					while (claseElegida>dinero.length) {
						System.out.println("Error, esa clase no existe. Escriba una clase de nuevo");
						claseElegida=Leer.datoInt();
					}
					
					System.out.printf("El dinero de la clase %d es de %d€ \n",claseElegida, dinero[claseElegida-1]);
					
					System.out.println();
					break;
					
				case 3:
				
					System.out.println("Introduce una cantidad de dinero, para ver cuántas clases lo han superado");
					cantidad=Leer.datoInt();
					while (cantidad<1) {
						System.out.println("Indica una cantidad mayor que 0 para continuar");
						cantidad=Leer.datoInt();
					}
					for (int i = 0; i < dinero.length; i++) {
						if (cantidad<dinero[i]) {
							System.out.println("La clase "+(i+1)+" ha superdao la cantidad de dinero, porque tenia "+ dinero[i]);
						}else {
							System.out.println("La clase "+dinero[i]+" no ha superado "+ cantidad+ " de euros");
						}
					}
					System.out.println();
					break;
				
				case 4:
					for (int i = 0; i < dinero.length; i++) {
						suma+=dinero[i];
						}
					media=suma/dinero.length;
					System.out.println("La media del dinero recaduado es de "+media+"€");
					System.out.println();
									
					break;
				case 5:
					System.out.println("CLASE\t\t\tCantidad (€)");
					for (int i = 0; i < dinero.length; i++) {
						System.out.println("  "+(i+1)+"\t\t\t   "+dinero[i]);
					}
					System.out.println();
					break;
				
				case 6:
					System.out.println("Introduca una cantidad para sumarsela al dinero de una clase");
					dinSumar=Leer.datoInt();
					System.out.println("Indica una clase a la que sumarle el dinero");
					claseSumar=Leer.datoInt();
					
					System.out.println("La clase seleccionada tiene "+dinero[claseSumar-1]+"€");
					sumaFinal=dinSumar+dinero[claseSumar-1];
					dinero[claseSumar-1]=sumaFinal;
					System.out.println("La clase tiene ahora "+dinero[claseSumar-1]+"€");
					System.out.println();
					
					break;
			
				case 7:
					System.out.println("Indicame una clase para ver el porcentaje de dinero recauadado");
					clasePorcentaje=Leer.datoInt();
					
					porcentajeFin=(dinero[clasePorcentaje-1]*porcentaje)/mediaAños;
					System.out.println("El porcentaje es de "+porcentajeFin+"%");
					System.out.println();
					
					
					
					
					break;
				case 8:
					System.out.println("Vamos a mostrar la clase que más dinero ha recaudado");
					
					masDinero=dinero[0];
			
					for (int i = 0; i < dinero.length; i++) {
						if (masDinero<dinero[i]) {
							
							masDinero=dinero[i];
							
						}
											
					}
					for (int i = 0; i < dinero.length; i++) {
						if (masDinero==dinero[i]) {
							System.out.println("La clase que mas diero ha recaduado es la "+(i+1));
							System.out.println("Ha recaudado "+masDinero+"€");
						}
					}
					System.out.println();
					break;
					
				case 0:
					System.out.println("Saliendo");
									
					
				default:
					System.out.println("Opción no valida");
					break;
				}
				
			
		} while (op!=0);
		
		
		System.out.println("Gracias por usar el programa");
		
		
	}

}		

