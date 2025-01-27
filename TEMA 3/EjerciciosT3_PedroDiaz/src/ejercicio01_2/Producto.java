package ejercicio01_2;

public class Producto {
    private String nombre;
    private double precioFabrica;
   
    private String categoria;
    private int codigo; 

  
    public Producto(String nombre, double precioFabrica, String categoria, int codigo) {
        this.nombre = nombre;
        this.precioFabrica = precioFabrica;
        this.categoria = categoria;
        this.codigo = codigo;
    }

   

    public String getNombre() {
        return nombre;
    }

    public double getPrecioFabrica() {
        return precioFabrica;
    }

 
  

    public int getCodigo() {
        return codigo;
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s, Precio de Fábrica: %.2f, Es Frágil: %s, Categoría: %s, Código: %05d",
                nombre, precioFabrica, categoria, codigo);
    }

    public double calcularPrecioCoste(double porcentajeTransporte) {
        return precioFabrica + (precioFabrica * porcentajeTransporte / 100);
    }
    
}
