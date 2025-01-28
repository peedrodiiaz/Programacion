package ejemplo02;

import java.util.List;

public class Secretaria {
	
	//trabajamos con el tipo en general

	private List<Alumno>listaAlumnos;

	public List<Alumno> getListaAlumnos() {
		return listaAlumnos;
	}

	public void setListaAlumnos(List<Alumno> listaAlumnos) {
		this.listaAlumnos = listaAlumnos;
	}

	@Override
	public String toString() {
		return "Secretaria [listaAlumnos=" + listaAlumnos + "]";
	}

	public Secretaria(List<Alumno> listaAlumnos) {
		super();
		this.listaAlumnos = listaAlumnos;
	}
	
	public void agregarAlumno (Alumno A) {
		listaAlumnos.add(A);
	}
	
	public Alumno findByDNI (String dni) {
		boolean encontrado=false;
		Alumno alumno= null;
		for (int i = 0; i < listaAlumnos.size(); i++) {
			if (listaAlumnos.get(i).getDni().equalsIgnoreCase(dni)) {
				encontrado=true;
				alumno= listaAlumnos.get(i);
			}else {
				encontrado=false;
			}
		}
		if (encontrado) {
			return alumno; 
		}else {
			return null;
		}
	}
	
	public int findbyDNIv2 (String DNI) {
		boolean encontrado=false;
		int index=-1;
		for (int i = 0; i < listaAlumnos.size(); i++) {
			if (listaAlumnos.get(i).getDni().equalsIgnoreCase(DNI)) {
				encontrado=true;
				index=i;
			}
		}
		if (encontrado) {
			return index; 
		}else {
			return -1;
		}
	
	}
	
	
	public void eliminarAlumno(int index) {
		
		listaAlumnos.remove(index);
		
	}
	public void elimarAlumnov2(Alumno a) {
		listaAlumnos.remove(a);
		
	}
	
	public void mostrarLista() {
		for (Alumno alumno : listaAlumnos) {
			System.out.println(alumno);
		}
	}
	
	
	public void cambiarNotaMedia(String dni, double notaMedia) {
		int index;
		index = findbyDNIv2(dni);
		
		
		listaAlumnos.get(index).setNotaMedia(notaMedia);
		
		
	}
	
	public double calcularNotaMediadetodos() {
		double suma=0.0;
		for (Alumno alumno : listaAlumnos) {
			suma+=alumno.getNotaMedia();
		}
		return suma;
	}
	
		
		
		
}
	
	
	
	
	
	

