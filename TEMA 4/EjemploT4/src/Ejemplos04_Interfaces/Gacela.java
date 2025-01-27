package Ejemplos04_Interfaces;

public class Gacela extends Bovido implements IPresa {

	@Override
	public void observar() {
		System.out.println("Mirando fijamente");		
	}

	@Override
	public void huir() {
		System.out.println("Huida historica");
		
	}

}
