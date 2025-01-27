package Ejercicio07;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Juego j = new Juego();
		int numero;
		int numMaquina;
	
		do {
			System.out.println("Introduce un número");
			numero=Leer.datoInt();
			numMaquina=j.lanzamientoMaquina();
			System.out.println("Número de la maquina "+numMaquina);
			if (numero==numMaquina) {
				System.out.println(j.comprobarGanador(numero));
				j.GanadorBonito(j.comprobarGanador(numero));
			}
			
		} while (j.comprobarGanador(numero)==false);
		 
		
	}

}
