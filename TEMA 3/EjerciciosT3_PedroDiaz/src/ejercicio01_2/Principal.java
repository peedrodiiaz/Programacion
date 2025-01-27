
package ejercicio01_2;

import utilidades.Leer;

public class Principal {
    public static void main(String[] args) {
        int tam, opcion, codigo ;
        String nombre, categoria;
        double precioFabrica, porcentajeVenta;
        Tienda tienda; 
        Producto producto; 

        System.out.println("Introduce el número máximo de productos que puede manejar la tienda:");
        tam = Leer.datoInt();
        tienda = new Tienda(tam); 

        do {
            System.out.println("--- Menú de Gestión de la Tienda ---");
            System.out.println("1. Listar productos.");
            System.out.println("3. Agregar un producto.");
            System.out.println("4. Calcular la inversión total.");
            System.out.println("5. Calcular el PVP de todos los productos.");
            System.out.println("6. Calcular las ganancias potenciales.");
            System.out.println("7. Salir.");
            System.out.print("Elige una opción: ");
            opcion = Leer.datoInt();

            switch (opcion) {
                case 1:
                    tienda.listarProductos();
                    break;

                case 3:
                    System.out.print("Introduce el nombre del producto: ");
                    nombre = Leer.dato();
                    System.out.print("Introduce el precio de fábrica: ");
                    precioFabrica = Leer.datoDouble();
                                       System.out.print("Introduce la categoría: ");
                    categoria = Leer.dato();
                    System.out.print("Introduce el código del producto (número entero): ");
                    codigo = Leer.datoInt();

                    producto = new Producto(nombre, precioFabrica, categoria, codigo);
                    tienda.agregarProducto(producto);
                    break;

                case 4:
                    System.out.printf("Inversión total: %.2f%n", tienda.calcularInversionTotal());
                    break;

                case 5:
                    System.out.print("Introduce el porcentaje de venta: ");
                    porcentajeVenta = Leer.datoDouble();
                    System.out.printf("PVP total: %.2f%n", tienda.calcularPVP(porcentajeVenta));
                    break;

                case 6:
                    System.out.print("Introduce el porcentaje de venta: ");
                    porcentajeVenta = Leer.datoDouble();
                    System.out.printf("Ganancias potenciales: %.2f%n", tienda.calcularGanancias(porcentajeVenta));
                    break;

                case 7:
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 7);
        System.out.println("Gracias por usar el programa");
    }
}

