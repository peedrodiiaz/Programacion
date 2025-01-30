package ejemplo03_set;

import java.util.Set;

public class Secretaria {

	private Set  <Alumno> listadoAlumnos;

	public Set<Alumno> getListadoAlumnos() {
		return listadoAlumnos;
	}

	public void setListadoAlumnos(Set<Alumno> listadoAlumnos) {
		this.listadoAlumnos = listadoAlumnos;
	}

	public Secretaria(Set<Alumno> listadoAlumnos) {
		super();
		this.listadoAlumnos = listadoAlumnos;
	}

	@Override
	public String toString() {
		return "Secretaria [listadoAlumnos=" + listadoAlumnos + "]";
	}
	
	
	public void agregarAlumno(Alumno a) {
		listadoAlumnos.add(a);
	}
	
	public void devolverLista() {
		
		for (Alumno alumno : listadoAlumnos) {
			System.out.println(alumno);
		}
	}
	
	
}
