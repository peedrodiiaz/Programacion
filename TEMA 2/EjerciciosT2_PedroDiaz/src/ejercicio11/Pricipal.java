package ejercicio11;

import ejercicio02.Leer;

public class Pricipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String pelicula1="Marvel", pelicula2="Cars",pelicula3="Nemo", pelicula4="Dory";
		int numdeSala, numdeEntradas, tipoEntrada;
		double precioEntradasVip,precioEntradas3d, totalEntradas;
		
		System.out.println("Bienvenido al cine, indique un número de sala");
		System.out.println("1."+pelicula1);
		System.out.println("2."+pelicula2);
		System.out.println("3."+pelicula3);
		System.out.println("4."+pelicula4);
		
		numdeSala=Leer.datoInt();
		switch (numdeSala) {
		case 1: {
			System.out.println("¿Cuántas entradas necesita?");
			numdeEntradas=Leer.datoInt();
			System.out.println("¿Cuánto valen las entradas vip?");
			precioEntradasVip=Leer.datoDouble();
			System.out.println("¿Cuánto valen las entradas 3d?");
			precioEntradas3d=Leer.datoDouble();
			System.out.println("¿Cuál de los 2 tipos quiere. 1.VIP o 2.3D?");
			tipoEntrada=Leer.datoInt();
			System.out.println("SALA"+numdeSala);
			switch (tipoEntrada) {
			case 1:
				totalEntradas=numdeEntradas*precioEntradasVip;
				System.out.printf("****************Cine*****************\n");
				System.out.printf("Entradas \t €/u \t Total\n");
				System.out.printf("%d \t\t %.2f \t %.2f€",numdeEntradas,precioEntradasVip,totalEntradas);
				
				break;
				
			case 2:
				totalEntradas=numdeEntradas*precioEntradas3d;
				System.out.printf("****************Cine*****************\n");
				System.out.printf("Entradas \t €/u \t Total\n");
				System.out.printf("%d \t\t %.2f \t %.2f€\n",numdeEntradas,precioEntradasVip,totalEntradas);
				
				break;
				
				
			default:
				System.out.println("Opción no valida");
				break;
			}
			
			
		break;		
			
		}
		
		case 2:
			System.out.println("¿Cuántas entradas necesita?");
			numdeEntradas=Leer.datoInt();
			System.out.println("¿Cuánto valen las entradas vip?");
			precioEntradasVip=Leer.datoDouble();
			System.out.println("¿Cuánto valen las entradas 3d?");
			precioEntradas3d=Leer.datoDouble();
			System.out.println("¿Cuál de los 2 tipos quiere. 1.VIP o 2.3D?");
			tipoEntrada=Leer.datoInt();
			System.out.println("SALA"+numdeSala);
			switch (tipoEntrada) {
			case 1:
				totalEntradas=numdeEntradas*precioEntradasVip;
				System.out.printf("****************Cine*****************\n");
				System.out.printf("Entradas \t €/u \t Total\n");
				System.out.printf("%d \t\t %.2f \t %.2f€",numdeEntradas,precioEntradasVip,totalEntradas);
				
				break;
				
			case 2:
				totalEntradas=numdeEntradas*precioEntradas3d;
				System.out.printf("****************Cine*****************\n");
				System.out.printf("Entradas \t €/u \t Total\n");
				System.out.printf("%d \t\t %.2f \t %.2f€\n",numdeEntradas,precioEntradasVip,totalEntradas);
				
				break;
				
				
			default:
				System.out.println("Opción no valida");
				break;
			}
			
			break;
		
		case 3:
			System.out.println("¿Cuántas entradas necesita?");
			numdeEntradas=Leer.datoInt();
			System.out.println("¿Cuánto valen las entradas vip?");
			precioEntradasVip=Leer.datoDouble();
			System.out.println("¿Cuánto valen las entradas 3d?");
			precioEntradas3d=Leer.datoDouble();
			System.out.println("¿Cuál de los 2 tipos quiere. 1.VIP o 2.3D?");
			tipoEntrada=Leer.datoInt();
			System.out.println("SALA"+numdeSala);
			switch (tipoEntrada) {
			case 1:
				totalEntradas=numdeEntradas*precioEntradasVip;
				System.out.printf("****************Cine*****************\n");
				System.out.printf("Entradas \t €/u \t Total\n");
				System.out.printf("%d \t\t %.2f \t %.2f€",numdeEntradas,precioEntradasVip,totalEntradas);
				
				break;
				
			case 2:
				totalEntradas=numdeEntradas*precioEntradas3d;
				System.out.printf("****************Cine*****************\n");
				System.out.printf("Entradas \t €/u \t Total\n");
				System.out.printf("%d \t\t %.2f \t %.2f€\n",numdeEntradas,precioEntradasVip,totalEntradas);
				
				break;
				
				
			default:
				System.out.println("Opción no valida");
				break;
			}
			
			break;
		case 4:
			System.out.println("¿Cuántas entradas necesita?");
			numdeEntradas=Leer.datoInt();
			System.out.println("¿Cuánto valen las entradas vip?");
			precioEntradasVip=Leer.datoDouble();
			System.out.println("¿Cuánto valen las entradas 3d?");
			precioEntradas3d=Leer.datoDouble();
			System.out.println("¿Cuál de los 2 tipos quiere. 1.VIP o 2.3D?");
			tipoEntrada=Leer.datoInt();
			System.out.println("SALA"+numdeSala);
			switch (tipoEntrada) {
			case 1:
				totalEntradas=numdeEntradas*precioEntradasVip;
				System.out.printf("****************Cine*****************\n");
				System.out.printf("Entradas \t €/u \t Total\n");
				System.out.printf("%d \t\t %.2f \t %.2f€",numdeEntradas,precioEntradasVip,totalEntradas);
				
				break;
				
			case 2:
				totalEntradas=numdeEntradas*precioEntradas3d;
				System.out.printf("****************Cine*****************\n");
				System.out.printf("Entradas \t €/u \t Total\n");
				System.out.printf("%d \t\t %.2f \t %.2f€\n",numdeEntradas,precioEntradasVip,totalEntradas);
				
				break;
				
				
			default:
				System.out.println("Opción no valida");
				break;
			}
			
			break;
			
			
		default:
			System.out.println("Has introducido una sala no valida");
			break;
		}
		
	
		
	}

}
	
