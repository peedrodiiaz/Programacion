package Ejercicio02;

public class Hotel {

	private Habitacion [] lista;

	public Hotel(Habitacion[] lista) {
		super();
		this.lista = lista;
	}
	

	public void anadirhabitacion(int nhab,double precio, String servicio, String nombre, int nDias, boolean limpio, double precioMinibar,
			double precioExtra, boolean ocupado) {
		lista [nhab]=new Habitacion(precio, servicio, nombre, nDias, limpio, precioMinibar, precioExtra, limpio, ocupado);
		
			
		
	}
	public boolean estaocupada(int nhab, String nombre) {
		boolean res=false;
		for (int i = 0; i < nhab; i++) {
			if (lista[i].getNombre().equals(nombre)) {
				if (lista[i].isOcupado()) {
					res=true;
				}
				
			}
			
		}
		return res;
	}
	
	public void devolverOcup (boolean res) {
		if (res) {
			System.out.println("La habitación esta ocupada");
			
		}else {
			System.out.println("La habitacion NO esta ocupada");
		}
	
	}
	
	public double calcularPrecioFinal(String nombreHab, int nhab) {
		double suma=0.0;
		
		for (int i = 0; i < nhab; i++) {
			if (lista[i].getNombre().equalsIgnoreCase(nombreHab)) {
				suma+=(lista[i].getPrecioMinibar()*lista[i].getnDias())+(lista[i].getPrecio()*lista[i].getnDias())+(lista[i].getPrecioExtra()*lista[i].getnDias());
			}
		}		
		return suma;
	}
	
	public void encontrarHab(String habTicket, int nhab) {
		
		for (int i = 0; i < nhab; i++) {
			if (lista[i].getNombre().equalsIgnoreCase(habTicket)) {
				devolverTicket(i,nhab);
			
			}else {
				System.out.println("Habitación no encontrada");	
			}
		}
	
	}
	
	
	public void devolverTicket (int index, int nhab) {
		
			System.out.println("-----Ticket de la habitación-----");
			System.out.println("Nº Días \t"+lista[index].getnDias());
			System.out.println("Habitación \t"+lista[index].getPrecio());
			System.out.println("Gasto Bar \t"+lista[index].getPrecioMinibar());
			System.out.println("Servio Extra: \t"+lista[index].getServicio());
			System.out.println("Precio Serv Extra\t"+lista[index].getPrecioExtra());
			System.out.println("-----------------------------------");
		
			System.out.println("Precio TOTAL:"+calcularPrecioFinal(lista[index].getNombre(),nhab));
			System.out.println();
			
		
		}
	}
	
	
	
	

