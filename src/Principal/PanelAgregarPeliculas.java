package Principal;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import dominio.Categoria;
import dominio.Pelicula;
import dominio.TipoCategoria;
import validaciones.PeliculaDuplicadaException;

import javax.swing.JComboBox;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Font;

public class PanelAgregarPeliculas extends JPanel {

	private static final long serialVersionUID = 1L;
	private JTextField txtNombre;
	private JLabel lblID;
	private JLabel lblNombre;
	private JLabel lblGenero;
	private JLabel lblIDPelicula;
	private JComboBox<Categoria> cbCategorias;
	private JButton btnAceptar;

	private DefaultListModel<Pelicula> listModel;

	public PanelAgregarPeliculas(DefaultListModel<Pelicula> listModel) {
		setLayout(null);
		this.listModel = listModel;
		dibujarControles();
	}

	private void dibujarControles() {
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
		lblIDPelicula.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblIDPelicula.setText(String.valueOf(Pelicula.getProximoID()));
		lblIDPelicula.setBounds(145, 27, 17, 14);
		add(lblIDPelicula);

		txtNombre = new JTextField();
		txtNombre.setBounds(143, 60, 179, 20);
		add(txtNombre);
		txtNombre.setColumns(10);

		cbCategorias = new JComboBox<Categoria>();
		cargarCBxCategorias();
		cbCategorias.setBounds(143, 97, 179, 22);
		add(cbCategorias);

		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(150, 146, 89, 23);
		add(btnAceptar);

		btnAceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtNombre.getText() != null && !txtNombre.getText().isEmpty()
						&& cbCategorias.getSelectedIndex() != 0) {
					Pelicula pelicula = new Pelicula();
					pelicula.setNombre(txtNombre.getText());
					pelicula.setCategoria(((Categoria) cbCategorias.getSelectedItem()));
					listModel.addElement(pelicula);
					
					try {
					ordenarLista(listModel); //agrego la pelicula y ya la ordeno en la lista				
					JOptionPane.showMessageDialog(null, "La pelicula se agrego correctamente");
				
					pelicula.asignarID();
					lblIDPelicula.setText(String.valueOf(Pelicula.getProximoID()));
					txtNombre.setText("");
					cbCategorias.setSelectedIndex(0);

					System.out.println(listModel.getSize());
					
					}catch(PeliculaDuplicadaException pde) {
						listModel.removeElement(pelicula);
						JOptionPane.showMessageDialog(null, pde.getMessage(), "Error", JOptionPane.WARNING_MESSAGE);
						
					}
				} else {
					JOptionPane.showMessageDialog(null, "Error, revise completar ambos campos");
				}
			}
		});
	}

	private void cargarCBxCategorias() {
		cbCategorias.addItem(new Categoria(TipoCategoria.SELECCIONAR_OPCION));
		cbCategorias.addItem(new Categoria(TipoCategoria.TERROR));
		cbCategorias.addItem(new Categoria(TipoCategoria.ACCION));
		cbCategorias.addItem(new Categoria(TipoCategoria.SUSPENSO));
		cbCategorias.addItem(new Categoria(TipoCategoria.ROMANTICA));
	}

	public void setDefaultListModel(DefaultListModel<Pelicula> listModel) {
		this.listModel = listModel;
	}

	public DefaultListModel<Pelicula> getListModel() {
		return listModel;
	}

	public void setListModel(DefaultListModel<Pelicula> listModel) {
		this.listModel = listModel;
	}
	/*
	private void ordenarLista(DefaultListModel<Pelicula> listModel) {
		List<Pelicula> listaOrdenada = new ArrayList<>();
		if (listModel.isEmpty())
			return;
		try {
			for (int i = 0; i < listModel.size(); i++) {
				listaOrdenada.add((Pelicula) listModel.get(i));
			}

			Collections.sort(listaOrdenada);

			listModel.removeAllElements();
			for (Pelicula val : listaOrdenada) {
				listModel.addElement(val);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	*/
	private void ordenarLista(DefaultListModel<Pelicula> listModel) throws PeliculaDuplicadaException {
		TreeSet<Pelicula> listaOrdenada = new TreeSet<Pelicula>();
		if (listModel.isEmpty())
			return;	
			for (int i = 0; i < listModel.size(); i++) {		
				if (!listaOrdenada.add((Pelicula) listModel.get(i))) {
			        throw new PeliculaDuplicadaException("No se pudo agregar: La película ya se encuentra registrada.");
			    }
			}		
			
			listModel.removeAllElements();
			for (Pelicula val : listaOrdenada) {
				listModel.addElement(val);
			}					
	}
}
