package Principal;

import javax.swing.DefaultListModel;

public class Ppal {
	public static void main(String[] args) {
		try {
		VentanaPelicula ventana = new VentanaPelicula();
		ventana.setVisible(true);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}