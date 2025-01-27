package ejercicio01;

public class Portatil extends Ordenador {
		private boolean seguro;
		private double precioSeguro;
		
		@Override
		public String toString() {
			return "Portatil [seguro=" + seguro + ", precioSeguro=" + precioSeguro + "]";
		}

		public Portatil(double capacidadDisco, double frecuencia, double precioBase, String marca, boolean seguro,
				double precioSeguro) {
			super(capacidadDisco, frecuencia, precioBase, marca);
			this.seguro = seguro;
			this.precioSeguro = precioSeguro;
		}

		public boolean isSeguro() {
			return seguro;
		}

		public void setSeguro(boolean seguro) {
			this.seguro = seguro;
		}

		public double getPrecioSeguro() {
			return precioSeguro;
		}

		public void setPrecioSeguro(double precioSeguro) {
			this.precioSeguro = precioSeguro;
		}

		public double calcularPrecioVenta (double porcentaje) {
			
			if (seguro) {
				return super.calcularPrecioVenta(porcentaje)+precioSeguro;
			}else {
				return super.calcularPrecioVenta(porcentaje);			
			}
			
		
		}


}
