//Hecho por Javi
package crud;

import model.Jugador;
import model.Dinero;

	public class CrudJugador {
	    public Jugador crearJugador(String nombre) {
	        return new Jugador(nombre, 3, 1, 0);
	    }
	
		public void sumarDinero(Dinero d, Jugador J1, int contPreg) {
			double valorPregunta;
			
			valorPregunta=d.getBote()/contPreg;
				
			J1.setDinero(J1.getDinero()+valorPregunta);
			
		}
		public void restarVida(Jugador j1) {
		    
		    j1.setVida(j1.getVida() - 1); 
		    
		}
		public void restarComodin (Jugador j1) {
			j1.setComodines(j1.getComodines()-1);
		}
		public void recuComodin (Jugador j1) {
			
			
				j1.setComodines(1);
				
			
		
		}



}