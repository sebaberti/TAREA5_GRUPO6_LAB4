package Principal;

import java.util.*;

public class Ppal {

	public static void main(String[] args) {
		List<Categoria> categorias = new ArrayList<>();
        categorias.add(new Categoria("libros"));
        categorias.add(new Categoria("alimentos"));
        categorias.add(new Categoria("aalimasd"));
        categorias.add(new Categoria("deportes"));

        Collections.sort(categorias); // ordena por nombre (alfabético)
        
       

        for (Categoria c : categorias) {
            System.out.println(c);
        }

	}

}
