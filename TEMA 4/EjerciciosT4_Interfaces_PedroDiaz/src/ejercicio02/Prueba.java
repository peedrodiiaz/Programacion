package ejercicio02;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Producto p = new Producto("Manzanas",2.3);
		Trabajador t = new  Trabajador(15);
		Producto p3 = new Alimentacion("Croqueta", 20.3);
		IImpuesto II = new Producto("Patatas", 21);
		
		
		
		System.out.println("El IVA para la  "+p.getNombre()+ " es " + 	p.calcularIva(21));
		System.out.println("El sueldo final del trabajador es "+ + t.calculoIrpf(2300));
		System.out.println(p3.calcularPVP());
		System.out.println(II.calcularIva(231));
		
	}

}
