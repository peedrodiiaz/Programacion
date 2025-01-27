package Ejemplo03_polmorfismo;

public class Operaciones_figura {

	public double calcularAreaFigura (Figura f) {
		return f.calculararea();
	
	}
	
	public double calcularAreaFiguras(Figura[]listaFiguras) {
		double suma=0;
		Circulo c;
		for (int i = 0; i < listaFiguras.length; i++) {
			if (listaFiguras[i] instanceof Circulo) {
				((Circulo)listaFiguras[i]).mostrarRadianes();
	
//				 Otra opción es meter el casteo en una variable del tipo que queramos
			
				
				  c= ((Circulo)listaFiguras[i]);
				  c.mostrarRadianes();
			}
			suma+=calcularAreaFigura(listaFiguras[i]);
		}
		return suma;
	}
	
	
	
	
}
