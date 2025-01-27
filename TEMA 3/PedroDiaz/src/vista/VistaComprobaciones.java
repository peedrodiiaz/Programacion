//Hecho por Mauro
package vista;

import crud.CrudModerador;

public class VistaComprobaciones {
	CrudModerador m=new CrudModerador();
	
	public void imprimirComprobacionMod(boolean res) {
		if(res) {
			System.out.println("Entrando...");
		}
		else {
			System.out.println("Usuario o contraseña incorrecta");
		}
	}
	
	
}	
