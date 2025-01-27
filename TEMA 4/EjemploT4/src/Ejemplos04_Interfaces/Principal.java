package Ejemplos04_Interfaces;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Rana rana =  new Rana();
		Anfibio an = new Anfibio();
		Anfibio a2 = new Rana();
		IPresa IP = new Rana();
		
		rana.huir();
		rana.observar();
		
		
		
		
		
		
	}

}
