package Principal;

import javax.swing.JPanel;
import javax.swing.JScrollPane;

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
	private JScrollPane scrollPane;
	
	public PanelListar(DefaultListModel<Pelicula> listModel) {
//		setLayout(null);
//		setBounds(0, 0, 386, 241);
//		
//		lblTitulo = new JLabel("Listado películas:");
//		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 18));
//		lblTitulo.setBounds(32, 24, 184, 22);
//		add(lblTitulo);
//		
//		listPeliculas = new JList<Pelicula>(listModel);
//		listPeliculas.setBounds(32, 57, 318, 173);
//		add(listPeliculas);
//
//		//scroll
//		scrollPane = new JScrollPane();
//		scrollPane.setBounds(29, 55, 318, 173);
//	    listPeliculas.setLayoutOrientation(JList.VERTICAL);
//		add(scrollPane);
//		
		
		
		setLayout(null);
		
		lblTitulo = new JLabel("Listado películas:");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTitulo.setBounds(32, 24, 184, 22);
		add(lblTitulo);
		
		listPeliculas = new JList<Pelicula>(listModel);
		listPeliculas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(32, 57, 318, 173);
	    scrollPane.setViewportView(listPeliculas);
	    listPeliculas.setLayoutOrientation(JList.VERTICAL);
		add(scrollPane);
		
	}
	
	public void setDefaultListModel(DefaultListModel<Pelicula> listModel)
	{
		this.listModel = listModel;
		listPeliculas.setModel(this.listModel);
	}
	
	
}