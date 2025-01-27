//Hecho por Pedro
package controller;

	import model.Preguntas;
	
public class ControllerPregunta {
	
	public boolean verificarRes(String respuestaUsario, Preguntas p) {
		
		boolean res=false;
		if (respuestaUsario.equals(p.getRespuestaCorrecta())) {
			res=true;
		}	
		return res;
	}
	
	
	
	
	
}
