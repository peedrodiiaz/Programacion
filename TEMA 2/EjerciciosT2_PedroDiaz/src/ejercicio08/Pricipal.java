package ejercicio08;

import ejercicio02.Leer;

public class Pricipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Variables
		String usuarioPre="Salesianos", contraseñaPre="triana";
		String usuario,contraseña;
		
		System.out.println("Bienvenido al sistema");
		System.out.println("Ingrese su usuario");
		usuario=Leer.dato();
		System.out.println("Ahora indique su contraseña");
		contraseña=Leer.dato();
		
		if (usuario.equals(usuarioPre) && (contraseña.equals(contraseñaPre))) {
			System.out.println("Has accedido correctamente");
			
		}else {
			System.out.println("Los datos introducidos no son correctos");
		}
		
		
		
	}

}
