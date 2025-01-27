package utilidades;

import java.io.*;

public class Leer {

    public static String dato() {
        String sdato = " ";
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader flujoE = new BufferedReader(isr);
            sdato = flujoE.readLine();
        } catch (IOException e) {
            System.out.println("Error " + e.getMessage());
        }
        return sdato;
    }

    public static int datoInt() {
        return Integer.parseInt(dato());
    }

    public static float datoFloat() {
        return Float.parseFloat(dato());
    }

    // Leer un char por teclado
    public static char datoChar() {
        char c = ' ';
        try {
            java.io.BufferedInputStream b = new BufferedInputStream(System.in);
            c = (char) b.read();
        } catch (IOException e) {
            System.out.println("Error al leer");
            e.printStackTrace();
        }
        return c;
    }

    public static long datoLong() {
        return Long.parseLong(dato());
    }

    public static short datoShort() {
        return Short.parseShort(dato());
    }

    public static double datoDouble() {
        return Double.parseDouble(dato());
    }

    // Método para leer un booleano
    public static boolean datoBoolean() {
        while (true) {
            System.out.print("Introduce un valor booleano (true/false): ");
            String input = dato();
            if (input.equalsIgnoreCase("true")) {
                return true;
            } else if (input.equalsIgnoreCase("false")) {
                return false;
            } else {
                System.out.println("Entrada no válida. Por favor, introduce 'true' o 'false'.");
            }
        }
    }
}