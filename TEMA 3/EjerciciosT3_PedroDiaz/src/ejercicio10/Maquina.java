package ejercicio10;

public class Maquina {
    private double precioBillete; 
    private double saldoTotal; 
    private String contrasena; 

    
    public Maquina(double precioBillete, double saldoTotal, String contrasena) {
		super();
		this.precioBillete = precioBillete;
		this.saldoTotal = saldoTotal;
		this.contrasena = contrasena;
	}


	public Ticket comprarBillete(int numPersonas, double dineroEntregado) {
    	Ticket t1;
        double precioTotal, devolver ;
        
        precioTotal= precioBillete * numPersonas;
        
        if (dineroEntregado > precioTotal) {        	
            saldoTotal += precioTotal;
            devolver=dineroEntregado-precioTotal;
            System.out.printf("Cambio a devolver: %.2f€\n", devolver);
            t1 = new Ticket(numPersonas, precioTotal); 
           
        } else {
        	 System.out.println("No tienes dinero suficiente");
             return null;
        }
        return t1;
    }

    
   
    public double getSaldoTotal() {
        return saldoTotal;
    }

    
    public void reiniciarSaldo() {
        saldoTotal = 0.0;
        System.out.println("El saldo total ha sido reiniciado.");
    }
    
    public boolean comprobarPassword(String contrasena) {
        return this.contrasena.equals(contrasena);
    }

   
    public void cambiarPrecioBillete(double nuevoPrecio) {
        precioBillete = nuevoPrecio;
        System.out.printf("El nuevo precio del billete es %.2f€%n", nuevoPrecio);
    }

 
    public double getPrecioBillete() {
        return precioBillete;
    }
}

