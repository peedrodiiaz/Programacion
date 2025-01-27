package ejemplosarraybi;

import utilidades.Leer;

public class Pricipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tam=4, filaLeida, colLeida,nuevoNum;
		int filas=3;
		int col=4;
		int enteros[]=new int [tam];
		int [][] lista=new int [filas][col];
		
		//primer corche filas y segundo columnas
		
		for (int i = 0; i < lista.length; i++) {
			for (int j = 0; j < lista[i].length; j++) {
				System.out.println("Dime números");
				lista[i][j]=Leer.datoInt();
			}
		}		
		for (int i = 0; i < lista.length; i++) {
			System.out.println();
			for (int j = 0; j < lista[i].length; j++) {
				System.out.print("\t"+lista[i][j]);
			}
		}
		System.out.println();
		System.out.println("Dime la fila");
		filaLeida=Leer.datoInt();
		System.out.println("Dime una columna");
		colLeida=Leer.datoInt();
		System.out.println("Dime el número nuevo");
		nuevoNum=Leer.datoInt();
		lista[filaLeida-1][colLeida-1]=nuevoNum;
		
		for (int i = 0; i < lista.length; i++) {
			System.out.println();
			for (int j = 0; j < lista[i].length; j++) {
				System.out.print("\t"+lista[i][j]);
			}
		}
		
	}

}
