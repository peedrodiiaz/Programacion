package ejemplo01;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Producto p1 = new Producto(2.33, false, "Patata");
		Producto p2 = new Producto(3.5, true, "Healado");
		
		List <Producto> listado=  new ArrayList<Producto>();
		
		listado.add(p2);
		
		System.out.println(listado);
		
		
		
	}

}
