package ejercicio08;

public class Cuenta {
	
	private double saldo;
	private  String titular;
	
	
	
	public Cuenta (String titular, double saldo) {
		this.titular=titular;
		this.saldo=saldo;
	
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public String getTitular() {
		return titular;
	}
	
	public double ingresar(double cantidad) {
		saldo+=cantidad;
		return saldo;
	}
	
	public boolean comprobarRetirar (double cantidad) {
		boolean res;
		if (saldo<cantidad) {
			res=false;
		       
		}else {
			res=true;
			saldo-=cantidad;
		}
		return res;
		
	}
	public void devolverRetirar(boolean res) {
		
		if (res) {
			System.out.println("La cantidad ha sido retirada");
			
		}else {
			System.out.println("No se puede retirar esa cantidad porque es mayor que el saldo");
		}
	}
	
	public double saldoDolares() {
		double Dolares=1.05;
		double nuevoSaldo=saldo;
		nuevoSaldo*=Dolares;
		return nuevoSaldo;
	}

	
	
	
}
