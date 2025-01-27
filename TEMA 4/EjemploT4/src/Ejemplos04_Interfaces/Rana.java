package Ejemplos04_Interfaces;

public class Rana  extends Anfibio implements IPresa, iDepredadorr{

	@Override
	public void observar() {
		System.out.println("Rana Mirando 360º");
	}

	@Override
	public void huir() {
		System.out.println("Salto Triple");
	}

	@Override
	public void Cazar() {
		// TODO Auto-generatedod stub
		
	}

	@Override
	public void Perseguir() {
		// TODO Auto-generated method stub
		
	}

	
	
	
	
	
}
