//Hecho por Pedro

package model;

public class Preguntas {

	private String pregunta;
    private String respuestaUno;
    private String respuestaDos;
    private String respuestaTres;
    private String respuestaCorrecta;
    private boolean usado;
	
    public Preguntas(String pregunta, String respuestaUno, String respuestaDos, String respuestaTres,
			String respuestaCorrecta, boolean usado) {
		this.pregunta = pregunta;
		this.respuestaUno = respuestaUno;
		this.respuestaDos = respuestaDos;
		this.respuestaTres = respuestaTres;
		this.respuestaCorrecta = respuestaCorrecta;
		this.usado = usado;
	}

	public String getPregunta() {
		return pregunta;
	}

	public void setPregunta(String pregunta) {
		this.pregunta = pregunta;
	}

	public String getRespuestaUno() {
		return respuestaUno;
	}

	public void setRespuestaUno(String respuestaUno) {
		this.respuestaUno = respuestaUno;
	}

	public String getRespuestaDos() {
		return respuestaDos;
	}

	public void setRespuestaDos(String respuestaDos) {
		this.respuestaDos = respuestaDos;
	}

	public String getRespuestaTres() {
		return respuestaTres;
	}

	public void setRespuestaTres(String respuestaTres) {
		this.respuestaTres = respuestaTres;
	}

	public String getRespuestaCorrecta() {
		return respuestaCorrecta;
	}

	public void setRespuestaCorrecta(String respuestaCorrecta) {
		this.respuestaCorrecta = respuestaCorrecta;
	}

	public boolean isUsado() {
		return usado;
	}

	public void setUsado(boolean usado) {
		this.usado = usado;
	}
    
    
    
}
