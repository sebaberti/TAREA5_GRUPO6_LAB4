package Principal;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JPanel;

import dominio.Pelicula;

import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;

public class VentanaPelicula extends Ventana {

	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar;
	private JMenu menuPeliculas;
	private JMenuItem menuItemAgregar;
	private JMenuItem menuItemListar;
	private JPanel contentPane;
	private DefaultListModel<Pelicula> listModelPeliculas = new DefaultListModel<>();

	public VentanaPelicula() {
		super(new int[] { 100, 100, 400, 300 }, "Películas");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		contentPane = new JPanel();
		contentPane.setBounds(0, 0, 386, 241);
		getContentPane().add(contentPane);
		contentPane.setLayout(new BorderLayout(0, 0));

		menuBar = new JMenuBar();
		menuBar.setBounds(0, -22, 386, 22);

		menuPeliculas = new JMenu("Películas");
		menuBar.add(menuPeliculas);

		menuItemAgregar = new JMenuItem("Agregar");
		menuItemAgregar.addActionListener(new AccionarMenuItem(this.contentPane, new PanelAgregarPeliculas(listModelPeliculas)));
		menuPeliculas.add(menuItemAgregar);

		menuItemListar = new JMenuItem("Listar");
		menuItemListar.addActionListener(new AccionarMenuItem(this.contentPane, new PanelListar(listModelPeliculas)));
		menuPeliculas.add(menuItemListar);

		setMenu(menuBar);
		getContentPane().setLayout(null);
	}
}

class AccionarMenuItem implements ActionListener {
	private JPanel panel;
	private JPanel contenedorPrincipal;

	AccionarMenuItem(JPanel contenedorPrincipal, JPanel panel) {
		this.panel = panel;
		this.contenedorPrincipal = contenedorPrincipal;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		contenedorPrincipal.removeAll();
		contenedorPrincipal.add(panel);
		contenedorPrincipal.repaint();
		contenedorPrincipal.revalidate();
	}

}