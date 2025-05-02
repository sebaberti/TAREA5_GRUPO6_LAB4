package Principal;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class VentanaPelicula extends Ventana {

            private static final long serialVersionUID = 1L;
            private JPanel JP_VentanaPeliculas;
            private JMenuBar menuBar;
            private JMenu menuPeliculas;
            private JMenuItem menuItemAgregar;
            private JMenuItem menuItemListar;

            public VentanaPelicula() {
                super(new int[]{100, 100, 400, 300}, "Películas");
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

                JP_VentanaPeliculas = new JPanel();
                JP_VentanaPeliculas.setBorder(new EmptyBorder(5, 5, 5, 5));
                setContentPane(JP_VentanaPeliculas);
                JP_VentanaPeliculas.setLayout(null);

              
                menuBar = new JMenuBar();
                menuBar.setBounds(0, 0, 400, 22);
                JP_VentanaPeliculas.add(menuBar); 

                menuPeliculas = new JMenu("Películas");
                menuBar.add(menuPeliculas);

                menuItemAgregar = new JMenuItem("Agregar");
                menuPeliculas.add(menuItemAgregar);

                menuItemListar = new JMenuItem("Listar");
                menuPeliculas.add(menuItemListar);

               
                setMenu(menuBar);
            }        
         
     }




