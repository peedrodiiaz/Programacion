package ejercicio03;

class Coche extends Vehiculo {
    private double potencia;

    public Coche(int categoriaEmisiones, double cantidadFija, double potencia) {
        super(categoriaEmisiones, cantidadFija);
        this.potencia = potencia;
    }

    public double calcularImpuesto() {
        return super.calcularImpuesto() +  potencia;
    }


    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
}

