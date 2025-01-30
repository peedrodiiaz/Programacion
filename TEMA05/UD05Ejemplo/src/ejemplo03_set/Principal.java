package ejemplo03_set;


import java.util.HashSet;
import java.util.Set;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Set <Alumno> listAlumnos = new HashSet<Alumno>();
		Secretaria s = new Secretaria(listAlumnos);
	
		listAlumnos.add(new Alumno("Pedro", 9.75, "77935958Q"));
		listAlumnos.add(new Alumno("Miguel", 8.75, "77935934C"));
		
		System.out.println(listAlumnos);
		s.devolverLista();
		
		
		
		
	}

}
