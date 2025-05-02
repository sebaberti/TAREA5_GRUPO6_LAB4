package Principal;

import javax.swing.JPanel;
import dominio.Pelicula;
import javax.swing.JList;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.DefaultListModel;

public class PanelListar extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblTitulo;
	private JList<Pelicula> list;
	private DefaultListModel<Pelicula> listModal;

	public PanelListar() {
		setLayout(null);
		setBounds(0, 0, 386, 241);
		
		lblTitulo = new JLabel("Listado películas:");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitulo.setBounds(32, 24, 134, 22);
		add(lblTitulo);
		
		listModal = new DefaultListModel<Pelicula>();
		
		list = new JList<Pelicula>();
		list.setBounds(32, 57, 318, 173);
		add(list);
		
	}
}
