package ejercicio01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ordenador o = new Ordenador(345, 5.5, 100, "Dell");
		Sobremesa S = new Sobremesa(1231, 3, 100, "HP", 20);
		Portatil P = new Portatil(234, 3.4, 100, "Acer", false, 20);
		System.out.println("El precio del ordenador es "+o.calcularPrecioVenta(34));
		System.out.println("El precio del sobremesa es " + S.calcularPrecioVenta(10));
		System.out.println("El precio del portatil es " + P.calcularPrecioVenta(20));
	}

}
