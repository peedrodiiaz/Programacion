package Ejercicio01;

import utilidades.Leer;

public class Principal {

	 public static void main(String[] args) {
		 String nombre;
		 String aula;
		 String fecha;
		 
		 System.out.println("Dime el nombre de la asig");
		 nombre=Leer.dato();
		 System.out.println("Dime el nombre del AULA");
		 aula=Leer.dato();
		 System.out.println("Dime la fecha del examen");
		 fecha=Leer.dato();
	        Examen e = new Examen(nombre, aula,fecha);
	        e.imprimirCabecera();
	    }

}
