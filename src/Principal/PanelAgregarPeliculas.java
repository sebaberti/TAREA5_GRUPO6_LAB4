package Principal;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;

import dominio.Categoria;

import javax.swing.JComboBox;
import javax.swing.JButton;

public class PanelAgregarPeliculas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JLabel lblID;
	private JLabel lblNombre;
	private JLabel lblGenero;
	private JLabel lblIDPelicula;
	private JComboBox<Categoria> cbCategorias;
	private JButton btnAceptar;
	
	public PanelAgregarPeliculas() {
		setLayout(null);
		dibujarControles();
	}
	
	private void dibujarControles(){
		lblID = new JLabel("ID");
		lblID.setBounds(65, 24, 81, 20);
		add(lblID);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(65, 63, 49, 14);
		add(lblNombre);
		
		lblGenero = new JLabel("Genero");
		lblGenero.setBounds(65, 101, 49, 14);
		add(lblGenero);
		
		lblIDPelicula = new JLabel("");
		lblIDPelicula.setBounds(190, 52, 49, 14);
		add(lblIDPelicula);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(143, 60, 96, 20);
		add(txtNombre);
		txtNombre.setColumns(10);
		
		cbCategorias = new JComboBox<Categoria>();
		cbCategorias.setBounds(143, 97, 96, 22);
		add(cbCategorias);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(150, 146, 89, 23);
		add(btnAceptar);
	
	}
}
