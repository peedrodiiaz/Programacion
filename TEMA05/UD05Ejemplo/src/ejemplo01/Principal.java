package ejemplo01;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Producto p1 = new Producto(2.33, false, "Patata");
		Producto p2 = new Producto(3.5, true, "Healado");
		Producto p3 = new Producto(1.5, true, "FrioPies");
		Producto p4 = new Producto(5.5, true, "Sandía");
		
		List <Producto> listado=  new ArrayList<Producto>() ;
		
		listado.add(p2);
		listado.add(p3);
		listado.add(p4);
//		System.out.println(listado);
//		System.out.println("Tamaño: "+listado.size());
	
		listado.add(p1);
//		System.out.println("Tamaño nuevo "+listado.size());
		
//		System.out.println(listado.remove(p3));
//		System.out.println(listado.remove(2));
//		System.out.println("Tamaño nuevo "+listado.size());
		
		
		for (int i = 0; i < listado.size(); i++) {
			System.out.println(listado.get(i));
		}
		
	}

}
