//Hecho por Pedro

package vista;

import model.Preguntas;


public class VistaPreguntas {
	
	
    public void mostrarPregunta(Preguntas preguntaRandom) {
            if(!preguntaRandom.isUsado()) {
            	System.out.println("Pregunta: " + preguntaRandom.getPregunta());
                System.out.println("Opciones:");
                System.out.println("  a) " + preguntaRandom.getRespuestaUno());
                System.out.println("  b) " + preguntaRandom.getRespuestaDos());
                System.out.println("  c) " + preguntaRandom.getRespuestaTres());
            }
    }
    
    public void mostrarTodasPreguntas(Preguntas [] lista) {
    	
    	for(int i=0;i<lista.length && lista[i]!=null;i++) {
    		System.out.println();
    		System.out.println("Pregunta: " + lista[i].getPregunta());
            System.out.println("Opciones:");
            System.out.println("  a) " + lista[i].getRespuestaUno());
            System.out.println("  b) " + lista[i].getRespuestaDos());
            System.out.println("  c) " + lista[i].getRespuestaTres());
            System.out.println("Respuesta correcta: " + lista[i].getRespuestaCorrecta());
            System.out.println();
    	}
    }
}
	





