package Ejercicio01;

import java.util.Arrays;

public class Tienda {

	private Producto [] lista;

	public Producto[] getLista() {
		return lista;
	}

	public void setLista(Producto[] lista) {
		this.lista = lista;
	}

	public Tienda(Producto[] lista) {
		super();
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Tienda [lista=" + Arrays.toString(lista) + "]";
	}


	public void listarProductos(int np) {
		for (int i = 0; i < np; i++) {
			System.out.println(lista[i]);
		}
		
	}
	public boolean esFragil(int id, int np) {
		boolean res=false;
		for (int i = 0; i < np; i++) {
			if (lista[i].getId()==id) {
				if (lista[i].isFragil()) {
					res=true;
				} else {
					res=false;
				}
		
			}
		}
		return res;
		
	}
	
	public void devolverBoolean(boolean res) {
		if (res) {
			System.out.println("Es fragil");
		}else {
			System.out.println("No es fragil");
		}
	}

	public void aniadirProducto (int id, double precioFabrica, String nombre, boolean fragil, int seccion,int numeroProducto) {

		lista[numeroProducto]=new Producto(precioFabrica, id, seccion, nombre, fragil);
	

	}
	
	public double calcularCantidadInvertidad(int numeroProducotos) {
		double suma=0;
		
		for (int i = 0; i < numeroProducotos; i++) {
			suma+=lista[i].getPrecioFabrica();
			
		}
		return suma;
		
	}
	
	public void devolverCantidadInvertida (double suma) {
		
		System.out.printf("La cantidad invertida es %.2f€\n",suma);
	}	
	
	public double calcularPVP(int id, double porcentaje,int np){
		double total=0;
		
		for (int i = 0; i < np; i++) {
			if (lista[i].getId()==id) {
				total=lista[i].calcularPrecioCoste(porcentaje);
				
			}
		
		
	}
		return total;
	
	}
	
	
	public double calcularPVP( double porcentaje, int np){
		double total=0;
		
		for (int i = 0; i < np; i++) {
			
				total=lista[i].calcularPrecioCoste(porcentaje);
				
			}
		
		return total;
	}
		
	public void devolverPVP(int id, double porcentaje, int np) {
		System.out.printf("El precio de venta al publico es  %.2f\n",calcularPVP(id, porcentaje, np));
	}
	
	
	public double calcularGanancia(double porcentaje, int numeroProductos) {
	
		return calcularPVP(porcentaje, numeroProductos)-calcularCantidadInvertidad(numeroProductos);
		
	}
	
	public void devolverGnancia(double porcentaje, int numeroProductos) {
		System.out.printf("La ganancia es %.2f\n", calcularGanancia(porcentaje, numeroProductos));
	}
	
	public Producto[] encontarNombres (String nombre) {
		Producto [] aux =new Producto[lista.length];
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].getNombre().equalsIgnoreCase(nombre)) {
				aux[i]=lista[i];
				
			}
		
		}		
	return aux;
	}
	
	public void devolverNombres(Producto[]aux) {
		for (int i = 0; i < aux.length; i++) {
			System.out.println(aux);
		}
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
