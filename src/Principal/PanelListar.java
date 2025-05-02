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
	private JList<Pelicula> listPeliculas;
	private DefaultListModel<Pelicula> listModel;

	public PanelListar() {
		setLayout(null);
		setBounds(0, 0, 386, 241);
		
		lblTitulo = new JLabel("Listado películas:");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTitulo.setBounds(32, 24, 134, 22);
		add(lblTitulo);
		
		listModel = new DefaultListModel<Pelicula>();
		
		listPeliculas = new JList<Pelicula>();
		listPeliculas.setBounds(32, 57, 318, 173);
		add(listPeliculas);
		
	}
	
	public void setDefaultListModel(DefaultListModel<Pelicula> listModel)
	{
		this.listModel = listModel;
		listPeliculas.setModel(this.listModel);
	}
}