package ejercicio01;


import java.util.List;

public class gestionNotas {

	private List <Nota> lista ;

	public List<Nota> getLista() {
		return lista;
	}

	public void setLista(List<Nota> lista) {
		this.lista = lista;
	}

	@Override
	public String toString() {
		return "gestionNotas [lista=" + lista + "]";
	}

	public gestionNotas(List<Nota> lista) {
		super();
		this.lista = lista;
	}
	
	public Nota devolverNota(int index) {
		return	lista.get(index);
	}
	
	public void numDeNotas() {
		System.out.println("En la lista hay "+lista.size());
	}	
	
	public void agregarNota(Nota n) {
		System.out.println("Se ha añadido la nota"); lista.add(n);
	}
	
	public void borraNota(int index) {
		
	}
	
	
	
	
	
}
