package ejemplo02_figura;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo T= new Triangulo("verde", 4, 2);
		System.out.println(T.calcularArea());
		T.imprimirDetalles();
		System.out.println(T instanceof Triangulo);
	}

}
