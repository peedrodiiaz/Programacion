package Ejemploarrays2;




import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int edades[];
		int alumnos;
		int cambiarEdad;
		int nuevaedad;
		
		System.out.println("¿Cúantos alumnos hay en clase");
		alumnos=Leer.datoInt();
	
		edades=new int [alumnos];
		
		for (int i = 0; i < edades.length; i++) {
			System.out.println("Dime una edad");
			edades[i]=Leer.datoInt();
		}
		
		
		for (int i = 0; i < edades.length; i++) {
			System.out.print("ALUMNO "+(i+1)+"\t");
			
			
		}
		System.out.println("\n");
		for (int i = 0; i < edades.length; i++) {
			
			System.out.print("    "+edades[i]+"\t\t");
		}
		System.out.println();
		System.out.println("A qué alumno le cambiamos la edad?");
		cambiarEdad=Leer.datoInt();
		System.out.println("¿Que edad?");
		nuevaedad=Leer.datoInt();
		edades[cambiarEdad-1]=nuevaedad;
		
		for (int i = 0; i < edades.length; i++) {
			System.out.print("ALUMNO "+(i+1)+"\t");
			
			
		}
		System.out.println("\n");
		for (int i = 0; i < edades.length; i++) {
			
			System.out.print("    "+edades[i]+"\t\t");
		}
	
	
	}
}
		
		
	
			
			
		
		
		
		
		
		
		
		
		
		
