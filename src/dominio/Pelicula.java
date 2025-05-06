package dominio;

public class Pelicula implements Comparable<Pelicula> {
	private static int contador = 0;
	private int id;
	private String nombre;
	private Categoria categoria;

	public Pelicula() {
		//id = ++contador;
		nombre = "";
		categoria = null;
	}

	public Pelicula(String nombre, Categoria categoria) {
		this.id = ++contador;
		this.nombre = nombre;
		this.categoria = categoria;
	}

	public int getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	@Override
	public String toString() {
		return nombre + " - " + categoria;
	}
	
	public void asignarID() {
        this.id = ++contador;
    }

	public static int getProximoID() {
		return contador + 1;
	}

	@Override
	public int compareTo(Pelicula o) {
		return this.nombre.compareToIgnoreCase(o.nombre);
	}
}
