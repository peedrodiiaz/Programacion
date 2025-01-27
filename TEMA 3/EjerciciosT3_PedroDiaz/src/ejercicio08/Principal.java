package ejercicio08;


import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String titular;
		Cuenta c;
		double dineroRetirar, ingresar, saldo=100;
		int op;
		
		System.out.println("Bienvenido al banco");
		System.out.println("¿Cuál es el nombre del titular?");
		titular=Leer.dato();
		c=new Cuenta(titular, saldo);
		
		do {
			System.out.println("1. Ingresar saldo");
			System.out.println("2. Retirar saldo");
			System.out.println("3. Saldo en dolares");
			System.out.println("4. Consultar saldo");
			System.out.println("0. Para salir");
			op=Leer.datoInt();
			
			switch (op) {
			case 1:
				System.out.println("¿Cuánto quiere ingresar");
				ingresar=Leer.datoDouble();
				c.ingresar(ingresar);
				
				break;
				
			case 2:
				System.out.println("¿Cuánto dinero quieres retirar?");
				dineroRetirar=Leer.datoDouble();
				c.devolverRetirar(c.comprobarRetirar(dineroRetirar));
				break;
			case 3:	
				System.out.println("El saldo en dolares es "+c.saldoDolares());
				break;
				
			case 4:
				System.out.println("El saldo de la cuenta de "+titular+" es "+ c.getSaldo()+"€");
				break;
			case 0:
				System.out.println("Saliendo del programa");
			default:
				System.out.println("Opción incorrecta");
				break;
			
			}
			
			
			
		} while (op!=0);
			System.out.println("Gracias");
		
		
		
	
		
	}

}
