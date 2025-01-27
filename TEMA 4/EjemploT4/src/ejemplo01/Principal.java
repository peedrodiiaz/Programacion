package ejemplo01;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Trabajador t = new Trabajador ("Pepe","Profesor");
		Empleado e = new Empleado("Juan", "Jefe de estudios", 1700, 12.5);	
		Consultor c = new Consultor("Luismi", "Tutor", 26, 22);		
		
		System.out.println(t);
		System.out.println(e);
		System.out.println(c);
		
		//Llamadas al metodos
		
		System.out.println(t.calcularPaga());
		System.out.println(e.calcularPaga());
		System.out.println(c.calcularDiasCompletos(8));
	}

}
