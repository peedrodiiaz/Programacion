package ejercicio04;

public class Gimnasio {

	 Cliente[]lista;
	 
	 private int numClientes;
	public Cliente[] getLista() {
		return lista;
	}
	public void setLista(Cliente[] lista) {
		this.lista = lista;
	}
	public int getNumClientes() {
		return numClientes;
	}
	public void setNumClientes(int numClientes) {
		this.numClientes = numClientes;
	}
	public Gimnasio(Cliente[] lista, int numClientes) {
		super();
		this.lista = lista;
		this.numClientes = numClientes;
	}
	 
	
	
	public int buscarDNI(String dni) {
		int index=0;
		for (int i = 0; i < lista.length; i++) {
			if (lista[i]!=null) {
				if (lista[i].getDni().equalsIgnoreCase(dni)) {
					index=i;
						
					//lista[i].calcularIMC(lista[i].getPeso(), lista[i].getAltura());
				}
			}
			
		}
		return index;
		
	}
	
	public void mostrarLista() {
		for (int i = 0; i < lista.length; i++) {		
			if (lista[i]!=null) {
			System.out.println(lista[i]);
		}
		
	}
		
}
	public void agregarUsuario(int numUsuarios, String dni, String nombre, String apellido, boolean activo, double peso, double altura) {
		
			lista[numUsuarios]=new Cliente(dni, nombre, apellido, activo, peso, altura);
		
		
	}
}
