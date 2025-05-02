package dominio;

import java.util.ArrayList;

public abstract class TipoCategoria {
	public final static String SELECCIONAR_OPCION = "Seleccione una opcion";
	public final static String TERROR = "Terror";
	public final static String ACCION = "Accion";
	public final static String SUSPENSO = "Suspenso";
	public final static String ROMANTICA = "Romantica";

	public static ArrayList<String> getCategorias() {
		return new ArrayList<String>() {
			{
				add(TERROR);
				add(ACCION);
				add(SUSPENSO);
				add(ROMANTICA);
			}
		};
	}
}
