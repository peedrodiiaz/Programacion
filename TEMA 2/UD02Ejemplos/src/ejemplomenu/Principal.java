package ejemplomenu;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		int a;
		System.out.println("Hola, estas son las opciones del menú");

		System.out.println("1. Para reframes");
		System.out.println("2. Para advertencias");
		System.out.println("3. Para frases hechas");
		
		System.out.println("¿Qué opción eliges?");
		a = Leer.datoInt();
		
		switch (a) {
		case 1:
			System.out.println("No por mucho magrugar " + "amanece más temprano.");
			break;
		case 2:
			System.out.println("Ama y ensancha el alma");
			break;
		case 3:
			System.out.println("No ni na");
			break;
		default:
			System.out.println("Opción incorrecta");
		}
	}

}
