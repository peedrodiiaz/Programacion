package ejercicio12;
import utilidades.Leer;
public class Principal {

	public static void main(String[] args) {

         double MERCURIO = 0.38;
         double VENUS = 0.91;
         double TIERRA = 1.00;
         double MARTE = 0.38;
         double JUPITER = 2.53;
         double SATURNO = 1.06;
         double URANO = 0.92;
         double NEPTUNO = 1.2;
         double pesoTierra;
         double pesoFinal;
         int opcion;
         

				
				do {
					System.out.println("Incique su peso en la tierra");
					pesoTierra=Leer.datoDouble();	
					
		        	System.out.println("Seleccione un planeta para calcular su peso:");
		            System.out.println("1. Mercurio");
		            System.out.println("2. Venus");
		            System.out.println("3. Tierra");
		            System.out.println("4. Marte");
		            System.out.println("5. Júpiter");
		            System.out.println("6. Saturno");
		            System.out.println("7. Urano");
		            System.out.println("8. Neptuno");
		            System.out.println("0. Para salir");
		            
		           
			        opcion = Leer.datoInt();
			        
			        pesoFinal = 0;
		
			
			        switch (opcion) {
			            case 1:
			                pesoFinal = pesoTierra * MERCURIO;
			                System.out.println("Su peso en Mercurio es: " + pesoFinal + " kg.");
			                break;
			            case 2:
			                pesoFinal = pesoTierra * VENUS;
			                System.out.println("Su peso en Venus es: " + pesoFinal + " kg.");
			                break;
			            case 3:
			                pesoFinal = pesoTierra * TIERRA;
			                System.out.println("Su peso en la Tierra es: " + pesoFinal + " kg.");
			                break;
			            case 4:
			                pesoFinal = pesoTierra * MARTE;
			                System.out.println("Su peso en Marte es: " + pesoFinal + " kg.");
			                break;
			            case 5:
			                pesoFinal = pesoTierra * JUPITER;
			                System.out.println("Su peso en Júpiter es: " + pesoFinal + " kg.");
			                break;
			            case 6:
			                pesoFinal = pesoTierra * SATURNO;
			                System.out.println("Su peso en Saturno es: " + pesoFinal + " kg.");
			                break;
			            case 7:
			                pesoFinal = pesoTierra * URANO;
			                System.out.println("Su peso en Urano es: " + pesoFinal + " kg.");
			                break;
			            case 8:
			                pesoFinal = pesoTierra * NEPTUNO;
			                System.out.println("Su peso en Neptuno es: " + pesoFinal + " kg.");
			                break;
			                
			            case 0:
			            	System.out.println("Saliendo");
			            	break;
			               
			            default:
			                System.out.println("Opción no válida.");
			                break;
			                
			        }
				}
			        while (opcion != 0);
			       System.out.println("Gracias");
				}
    	   	} 
    	   
        
		

       
	

       
       

