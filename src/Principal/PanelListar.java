package Principal;

import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JScrollPane;

import dominio.Pelicula;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import java.awt.Font;

import javax.swing.DefaultListModel;

public class PanelListar extends JPanel {

	private static final long serialVersionUID = 1L;
	private JLabel lblTitulo;
	private JList<Pelicula> listPeliculas;
	private DefaultListModel<Pelicula> listModel;
	private JScrollPane scrollPane;
	private JButton btnEliminar;
	
	public PanelListar(DefaultListModel<Pelicula> listModel) {
		this.listModel = listModel;
		setLayout(null);  
		setBounds(0, 0, 400, 400);
		
		lblTitulo = new JLabel("Listado películas:");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblTitulo.setBounds(20, 20, 200, 25);
		add(lblTitulo);
		
		listPeliculas = new JList<Pelicula>(listModel);
		listPeliculas.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(20, 60, 350, 140);		
	    scrollPane.setViewportView(listPeliculas);
	    listPeliculas.setLayoutOrientation(JList.VERTICAL);
		add(scrollPane);
		
		
		btnEliminar = new JButton("Eliminar");
        btnEliminar.setFont(new Font("Tahoma", Font.PLAIN, 14));
        btnEliminar.setBounds(150, 200, 120, 30);
        add(btnEliminar);

       
        btnEliminar.addActionListener(e -> eliminarPelicula());
		
	}
	
	public void setDefaultListModel(DefaultListModel<Pelicula> listModel)
	{
		this.listModel = listModel;
		listPeliculas.setModel(this.listModel);
	}
	
	
	private void eliminarPelicula() {
     
        int selectedIndex = listPeliculas.getSelectedIndex();

        if (selectedIndex != -1) {
            
            listModel.remove(selectedIndex);
        } else {
            
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una película para eliminar.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
	
	
}