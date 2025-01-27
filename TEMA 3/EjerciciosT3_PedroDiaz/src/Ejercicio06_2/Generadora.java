package Ejercicio06_2;

import java.util.Random;

public class Generadora {
	//lo suyo es crear un metodo que cree los aleatorios necesarios segun el ejercicio y se vaya llamadnop

	public int generaraAleatorio(int hasta, int desde){
		Random r1 = new Random(System.nanoTime());
		return r1.nextInt(hasta - desde + desde) + desde;
		
		
	}
	
	public int aleatorioQuiniela() {
		int desde = 0;
		int hasta = 2;
		int num;
		num = generaraAleatorio(hasta, desde);
		return num;
	}
	public boolean ComprobarResultadoQuiniela (int numUsuario, int numMaquina) {
		boolean res;
		if (numUsuario==numMaquina) {
			res=true;
			
		}else {
			res=false;
		}
		return res;
	 
		
	}
	
	public void devolverComprobarQuiniela(Boolean res) {
		if (res) {
			System.out.println("Enhorabuena has ganado");
		}else {
			System.out.println("No has ganado");
		}
	}
	
	
	
	public int comprobarQuiniela(int hasta, int desde) {
		int num;
		num=generaraAleatorio(hasta,desde);
		
		if (num==1) {
			System.out.println("1");
		}else if(num==2){
			System.out.println("2");
		}else {
			System.out.println("x");
		}
		
		
		return num;
	}
	
	public int Chinos() {
		int num;
		int desde = 0;
		int hasta = 3;
		
		num = generaraAleatorio(hasta, desde);
		return num;

	}
	
	
	public void Primivata() {
		int num=0, rep=6;
		int desde = 0;
		int hasta = 49;
		for (int i = 0; i < rep; i++) {
			num = generaraAleatorio(hasta, desde);
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

