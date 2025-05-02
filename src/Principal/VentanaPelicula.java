package Principal;

import javax.swing.JFrame;
import javax.swing.JPanel;
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

            public VentanaPelicula() {
                super(new int[]{100, 100, 400, 300}, "Películas");
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                
                contentPane = new JPanel();
                contentPane.setBounds(0, 0, 386, 241);
                getContentPane().add(contentPane);
                contentPane.setLayout(new BorderLayout(0, 0));
              
                menuBar = new JMenuBar();
                menuBar.setBounds(0, -22, 386, 22);    

                menuPeliculas = new JMenu("Películas");
                menuBar.add(menuPeliculas);

                menuItemAgregar = new JMenuItem("Agregar");
                menuItemAgregar.addActionListener(new ActionListener() {
                	public void actionPerformed(ActionEvent e) {
                		
                		contentPane.removeAll();
                		PanelAgregarPeliculas panel= new PanelAgregarPeliculas();
                		contentPane.add(panel);
                		contentPane.repaint();
                		contentPane.revalidate();
                		
                	}
                });
                menuPeliculas.add(menuItemAgregar);

                menuItemListar = new JMenuItem("Listar");
                menuPeliculas.add(menuItemListar);
               
                setMenu(menuBar);
                getContentPane().setLayout(null);
                
                
            }        
     }




