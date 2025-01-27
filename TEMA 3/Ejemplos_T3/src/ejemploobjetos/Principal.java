package ejemploobjetos;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		double res, res2;
//		double [] notas= {2,4,3,5,5,6};

		
//		Alumno a = new Alumno("Pedro","Díaz",8,4);
//		Alumno2 a2;
//		Secretaria s;
//		Secretaria2 s2;
//		//guardando en una variable
//		res=a.calcularMedia();
//		System.out.printf("La nota media es %.2f",res);
//		System.out.println();
//		//imprimiendo directamente
//		System.out.printf("La media es %.2f", a.calcularMedia());
//		System.out.println();
//		s=new Secretaria("Salesianos", a);
//		System.out.println(s.calcularMediav2());
//		s2=new Secretaria2("Salesianos");
//		res2=s2.calcularMediav5(a);
//		System.out.printf("%.2f",res);

		//ahora lo hacemos con el array
//		
//		a2=new Alumno2("Pedro", notas);
//	
//		System.out.println(a2.notaMedia());
		
		alumno3 a3=new alumno3(3424, "Bordalás");
		double []  notas;
		int tam,desde=1,hasta=10;
		
		System.out.println("¿CUÁNTAS NOTAS SON?");
		tam=Leer.datoInt();
		notas=new double [tam];
//		for (int i = 0; i < notas.length; i++) {
//			System.out.println("Introduzca una nota");
//			notas[i]=Leer.datoDouble();
//			
//		}
//		
//		System.out.printf("\n %.2f",a3.hacernotamedia(notas));
//		
		
		notas= a3.introducirnota(tam, desde, hasta);
		
		for (int i = 0; i <notas.length; i++) {
			System.out.println(a3.introducirnota(tam, desde, hasta)[i]);
		}
		System.out.println();
		System.out.println(a3.hacernotamedia(notas));

		
		
		
		
		
		
		}

}
