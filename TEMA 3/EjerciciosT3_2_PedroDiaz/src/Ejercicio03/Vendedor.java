package Ejercicio03;



public class Vendedor {

	private int totalMovilesVendidos;
	Movil [] lista;
	
	public Vendedor(int totalMovilesVendidos, Movil[] lista) {
		super();
		this.totalMovilesVendidos = totalMovilesVendidos;
		this.lista = lista;
	}


	
	
	public int movilesSinVender() {
		return lista.length-totalMovilesVendidos;
	}
	
	
	
	
	public double cuentaTotal ( double descuento) {
		double suma=0.0;
		
			for (int i = 0; i < lista.length; i++) {
				
			 if (lista[i].isNuevo()) {
				suma+=lista[i].getPrecioUni();
			}else {
				descuento=lista[i].getPrecioUni()*descuento/100;
				suma+=lista[i].getPrecioUni()-descuento;
			}
			
			}
		return suma;
		}
		
	public double devolverPrecioUni(String modelo, double descuento) {
		double res=0.0;

		for (int i = 0; i < lista.length; i++) {
			if (lista[i].getModelo().equalsIgnoreCase(modelo)) {
				if (lista[i].isNuevo()) {
					res=lista[i].getPrecioUni();
				}else {
					descuento=lista[i].getPrecioUni()*descuento/100;
					res=lista[i].getPrecioUni()-descuento;
				}
				
			}
			
		}
		return res;
	}
	
	public int buscarModelo(String modelo){
		int index=0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i].getModelo().equalsIgnoreCase(modelo)) {
				index=i;
			}
		}
		return index;
	}
	
	public void cambiarMovil (int index, String marca,String modelo, boolean vendido, boolean nuevo, double precioUni) {
		lista[index]= new Movil(marca, modelo, vendido, nuevo, precioUni);
		
	}
	
	public void cambiarMovil (int index, Movil m1) {
		lista[index]= m1;
		
	}
	
	public String nuevaMarca(String marca, int index) {
		lista[index].setMarca(marca);;
		return marca;
	}
	public String nuevoModelo(String modelo, int index) {
		lista[index].setModelo(modelo);
		return modelo;
	}
	public boolean nuevoVendido(boolean vendido, int index) {
		lista[index].setVendido(vendido);
		return vendido;
	}
	public boolean nuuevoNuevo(boolean nuevo, int index) {
		lista[index].setNuevo(nuevo);
		return nuevo;
	}
	public double nuevoPrecioUni(double precioUni, int index) {
		lista[index].setPrecioUni(precioUni);
		return precioUni;
	}
	public void listarMoviles(Movil[]lista) {
		for (int i = 0; i < lista.length; i++) {
			System.out.println(lista[i]);
		}
	
}
}
	
	
	
	

