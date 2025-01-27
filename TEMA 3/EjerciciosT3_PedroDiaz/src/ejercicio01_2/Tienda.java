package ejercicio01_2;

public class Tienda {
    private Producto productos[];
    private int numProductos; 

    // Constructor
    public Tienda(int tam) {
        productos = new Producto[tam]; 
        numProductos = 0;
    }

    
    public void listarProductos() {
        if (numProductos == 0) {
            System.out.println("No hay productos en la tienda.");
        } else {
            for (int i = 0; i < numProductos; i++) {
                System.out.println(productos[i]);
            }
        }
    }


  

    public void agregarProducto(Producto producto) {
        if (numProductos < productos.length) {
            productos[numProductos] = producto;
            numProductos++;
            System.out.println("Producto añadido: " + producto.getNombre());
        } else {
            System.out.println("No hay espacio para más productos en la tienda.");
        }
    }

   
    public double calcularInversionTotal() {
        double total = 0;
        for (int i = 0; i < numProductos; i++) {
            total += productos[i].getPrecioFabrica();
        }
        return total;
    }

    // Calcular el PVP (Precio de Venta al Público)
    public double calcularPVP(double porcentajeVenta) {
        double totalPVP = 0;
        for (int i = 0; i < numProductos; i++) {
            double precioCoste = productos[i].calcularPrecioCoste(porcentajeVenta);
            totalPVP += precioCoste + (precioCoste * porcentajeVenta / 100);
        }
        return totalPVP;
    }

    // Calcular ganancias
    public double calcularGanancias(double porcentajeVenta) {
        double totalPVP = calcularPVP(porcentajeVenta);
        double totalFabrica = calcularInversionTotal();
        return totalPVP - totalFabrica;
    }
}
