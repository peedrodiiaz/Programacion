package Ejercicio06_2;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Generadora G= new Generadora();
		int op;
		int numero;
		int numjugador;
		int resultado;
		do {
			System.out.println("Indica una opción  0. Para salir");
		
			System.out.println("1. La Quiniela");
			System.out.println("2. Pares o nones");
			System.out.println("3. Juego chinos");
			System.out.println("4. La primitiva");
			op=Leer.datoInt();
		
			switch (op) {
				case 1:
					System.out.println("El aleatorio de la quiniela es 1.Victoria Local 2. Victoria Visitante 3.Empate");
					System.out.println("Num jugador");
					resultado=G.generaraAleatorio(2, 0);
					numjugador=Leer.datoInt();
					System.out.println(resultado);
					G.comprobarQuiniela(numjugador, resultado);
					G.ComprobarResultadoQuiniela(numjugador, resultado);
					break;
	
				case 2:
					System.out.println("Introduce un número");
					numero=Leer.datoInt();
					G.devolverParImpar(G.Par(numero));
								
					break;
				
				case 3:
					System.out.println("Mi número es el:");
					System.out.println(G.Chinos());
					break;
				
				case 4:
					System.out.println("Los números premiados en la primitiva son:");
				
					G.Primivata();   
				
					
				case 0:
					System.out.println("Saliendo");
				
					break;
				default:
					System.out.println("Opción no disponible, seleccione otra");
					break;
				}
		
			
		} while (op!=0);
			System.out.println("Gracias por usar el programa");
		
		
		
		
	}

}
