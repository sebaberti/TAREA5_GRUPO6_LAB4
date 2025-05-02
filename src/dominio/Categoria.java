package dominio;

public class Categoria implements Comparable<Categoria>{
	private static int contador = 0;
	private int id;
	private String nombre;

	
	public Categoria(String nombre) {
		super();
		this.id = ++contador;
        this.nombre = nombre;
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
    
    
	@Override
    public String toString() {
        return  id + "- " + nombre;
    }
	
	public int compareTo(Categoria otra) {
        return this.nombre.compareToIgnoreCase(otra.nombre);
    }
}
