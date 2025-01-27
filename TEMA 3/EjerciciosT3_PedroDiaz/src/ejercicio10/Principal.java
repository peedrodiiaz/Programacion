package ejercicio10;

import utilidades.Leer;
public class Principal {
    public static void main(String[] args) {
        double precioBillete, dineroEntregado, totalBilletes;
        int opcion, cantidad, opcionOperario;
        String contrasena;
        Ticket t1;
        Maquina maquina;

        System.out.println("Introduce el precio inicial del billete:");
        precioBillete = Leer.datoDouble();
        maquina = new Maquina(precioBillete,0,"admin123") ;

        do {
            System.out.println("--- Menú de la Máquina ---");
            System.out.println("1. Comprar billete(s)");
            System.out.println("2. Opciones de operario");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = Leer.datoInt();

            switch (opcion) {
                case 1:
                    System.out.print("¿Cuántos billetes quieres comprar? ");
                    cantidad = Leer.datoInt();
                    totalBilletes=cantidad*precioBillete;
                    System.out.println("Usted tiene que pagar: "+totalBilletes);
                    System.out.print("Introduzca cúanto va a pagar: ");
                    dineroEntregado = Leer.datoDouble();
                    t1 = maquina.comprarBillete(cantidad, dineroEntregado);
                    t1.imprimir();
                    
                    break;

                case 2:
                    System.out.print("Introduce la contraseña: ");
                    contrasena = Leer.dato();
                    if (maquina.comprobarPassword(contrasena)) {
                        
                        do {
                            System.out.println("\n--- Menú de Operario ---");
                            System.out.println("1. Ver saldo total");
                            System.out.println("2. Reiniciar saldo total");
                            System.out.println("3. Cambiar precio del billete");
                            System.out.println("4. Volver al menú principal");
                            System.out.print("Elige una opción: ");
                            opcionOperario = Leer.datoInt();

                            switch (opcionOperario) {
                                case 1:
                                    System.out.printf("Saldo total de la máquina: %.2f€%n", maquina.getSaldoTotal());
                                    break;

                                case 2:
                                    maquina.reiniciarSaldo();
                                    break;

                                case 3:
                                    System.out.print("Introduce el nuevo precio del billete: ");
                                    double nuevoPrecio;
                                    nuevoPrecio= Leer.datoDouble();
                                    maquina.cambiarPrecioBillete(nuevoPrecio);
                                    break;

                                case 4:
                                    System.out.println("Volviendo al menú principal...");
                                    break;

                                default:
                                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                            }
                        } while (opcionOperario != 4);
                    } else {
                        System.out.println("Contraseña incorrecta.");
                    }
                    break;

                case 3:
                    System.out.println("Saliendo");
                    break;

                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
            }
        } while (opcion != 3);
        System.out.println("Gracias por usar el programa");
    }
}
