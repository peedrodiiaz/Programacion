package ejercicio01;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int indice;
		Nota n1 = new Nota(23, "Compras", "manzana,sandia");
		Nota n2 = new Nota(1, "Cosas", "Deberes");
		Nota n3 = new Nota(2, "MAS", "algo");
		
		Scanner sc = new Scanner(System.in);
		
		List<Nota> lista = new ArrayList<Nota>();
		
		gestionNotas gn = new gestionNotas(lista);
		gn.agregarNota(n3);
		gn.agregarNota(n2);
		gn.agregarNota(n1);
	
		System.out.println("Selecciona el indice de la nota para borrar");
		gn.devolverNotas();		
		indice=sc.nextInt();
		gn.borraNota(indice);
		System.out.println("El número de notas guardadas es ");
		gn.numDeNotas();
		gn.devolverNotas();
		
		}

}
