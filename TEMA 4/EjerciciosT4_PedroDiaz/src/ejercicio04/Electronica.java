package ejercicio04;

public class Electronica extends Producto {

	private boolean deLujo;

	public boolean isDeLujo() {
		return deLujo;
	}

	public void setDeLujo(boolean deLujo) {
		this.deLujo = deLujo;
	}

	@Override
	public String toString() {
		return "Electronica [deLujo=" + deLujo + "]";
	}

	public Electronica(double precioUnitario, String nombre, int id, boolean deLujo) {
		super(precioUnitario, nombre, id);
		this.deLujo = deLujo;
	}
	
	public double calcularPVP(int iva, int descuento, int numDiasProducto) {
		if (deLujo) {
			return super.calcularPVP(iva, descuento, numDiasProducto)+super.calcularPVP(iva, descuento, numDiasProducto)*descuento/100;
		}else {
			return super.calcularPVP(iva, descuento, numDiasProducto);
		}
	}
	
	
	
}
