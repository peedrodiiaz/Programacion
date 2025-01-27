package ejercicio09;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op, num;
		
		Sorteo s=new Sorteo();
		System.out.println("Bienvenido al programa");
		do {
			System.out.println("1.Comprar décimo de forma manual");
			System.out.println("2 Comprar décimo de forma aleatoria");
			System.out.println("3.Hacer el sorteo");
			System.out.println("4.Comprobar si has ganado");
			System.out.println("0.Para salir");
			
			op=Leer.datoInt();
			
			switch (op) {
			case 1:
				System.out.println("Introduzca el número que va a comprar");
				num=Leer.datoInt();
				s.comprarDecimo(num);
				break;
			 case 2:
                 s.comprarDecimoAleatorio();
                 break;
			 case 3:
                 s.hacerSorteo();
                 break;
			 case 4:
				 if (s.esGanador()) {
                     System.out.println("Enhorabuena, has ganado");
                 } else {
                     System.out.println("No has ganado, otra vez será");
                 }
                 break;
			 case 0:
				 System.out.println("Saliendo");
                 
                 
			default:
				System.out.println("Opción no permitida");
				break;
			}
			
		} while (op!=0);
		System.out.println("Gracias por usar el programa");
		
	}

}
