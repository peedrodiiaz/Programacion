package ejercicio03;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	Motocicleta moto;
	        Furgoneta furgoneta ;
	        Coche coche;
	        int emisionMoto, emisionCoche, emisionFugoneta;
	        System.out.println("1. ECO");
	        System.out.println("2. 0 Emisiones");
	        System.out.println("3. B");
	        System.out.println("4. C");
	        
	        
	        System.out.println("Indica como va a ser la moto");	        
	        emisionMoto=Leer.datoInt();
	        System.out.println("Indica como va a ser el coche");
	        emisionCoche=Leer.datoInt();
	        System.out.println("Indica como va a ser la furgoneta");
	        emisionFugoneta=Leer.datoInt();
	        
	        moto = new Motocicleta(emisionMoto, 50, 0);
	        furgoneta = new Furgoneta(emisionFugoneta, 100, 0);
	        coche = new Coche(emisionCoche, 150, 0);
	        
	        switch (emisionCoche) {
			case 1:
				coche.setCantidadFija(100);
				break;
			case 2:
				coche.setCantidadFija(125);
				break;
			case 3:
				coche.setCantidadFija(150);
				break;
			case 4:
				coche.setCantidadFija(200);
			default:
				break;
			}
	        switch (emisionMoto) {
			case 1:
				moto.setCantidadFija(100);
				break;
			case 2:
				moto.setCantidadFija(125);
				break;
			case 3:
				moto.setCantidadFija(150);
				break;
			case 4:
				moto.setCantidadFija(200);
			default:
				break;
			}
	        switch (emisionFugoneta) {
			case 1:
				furgoneta.setCantidadFija(100);
				break;
			case 2:
				furgoneta.setCantidadFija(125);
				break;
			case 3:
				furgoneta.setCantidadFija(150);
				break;
			case 4:
				furgoneta.setCantidadFija(200);
			default:
				break;
			}
	        
	        
	        
	        System.out.println("Impuesto de la motocicleta: " + moto.calcularImpuesto());
	        System.out.println("Impuesto de la furgoneta: " + furgoneta.calcularImpuesto());
	        System.out.println("Impuesto del coche: " + coche.calcularImpuesto());
	}

}
