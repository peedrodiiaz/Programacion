//Hecho por Mauro

package crud;

import model.Moderador;

public class CrudModerador {
	
	
	
    public void modificarUsuario(Moderador moderador, String nuevoUsuario) {
        moderador.setUsuario(nuevoUsuario);
    }

    public void modificarContrasena(Moderador moderador, String nuevaContrasena) {
        moderador.setContrasena(nuevaContrasena);
    }
    
    public boolean comprobarContrasenaYUsuario(Moderador m, String contrasena, String usuario) {
    	boolean res=false;
    	
    	if(m.getContrasena().equals(contrasena)&&m.getUsuario().equals(usuario)) {
    		res=true;
    	}
    	
    	return res;
    }
    
}
