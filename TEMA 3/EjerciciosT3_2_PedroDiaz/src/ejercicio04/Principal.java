package ejercicio04;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String dni,nombre,apellido, dniElegido;
		int activoNum;
		boolean activo;
		double peso, altura;
		int tam, op=0, numUsuairos=0;
		Cliente[]lista;
		Gimnasio g1;
		Cliente c1;
		System.out.println("Indica el número de usarios que puede haber en el gimnsaio");
		tam=Leer.datoInt();
		
		lista=new Cliente[tam];
		g1 = new Gimnasio(lista, tam);
		c1= new Cliente("27462462V", "Pedro", "Díaz", true, 78.4, 1.78);
		lista[numUsuairos]=c1;
		numUsuairos++;
		
		do {
			System.out.println("Bienvenido al gimnasio");
			System.out.println("1. Mostrar IMC de un cliente");
			System.out.println("2. Mostrar usuarios");
			System.out.println("3. Agregar nuevo usaurio");
			System.out.println("4. Dar de baja");
			System.out.println("5. Calcular IMC entre todos");
			
			System.out.println("Indica una opción");
			op=Leer.datoInt();
			
			
			switch (op) {
				case 1:
					System.out.println("Indica el dni del cliente que quieres");
					dniElegido=Leer.dato();
					System.out.println("El IMC del cliente es "+ c1.calcularIMC(g1.buscarDNI(dniElegido), c1.getPeso(), c1.getAltura()));
					
					break;
				case 2:
					g1.mostrarLista();
					break;
				
				case 3:
					if (numUsuairos>=lista.length) {
						System.out.println("Está completo");
					}else {
						System.out.println("Indica el dni");
						dni=Leer.dato();
						System.out.println("Indica el nombre");
						nombre=Leer.dato();
						System.out.println("Indica el apellido");
						apellido=Leer.dato();
						System.out.println("Indica si está actibo. (1.Si 2.No)");
						activoNum=Leer.datoInt();
						if (activoNum==1) {
							activo=true;
							}else {
							activo=false;
						}
						System.out.println("Indica el peso");
						peso=Leer.datoDouble();
						System.out.println("Indica la altura");
						altura=Leer.datoDouble();
						
						
						g1.agregarUsuario(numUsuairos, dni, nombre, apellido, activo, peso, altura);
					}
					
				
				default:
					break;
			}
			
		} while (op!=0);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
