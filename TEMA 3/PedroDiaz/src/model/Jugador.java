//Hecho por Javi

package model;

public class Jugador {
	
	private String nombre;
    private int vida;
    private int comodines;
    private double dinero;

    public Jugador(String nombre, int vida, int comodines, double dinero) {
        this.nombre = nombre;
        this.vida = vida;
        this.comodines = comodines;
        this.dinero = dinero;
    }

    public Jugador() {
		super();
	}

	public String getNombre() {
        return nombre;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getComodines() {
        return comodines;
    }

    public void setComodines(int comodines) {
        this.comodines = comodines;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }
    
}
