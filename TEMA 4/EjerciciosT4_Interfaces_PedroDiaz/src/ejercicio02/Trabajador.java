package ejercicio02;

public class Trabajador implements IImpuesto {
	
	private double irpf;
	

	public Trabajador(double irpf) {
		super();
		this.irpf = irpf;
	}

	@Override
	public String toString() {
		return "Trabajador [irpf=" + irpf + "]";
	}

	public double getIrpf() {
		return irpf;
	}

	public void setIrpf(double irpf) {
		this.irpf = irpf;
	}

	@Override
	public double calcularIva(int iva) {
		return 0;
	}

	@Override
	public double calculoIrpf(double sueldo) {
		return sueldo - sueldo * irpf/100;
	}

		
	
	
}
