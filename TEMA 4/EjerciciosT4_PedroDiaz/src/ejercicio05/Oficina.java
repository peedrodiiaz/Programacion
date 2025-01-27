package ejercicio05;

import java.util.Arrays;

public class Oficina {

	Empleado[]listaEmpleados;

	public Empleado[] getListaEmpleados() {
		return listaEmpleados;
	}

	@Override
	public String toString() {
		return "Oficina [listaEmpleados=" + Arrays.toString(listaEmpleados) + "]";
	}

	public void setListaEmpleados(Empleado[] listaEmpleados) {
		this.listaEmpleados = listaEmpleados;
	}

	public Oficina(Empleado[] listaEmpleados) {
		super();
		this.listaEmpleados = listaEmpleados;
	}
	
	public double calcularSueldoOf(Empleado E, int cantidad) {
		if (E instanceof Vendedor ) {
			((Vendedor)E).felicitacion(cantidad);
			return	E.calcularSueldo();
		}else {
			return E.calcularSueldo();
		}
	}
	
	public void devolverTodos(int cantidad) {
		for (int i = 0; i < listaEmpleados.length; i++) {
			System.out.println("El sueldo de "+ listaEmpleados[i].getNombre()+" es:");
			System.out.println(calcularSueldoOf(listaEmpleados[i],cantidad ));	
		
		}
		
	}
	
	public double calcularGastoOficina() {
		double suma=0.0;
		for (int i = 0; i < listaEmpleados.length; i++) {
			suma+= listaEmpleados[i].calcularSueldo();
		}
		return suma;
	}
	
	public void agregarEmpleados(Empleado e, int contador) {
		for (int i = 0; i < contador; i++) {
			listaEmpleados[contador]=e;
		}
	}
	
	
}
