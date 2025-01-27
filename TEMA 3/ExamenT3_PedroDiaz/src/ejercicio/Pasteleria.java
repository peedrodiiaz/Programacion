package ejercicio;

import java.util.Arrays;

public class Pasteleria {

	private String nombre;
	private double presupuestoTotal;
	private int numMagdalenas;
	
	private Magdalena [] lista;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPresupuestoTotal() {
		return presupuestoTotal;
	}

	public void setPresupuestoTotal(double presupuestoTotal) {
		this.presupuestoTotal = presupuestoTotal;
	}

	public Magdalena[] getLista() {
		return lista;
	}

	public void setLista(Magdalena[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Pasteleria [nombre=" + nombre + ", presupuestoTotal=" + presupuestoTotal + ", lista="
				+ Arrays.toString(lista) + "]";
	}

	public Pasteleria(String nombre, double presupuestoTotal, Magdalena[] lista) {
		super();
		this.nombre = nombre;
		this.presupuestoTotal = presupuestoTotal;
		this.lista = lista;
	}
	
	
	public void anadirMagdalenas(Magdalena m) {
		lista[numMagdalenas]=m;
		numMagdalenas++;
	}
	
	
	
	public Magdalena [] buscarMagdalena (String sabor) {
		Magdalena [] aux = new Magdalena [lista.length];
		int index=0;
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			if (lista[i].getSabor().equalsIgnoreCase(sabor)) {
				aux[index++]=lista[i];
			}
	
		}
		return aux;	
		
	}
	
	public Magdalena [] buscarMagdalenav2 () {
		Magdalena [] aux = new Magdalena [lista.length];
		int index=0;
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			if (lista[i].isTipo()) {
				aux[index++]=lista[i];
			}
			
		}
		
		return aux;
	}
	public Magdalena [] buscarMagdalenav3 () {
		Magdalena [] aux = new Magdalena [lista.length];
		int index=0;
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			if (!lista[i].isTipo()) {
				aux[index++]=lista[i];
			}
			
		}
		
		return aux;
	}
	public double calcularMagNor (Magdalena []aux, double precioMas) {
		double suma=0;
		for (int i = 0; i < aux.length && aux[i]!=null; i++) {
		
			suma+=calcularPrecioFab(aux[i].getId(), precioMas);
					
		}
		return suma;
	}
	
	
		
	public void devolverCupKakes (Magdalena []aux) {
		for (int i = 0; i < aux.length && aux[i]!=null; i++) {
			System.out.println(aux[i]);
		}
	}
	
	
	
	public void devolverMagSabor (Magdalena []aux) {
		for (int i = 0; i < aux.length && aux[i]!=null; i++) {
			System.out.println(aux[i]);
		}
	}

	public int findByID (int id) {
		int index=0;
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			if (lista[i].getId()==id) {
				index=i;
			}
		}
		return index;
	}
	
	public double verCauntosCuestaMag (int index, double precio) {
		double res;
		res=calcularPrecioFab(lista[index].getId(),precio );
			return res;
	}
	
	public double devolverPorcentaje (double res) {
	
	double porcentaje=100;
		return (res*porcentaje)/presupuestoTotal;
	
	}
	
	
	
	public void devolverSaborByID (int index) {
		
			System.out.println(lista[index].getSabor());
		
	}
	
	public double calcularPrecioFab (int id, double precioMasA) {
		double res=0.0;
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			if (lista[i].getId()==id) {
				res=lista[i].getVolumen();
			}
		}
		return res*precioMasA;
		}
		
	
	public double mediaVolumen () {
		double suma=0;
		
		for (int i = 0; i < lista.length && lista [i]!=null; i++) {
			if (lista[i]!=null) {
				suma+=lista[i].getVolumen();
			}
		}
		return suma/numMagdalenas;
		
		
	}
	

	
	
	
	
	
	
	
	
}
