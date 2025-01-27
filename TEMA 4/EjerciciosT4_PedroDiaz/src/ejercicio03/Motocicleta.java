   package ejercicio03;


class Motocicleta extends Vehiculo {
	    private double cilindrada;

	    public Motocicleta(int categoriaEmisiones, double cantidadFija, double cilindrada) {
	        super(categoriaEmisiones, cantidadFija);
	        this.cilindrada = cilindrada;
	    }

	    @Override
	    public double calcularImpuesto() {
	        return super.calcularImpuesto() +  cilindrada;
	    }

	  
	    public double getCilindrada() {
	        return cilindrada;
	    }

	    public void setCilindrada(double cilindrada) {
	        this.cilindrada = cilindrada;
	    }
	}

