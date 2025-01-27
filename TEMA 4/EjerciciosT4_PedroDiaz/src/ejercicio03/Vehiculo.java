package ejercicio03;

public class Vehiculo {
	
	    private int categoriaEmisiones; 
	    private double cantidadFija;

	    public Vehiculo(int categoriaEmisiones, double cantidadFija) {
	        this.categoriaEmisiones = categoriaEmisiones;
	        this.cantidadFija = cantidadFija;
	    }

	    public double calcularImpuesto() {
	        return cantidadFija;
	    }

	  
	    public int getCategoriaEmisiones() {
	        return categoriaEmisiones;
	    }

	    public void setCategoriaEmisiones(int categoriaEmisiones) {
	        this.categoriaEmisiones = categoriaEmisiones;
	    }

	    public double getCantidadFija() {
	        return cantidadFija;
	    }

	    public void setCantidadFija(double cantidadFija) {
	        this.cantidadFija = cantidadFija;
	    }
	}

