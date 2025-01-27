package practica_examen;

import java.util.Arrays;

public class Gestoria {

	
	Vehiculo [] lista;
	private int numVehiculos;
	
	public void agregarVehiculos (Vehiculo v) {
		lista[numVehiculos]=v;
		numVehiculos++;
	}
	public void listarVehiculos () {
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			System.out.println((i+1)+". "+lista[i]);;
		}
	}
	public Vehiculo[] getLista() {
		return lista;
	}
	public void setLista(Vehiculo[] lista) {
		this.lista = lista;
	}
	public int getNumVehiculos() {
		return numVehiculos;
	}
	public void setNumVehiculos(int numVehiculos) {
		this.numVehiculos = numVehiculos;
	}
	@Override
	public String toString() {
		return "Gestoria [lista=" + Arrays.toString(lista) + ", numVehiculos=" + numVehiculos + "]";
	}
	public Gestoria(Vehiculo[] lista, int numVehiculos) {
		super();
		this.lista = lista;
		this.numVehiculos = numVehiculos;
	}
	
	
	public Vehiculo  findById (int vastidor) {
		boolean encontrado =false;
		int index=0;
		
		for (int i = 0; i < lista.length && lista[i]!=null&&!encontrado; i++) {
			if (lista[i].getVastidor()==vastidor) {
				encontrado=true;
				index=i;
			}
				
		}
		if (encontrado) {
			return lista[index];
		}else {
			return null;
		}
		
		
	}
	
	public boolean saberDisponibilidad (Vehiculo v) {
		return v.isEstado();
		
	}
	public void imprimirEstado (boolean estado) {
		if (estado) {
			System.out.println("El vehiculo esta alquilado");
			
		}else {
			System.out.println("El vehiculo no est alquiliado");
		}
		
	}
	

	public int  findByIdv2 (String matricula) {
		boolean encontrado =false;
		int index=0;
		
		for (int i = 0; i < lista.length && lista[i]!=null&&!encontrado; i++) {
			if (lista[i].getMatricula().equalsIgnoreCase(matricula)) {
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
	
	public boolean cambiarEstado(String Matricula) {
		int index=findByIdv2(Matricula);
		
		if (!lista[index].isEstado()) {
			lista[index].setEstado(true);
			
		}
		
		return lista[index].isEstado();
		
	}
	public void devolverEstadoCAMBIADO(Boolean estado) {
		if (estado) {
			System.out.println("El vehiculo ahora esta alquiionado");
		}else if (!estado) {
			System.out.println("El vehihulo ya estaba alquilado");
		} 
			
	}
	public boolean cambiarEstadov2(String Matricula) {
		int index=findByIdv2(Matricula);
		
		if (lista[index].isEstado()) {
			lista[index].setEstado(false);
			
		}
		
		return lista[index].isEstado();
		
	}
	public void devolverEstadoCAMBIADOv2(Boolean estado) {
		if (estado) {
			System.out.println("El vehiculo esta disponible");
		}else {
			System.out.println("El vehihulo ya estaba adisponible");
		}
	}
	
	public double calcularPrecioTotal (Vehiculo v, int numdias) {
		
		return v.calcularPrecioDIA(numdias);
		
		
		
	}

	
	public Vehiculo[] guardarVehculos() {
		Vehiculo []aux =new Vehiculo[lista.length];
		int index=0;
		
		
		for (int i = 0; i < lista.length&&lista[i]!=null; i++) {
			if (lista[i].isEstado()) {
				aux[index++]=lista[i];
			}
		}
		return aux;
		
		
		
	}
	public double cogerGanancias  (Vehiculo[]aux) {
		double suma=0.0;
		
		for (int i = 0; i < aux.length&&aux[i]!=null; i++) {
			
			suma+=aux[i].getPrecio();	
				
		
			
		}		
	return suma;
	
	
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
