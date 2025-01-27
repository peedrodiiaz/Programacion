package Ejercicio07;

import java.util.Random;

public class Juego {

	Random r1 = new Random(System.nanoTime());
	public int lanzamientoMaquina() {
		int desde = 1;
		int hasta = 2;
		int num;
		num = r1.nextInt(hasta - desde + desde) + desde;
		return num;
		
	}
	public boolean comprobarGanador(int num) {
		boolean res;
		if (lanzamientoMaquina()==num) {
			res=true;
		}else {
			res=false;
		}
		return res;
		
	}

	
	public void GanadorBonito(boolean res) {
		if (res) {
			System.out.println("Siga jugando");
			
		}else {
			System.out.println("Enhorabuena ganador");
		}
		
		
		
	};
	
	
	
	
	
	
	
	
	public void caracruz(int num){
		if (num ==1) {
			System.out.println("Ha salido 1 es cara");
		}else {
			System.out.println("Ha salido 2 es cruz");
		}
	}
	
	
	
	
	
}
