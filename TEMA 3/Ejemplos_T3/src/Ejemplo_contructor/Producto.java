package Ejemplo_contructor;

//atributos
public class Producto {
	private int id;
	private String nombre;
	private double precioBase;
	
//constructtores	
	public Producto(int id, String  nombre,double precioBase) {
		this.id=id;
		this.nombre=nombre;
		this.precioBase=precioBase;
	}
	
	public Producto(int id, double precioBase) {
		this.id=id;
		this.precioBase=precioBase;
	}
//getter y setter
	public int getId(){
		return id;
	}
	
	public void setId (int id) {
		 this.id=id;
	}
	public String getNombre(){
		return nombre;
	}
	
	public void setNombre (String nombre) {
		 this.nombre=nombre;
	}
	public double getPrecioBase(){
		return precioBase;
	}
	
	public void setPrecioBase (double precioBase) {
		 this.precioBase=precioBase;
	}
	
	
// metodos
	
	public double calcularPVP(double ganacia) {
		double resul;
		resul=precioBase+(ganacia*precioBase)/100;
		return resul;
				
	}
	
	
//para hacer el syso
	public String toString() {
		return "Producto [id="+ id + " nombre: "+nombre + ", precioBase: " +precioBase+"]";
	}
}
