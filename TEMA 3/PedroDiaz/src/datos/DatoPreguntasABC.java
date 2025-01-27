//Hecho por Mauro

package datos;

import java.util.Arrays;

import model.Preguntas;

public class DatoPreguntasABC {
    private Preguntas[] lista;
    
    public  DatoPreguntasABC() {
    	this.lista = new Preguntas[100]; //El tamaño es 100 por si el moderador desea añadir mas preguntas
    	this.lista[0] = new Preguntas("¿Cuál es la capital de España?", "Barcelona", "Sevilla", "Madrid", "Madrid", false);
    	this.lista[1] = new Preguntas("¿Quién escribió Don Quijote?", "Gabriel García Márquez", "Becquer", "Cervantes", "Cervantes", false);
    	this.lista[2] = new Preguntas("¿Cuál es el río más largo del mundo?", "Nilo", "Danubio", "Amazonas", "Nilo", false);
    	this.lista[3] = new Preguntas("¿Qué país tiene forma de bota?", "España", "Italia", "Francia", "Italia", false);
    	this.lista[4] = new Preguntas("¿Cuál es el planeta más cercano al sol?", "Venus", "Marte", "Mercurio", "Mercurio", false);
    	this.lista[5] = new Preguntas("¿Qué lengua se habla en Brasil?", "Español", "Portugués", "Francés", "Portugués", false);
    	this.lista[6] = new Preguntas("¿Qué gas es esencial para respirar?", "Hidrógeno", "Oxígeno", "Nitrógeno", "Oxígeno", false);
    	this.lista[7] = new Preguntas("¿Qué animal es conocido como el rey de la selva?", "Tigre", "Elefante", "León", "León", false);
    	this.lista[8] = new Preguntas("¿Qué metal es líquido a temperatura ambiente?", "Plata", "Mercurio", "Cobre", "Mercurio", false);
    	this.lista[9] = new Preguntas("¿Cuántos días tiene un año bisiesto?", "364", "365", "366", "366", false);
    	this.lista[10] = new Preguntas("¿Qué país tiene más población en el mundo?", "India", "Estados Unidos", "China", "China", false);
    	this.lista[11] = new Preguntas("¿Qué océano es el más grande del mundo?", "Atlántico", "Índico", "Pacífico", "Pacífico", false);
    	this.lista[12] = new Preguntas("¿Quién pintó la Mona Lisa?", "Vincent van Gogh", "Leonardo da Vinci", "Pablo Picasso", "Leonardo da Vinci", false);
    	this.lista[13] = new Preguntas("¿Qué instrumento tiene teclas blancas y negras?", "Guitarra", "Piano", "Violín", "Piano", false);
    	this.lista[14] = new Preguntas("¿Qué deporte practica Rafael Nadal?", "Fútbol", "Tenis", "Baloncesto", "Tenis", false);
        
    }

	@Override
	public String toString() {
		return "DatoPreguntasABC [lista=" + Arrays.toString(lista) + "]";
	}
	

	public Preguntas[] getLista() {
		return lista;
	}

	public void setLista(Preguntas[] lista) {
		this.lista = lista;
	}

   
    
}
