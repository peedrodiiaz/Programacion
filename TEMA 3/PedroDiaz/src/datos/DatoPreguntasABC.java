//Hecho por Mauro

package datos;

import java.util.Arrays;

import model.Preguntas;

public class DatoPreguntasABC {
    private Preguntas[] lista;
    
    public  DatoPreguntasABC() {
    	this.lista = new Preguntas[100]; //El tama�o es 100 por si el moderador desea a�adir mas preguntas
    	this.lista[0] = new Preguntas("�Cu�l es la capital de Espa�a?", "Barcelona", "Sevilla", "Madrid", "Madrid", false);
    	this.lista[1] = new Preguntas("�Qui�n escribi� Don Quijote?", "Gabriel Garc�a M�rquez", "Becquer", "Cervantes", "Cervantes", false);
    	this.lista[2] = new Preguntas("�Cu�l es el r�o m�s largo del mundo?", "Nilo", "Danubio", "Amazonas", "Nilo", false);
    	this.lista[3] = new Preguntas("�Qu� pa�s tiene forma de bota?", "Espa�a", "Italia", "Francia", "Italia", false);
    	this.lista[4] = new Preguntas("�Cu�l es el planeta m�s cercano al sol?", "Venus", "Marte", "Mercurio", "Mercurio", false);
    	this.lista[5] = new Preguntas("�Qu� lengua se habla en Brasil?", "Espa�ol", "Portugu�s", "Franc�s", "Portugu�s", false);
    	this.lista[6] = new Preguntas("�Qu� gas es esencial para respirar?", "Hidr�geno", "Ox�geno", "Nitr�geno", "Ox�geno", false);
    	this.lista[7] = new Preguntas("�Qu� animal es conocido como el rey de la selva?", "Tigre", "Elefante", "Le�n", "Le�n", false);
    	this.lista[8] = new Preguntas("�Qu� metal es l�quido a temperatura ambiente?", "Plata", "Mercurio", "Cobre", "Mercurio", false);
    	this.lista[9] = new Preguntas("�Cu�ntos d�as tiene un a�o bisiesto?", "364", "365", "366", "366", false);
    	this.lista[10] = new Preguntas("�Qu� pa�s tiene m�s poblaci�n en el mundo?", "India", "Estados Unidos", "China", "China", false);
    	this.lista[11] = new Preguntas("�Qu� oc�ano es el m�s grande del mundo?", "Atl�ntico", "�ndico", "Pac�fico", "Pac�fico", false);
    	this.lista[12] = new Preguntas("�Qui�n pint� la Mona Lisa?", "Vincent van Gogh", "Leonardo da Vinci", "Pablo Picasso", "Leonardo da Vinci", false);
    	this.lista[13] = new Preguntas("�Qu� instrumento tiene teclas blancas y negras?", "Guitarra", "Piano", "Viol�n", "Piano", false);
    	this.lista[14] = new Preguntas("�Qu� deporte practica Rafael Nadal?", "F�tbol", "Tenis", "Baloncesto", "Tenis", false);
        
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
