package Ejercicio01;

public class Examen {
    private String asignatura;
    private String aula;
    private String fecha;

    public Examen(String asignatura, String aula, String fecha) {
        this.asignatura = asignatura;
        this.aula = aula;
        this.fecha = fecha;
    }

    public void imprimirCabecera() {
        System.out.println("Asignatura: " + asignatura);
        System.out.println("Aula: " + aula);
        System.out.println("Fecha: " + fecha);
    }
}

