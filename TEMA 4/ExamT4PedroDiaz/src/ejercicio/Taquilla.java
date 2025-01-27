package ejercicio;

import java.util.Arrays;

public class Taquilla {

	private EntradaGeneral [] lista;

	public EntradaGeneral[] getLista() {
		return lista;
	}

	public void setLista(EntradaGeneral[] lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "Taquilla [lista=" + Arrays.toString(lista) + "]";
	}

	public Taquilla(EntradaGeneral[] lista) {
		super();
		this.lista = lista;
	}

	
	public double calcularPrecioCualquiera(EntradaGeneral eg, double descuento, double cantidadExtra) {
		return	eg.calcularPrecioEntrada(descuento, cantidadExtra);
	}
	
	public double calcularRecaudadoAriiba(double descuento, double cantidadExtra) {
		double suma=0.0;
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			if (lista[i].isArriba()) {
				suma+=calcularPrecioCualquiera(lista[i], descuento, cantidadExtra);
			}
		}
		return suma;
		
	}
	
	public double calcularRecaudacionDonativos(double descuento, double porcentajeDonativo, double cantidadExtra) {
		double suma=0.0;
		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			suma+=lista[i].calcularDonativo(descuento, porcentajeDonativo, cantidadExtra);
		}
		return suma;
	}
	
	public double calcularRecogidoVip(double descuento,double donativo, double cantidadExtra) {
		double suma=0.0;
		
		for (int i = 0; i < lista.length&&lista[i]!=null; i++) {
			if (lista[i] instanceof Vip) {
				
				suma += ((Vip)lista[i]).calcularDonativo(descuento, donativo, cantidadExtra);
			}
		}
		return suma;
		
	}
	
	public void devolverTicket() {

		for (int i = 0; i < lista.length && lista[i]!=null; i++) {
			if (lista[i]instanceof Vip) {
				((Vip)lista[i]).valeConsumicion();
			}
		}
	}
	
	
	
	
	
	
	
	
}
