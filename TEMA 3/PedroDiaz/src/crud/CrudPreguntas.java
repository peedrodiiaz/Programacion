//Hecho por Pedro
package crud;

import datos.DatoPreguntasABC;
import model.Preguntas;

public class CrudPreguntas {
    private DatoPreguntasABC datos;
    

  
    public CrudPreguntas(DatoPreguntasABC datos) {
    	this.datos =datos;
    }

    public Preguntas buscarPregunta(int id, int contPreguntas) {
        Preguntas preguntaBuscada=null;
    	
    	if (id >= 0 && id <= contPreguntas) {
    		preguntaBuscada=datos.getLista()[id];
        } 
        return preguntaBuscada;
    }
    public void marcarUsada(Preguntas p) {
    		p.setUsado(true);
    
    }

       	
    	public void actualizarPregunta(int numPregunta, Preguntas px) {    
    	    if (numPregunta >= 0 && numPregunta < datos.getLista().length && datos.getLista()[numPregunta] != null) {
    	        datos.getLista()[numPregunta].setPregunta(px.getPregunta());
    	        datos.getLista()[numPregunta].setRespuestaUno(px.getRespuestaUno());
    	        datos.getLista()[numPregunta].setRespuestaDos(px.getRespuestaDos());
    	        datos.getLista()[numPregunta].setRespuestaTres(px.getRespuestaTres());
    	        datos.getLista()[numPregunta].setRespuestaCorrecta(px.getRespuestaCorrecta());
    	        }
    }
    public void ponerUsadas () {
    	
    }
    	
    
    
    public void marcarPreguntaUsada(Preguntas P) {
          P.setUsado(true);  
            
        }
    
    public void agregarPregunta(int numPregunta ,Preguntas p) {
    
	       
	             datos.getLista()[numPregunta] = p;
        
    }
}

