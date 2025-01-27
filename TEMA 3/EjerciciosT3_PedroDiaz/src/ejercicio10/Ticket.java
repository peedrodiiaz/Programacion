package ejercicio10;

public class Ticket {
	private int numeroPersonas;
    private double precioTotal;
    
	public Ticket(int numeroPersonas, double precioTotal) {
		super();
		this.numeroPersonas = numeroPersonas;
		this.precioTotal = precioTotal;
	}


	public int getNumeroPersonas() {
		return numeroPersonas;
	}



	public void setNumeroPersonas(int numeroPersonas) {
		this.numeroPersonas = numeroPersonas;
	}


	public double getPrecioTotal() {
		return precioTotal;
	}


	public void setPrecioTotal(double precioTotal) {
		this.precioTotal = precioTotal;
	}


		@Override
	public String toString() {
		return "Ticket [numeroPersonas=" + numeroPersonas + ", precioTotal=" + precioTotal + "]";
	}

	public void imprimir() {
	        System.out.println("------ TICKET DE METRO ------");
	        System.out.printf("Válido para %d persona(s)\n", numeroPersonas);
	        System.out.printf("Precio total: %.2f€\n", precioTotal);
	        System.out.println("-----------------------------");
	    }
}
