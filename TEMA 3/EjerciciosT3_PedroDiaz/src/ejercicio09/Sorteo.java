package ejercicio09;

import java.util.Random;


public class Sorteo {
	 private int numeroDecimo=0; 
	 private int numeroPremiado=0; 

		public void comprarDecimo(int num) {
			 	if (num >= 1 && num <= 99999) {
		            this.numeroDecimo = num;
		            System.out.printf("Décimo %05d comprado\n", num);
		        } else {
		            System.out.println("Número inválido. Debe estar entre 00001 y 99999.");
		        }
			 	
		}
		public int hacerRamdom () {
			Random r1 = new Random(System.nanoTime());
			return r1.nextInt(99999 - 00001 + 00001) + 00001;
			
			
		}
		
		public void comprarDecimoAleatorio() {
		
			this.numeroDecimo=hacerRamdom();
			 System.out.printf("El numero del décimo aleatorio es: %05d \n", this.numeroDecimo);
		}
		public void hacerSorteo() {
		 this.numeroPremiado=hacerRamdom();
			
		 System.out.printf("El número premiado es: %05d \n", this.numeroPremiado);
		}
		public boolean esGanador() {
		  if (this.numeroDecimo == 0) {
		    System.out.println("No has comprado ningún décimo.");
		    return false;
		        }
		    return this.numeroDecimo == this.numeroPremiado;
		    }
		
		
		}
	
