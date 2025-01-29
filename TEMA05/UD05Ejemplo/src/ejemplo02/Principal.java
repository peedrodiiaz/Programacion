package ejemplo02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		List <String> listaNombres = new ArrayList<String>();
//		
//		listaNombres.add("Pepe");
//		listaNombres.add("Pedro");
//		listaNombres.add("Mario");
//		listaNombres.add("Pedro");
//		System.out.println(listaNombres);
		List<Alumno>listaAlumnos = new ArrayList<Alumno>();
		Secretaria s = new Secretaria(listaAlumnos)	;
		Alumno a1 =  new Alumno("PEDRO", 9.5, "77935958Q");
		Alumno a2 =  new Alumno("Javi", 7.25, "77954418C");
		Alumno a3 = new Alumno("Ivan", 5.2, "164646064X");
		Alumno a4;
		int op;
		String nombre, Dni, dniTemp;
		double notamedia;
		Scanner sc = new Scanner(System.in);
		s.agregarAlumno(a1);
		s.agregarAlumno(a2);
		s.agregarAlumno(a3);
		
		do {
			System.out.println("1. Para agregar alumno");
			System.out.println("2. Para mostra lista");
			System.out.println("3. Para buscar un alumno");
			System.out.println("4. Cambiar nota media a un alumno");
			System.out.println("5. Eliminar un alumno");
			System.out.println("0. Para salir");
			op=Integer.parseInt(sc.next());
			
			switch (op) {
				case 1:
					
					System.out.println("Dime el nombre: ");
					nombre= sc.next();
					System.out.println("Dime tu nota media");
					notamedia=Double.parseDouble(sc.next());
					System.out.println("Dime el DNI");
					Dni=sc.next();
					s.agregarAlumno(new Alumno(nombre, notamedia, Dni));
					
					break;
				case 2:
					
					System.out.println("MOSTRAR ALUMNOS");
					s.mostrarLista();
					break;
					
				case 3:
					
					System.out.println("Mostrar alumno");
					System.out.println("Indica el DNI de un alumno");
					dniTemp=sc.next();
					
					if (s.findbyDNIv2(dniTemp)<0) {
						System.out.println("No encontrado");
					}else {
						System.out.println(s.getListaAlumnos().get(s.findbyDNIv2(dniTemp)));
					}
					
					break;
				case 4:
					
					System.out.println("Indica el DNI del alumno para cambiarle la nota media");
					dniTemp=sc.next();
					System.out.println("Indica la nueva nota media");
					notamedia=Double.parseDouble(sc.next());
					
					if (s.findbyDNIv2(dniTemp)<0) {
						System.out.println("No encontrado");
					}else {
						s.cambiarNotaMedia(dniTemp, notamedia);
						System.out.println("Cambiado");
					}
					
					break;
				case 5:
					System.out.println("Indica el DNI para borrar");
					dniTemp=sc.next();
					
					if (s.findbyDNIv2(dniTemp)<0) {
						System.out.println("No encontrado");
					}else {
						s.eliminarAlumno(s.findbyDNIv2(dniTemp));
						System.out.println("ELIMINADO");
					}
					
				default:
					break;
				}
		} while (op!=0);
		
			System.out.println("Saliedndo");
		
		
//	
//		
//		
//		
//		
//		
//		
//		System.out.println("La nota media de todos los alumnos es: "+ s.calcularNotaMediadetodos() );		
//		
//		s.cambiarNotaMedia("77935958Q", 10);
//		s.elimarAlumnov2(a2);
//		s.mostrarLista();
	
	
	}

}
