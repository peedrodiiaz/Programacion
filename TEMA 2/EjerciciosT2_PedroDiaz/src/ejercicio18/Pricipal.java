package ejercicio18;

import utilidades.Leer;

public class Pricipal {

    public static void main(String[] args) {
        // Variables
    	 int horasTrabajadas;
    	 double salario;
    	 double horasExtra;
    	 int preciohorastrabajadas=16;
    	 int horassemanales=40;
    	 int horasextrassemanales=20;
    	 
    	 
    	 	System.out.println("Bienvenido al sistema");
      
            System.out.print("Ingrese el número de horas trabajadas: ");
            horasTrabajadas = Integer.parseInt(Leer.dato());

            
            if (horasTrabajadas <= horassemanales) {
                salario = horasTrabajadas * preciohorastrabajadas; // 
            } else {
                 horasExtra = horasTrabajadas - horassemanales;
                salario = (horassemanales * 16) + (horasExtra * horasextrassemanales); 
            }

            
            System.out.printf("El salario correspondiente es: %.2f euros%n", salario);
      
    }
        }
    

