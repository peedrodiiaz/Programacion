package practica_examen;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String tipo, modelo, matricula;
		double precio;
		boolean estado;
		int alquiladoRes,idSeleccionado;
		int vastidor, tam, numVehiculos=0,op, numDiasAlq;
		
		Vehiculo[]lista;
		System.out.println("Indica el números de vehiculos que hay en la gestoria");
		tam=Leer.datoInt();
	
		Gestoria g;

		lista=new Vehiculo [tam];
		
		g=new Gestoria(lista, numVehiculos);
		
		g.agregarVehiculos(new Vehiculo("Coche", "audi", "SE0912DP", 5600, false, 5234562));
		g.agregarVehiculos(new Vehiculo("Moto", "suzuki", "7461MGL", 15003.5, true, 5645232));
		g.agregarVehiculos(new Vehiculo("Coche", "Mercerdes", "8108BLJ", 1000, false, 3252723));
		
		
		do {
			System.out.println("----------MENU----------");
			System.out.println("1. Agreagar un vehiculo");
			System.out.println("2. Consultar disponibilidad");
			System.out.println("3. Realizar un alquiler");
			System.out.println("4. Registrar devolución");
			System.out.println("5. Calcular precio por días alquiler ");
			System.out.println("6. Listar todos los vehiculos");
			System.out.println("7. Calacular ganacias totales");
			System.out.println("0. Para salir");
			
			System.out.println("Selecciona una opción");
			op=Leer.datoInt();
			
			
			switch (op) {
				case 0:
					System.out.println("Saliendo");
					break;
	
				case 1:
					System.out.println("Indica el tipo");
					tipo=Leer.dato();
					System.out.println("Indica el modelo");
					modelo=Leer.dato();
					System.out.println("Indica la matricula");
					matricula=Leer.dato();
					System.out.println("Indica el precio");
					precio=Leer.datoDouble();
					System.out.println("Indica si esta alquilado o no (1. Si 2. No)");
					alquiladoRes=Leer.datoInt();
					while (alquiladoRes>1 && alquiladoRes<2) {
						System.out.println("Iandica 1 o 2");
						alquiladoRes =Leer.datoInt();
					}
					if (alquiladoRes==1) {
						estado=true;
					}else {
						estado=false;
					}
					System.out.println("Indica el vastidor (id)");
					vastidor=Leer.datoInt();
					
					g.agregarVehiculos(new Vehiculo(tipo, modelo, matricula, precio, estado, vastidor));
					break;
				case 2:
					System.out.println("Introduce el id deñ vehiculo que quieres ver si esta disponilbe");
					idSeleccionado=Leer.datoInt();
					
					g.imprimirEstado(g.saberDisponibilidad(g.findById(idSeleccionado))); 
					break;
				case 3:
					
					System.out.println("Dime la matricula del vehiculo que quieres alquilar");
					matricula=Leer.dato();
					g.devolverEstadoCAMBIADO(g.cambiarEstado(matricula));	
					
					break;
				case 4:
					System.out.println("Indica la matricula del vheculo que quioeres devovler");
					matricula=Leer.dato();
					g.devolverEstadoCAMBIADOv2(g.cambiarEstadov2(matricula));
					break;
				case 5:
					System.out.println("Indica cuantos días ha estado pagado");
					numDiasAlq=Leer.datoInt();
					System.out.println("Indica el bastidor del vehiculo");
					vastidor=Leer.datoInt();
					System.out.println(g.calcularPrecioTotal(g.findById(vastidor), numDiasAlq));	
					break;
				case 6:
					g.listarVehiculos();
					break;
				case 7:
				System.out.println(g.cogerGanancias(g.guardarVehculos()));	
					break;
					
				
				
			default:
				break;
			}
			
			
			
			
			
			
			
		} while (op!=0);
		
		

		
		
		
	}

}
