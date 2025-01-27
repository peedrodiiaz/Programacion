package ejemploGetSET;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Animal a =new Animal("pepe",12,4,14, true);
		
		a.cambiarEdad(3);
		System.out.println(a.getEdad());
		a.cambiarEdad(5);
		System.out.println(a.getEdad());
		
		
		
	}

}
