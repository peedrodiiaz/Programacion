package Ejercicio06;

import java.util.Random;

public class Generadora {

	Random r1 = new Random(System.nanoTime());

	public int aleatorioQuiniela() {
		int desde = 1;
		int hasta = 3;
		int num;
		num = r1.nextInt(hasta - desde + desde) + desde;
		return num;
	}
	public int Chinos() {
		int num;
		int desde = 0;
		int hasta = 3;
		
		num = r1.nextInt(hasta - desde + desde) + desde;
		return num;

	}
	public void Primivata() {
		int num=0, rep=6;
		int desde = 0;
		int hasta = 49;
		for (int i = 0; i < rep; i++) {
			num = r1.nextInt(hasta - desde + desde) + desde;
		System.out.print(num+" ");
		}
		System.out.println();
		
	}
	
	
	public boolean Par (int num) {
		boolean res;
		if (num%2==0) {
			res=true;
		}else {
			res=false;
		}
		return res;
	}

	public void devolverParImpar(boolean res) {
		if (res) {
			System.out.println("Es pares");
		}else {
			System.out.println("Es nones");
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}




}

