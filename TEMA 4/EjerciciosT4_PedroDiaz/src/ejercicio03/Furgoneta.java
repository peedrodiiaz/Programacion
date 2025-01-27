package ejercicio03;

class Furgoneta extends Vehiculo {
    private double cantidadFijaTransporte;

    public Furgoneta(int categoriaEmisiones, double cantidadFija, double cantidadFijaTransporte) {
        super(categoriaEmisiones, cantidadFija);
        this.cantidadFijaTransporte = cantidadFijaTransporte;
    }

    @Override
    public double calcularImpuesto() {
        return super.calcularImpuesto() + cantidadFijaTransporte;
    }

    // Getter y setter
    public double getCantidadFijaTransporte() {
        return cantidadFijaTransporte;
    }

    public void setCantidadFijaTransporte(double cantidadFijaTransporte) {
        this.cantidadFijaTransporte = cantidadFijaTransporte;
    }
}
