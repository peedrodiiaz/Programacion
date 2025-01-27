package Ejemplo03_polmorfismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Figura f;
		Cuadrado c= new Cuadrado("El bonito", "azul",5);
		Figura f2 = new Cuadrado("Cuadrado1","Negro",2);
		Figura F3 = new Circulo("Cirsculo1", "Rosa",4);
		Operaciones_figura op= new Operaciones_figura();
		Figura [] listaFiguras = {f2,F3,c};
		
		
//		if (F3 instanceof Circulo) {
//			((Circulo)F3).mostrarRadianes();
//		}

// 		Solo hago instaceof cuando en un metodo no se lo que va a salir 	
// 		Solo casteamos cuando tenemos que llamar a un método que no esta reescrito 
		
		
//		System.out.println(op.calcularAreaFigura(F3));
//		System.out.println(op.calcularAreaFigura(f2));
//		System.out.println(op.calcularAreaFigura(c));
		System.out.println(op.calcularAreaFiguras(listaFiguras));
		
		
		
		
	
	}

}
