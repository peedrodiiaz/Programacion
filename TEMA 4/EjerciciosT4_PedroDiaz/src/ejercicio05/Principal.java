package ejercicio05;



public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		Empleado e = new Empleado("José", "Perez", 1467, 1);
		Empleado e1 = new Empleado("Mario", "González", 1356.5, 2);
		Empleado e2 = new Vendedor("Maria", "Ruiz", 2324, 3, 2500, 10);
		Empleado e3 = new Gerente("Manuel", "Linares", 3842, 20,4);
		Empleado [] listaEmpleados = {e,e1,e2,e3};
		
		Oficina o = new Oficina(listaEmpleados);
		
		o.devolverTodos(3);
		
		
		
		o.calcularSueldoOf(e3,2344);
		
		System.out.println();
		System.out.println("El gasto de la oficina es: " + o.calcularGastoOficina());
		

			
		
		
		
}
}
