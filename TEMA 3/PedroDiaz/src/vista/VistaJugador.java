//Hecho por Javi
package vista;

import model.Jugador;

public class VistaJugador {
	
	public void mostrarCaracteristicasJugador(Jugador jugador) {
        System.out.println("Jugador: " + jugador.getNombre());
        System.out.println("Vida: " + jugador.getVida());
        System.out.println("Comodines: " + jugador.getComodines());
        System.out.println("Dinero: " + jugador.getDinero());
    }
}
