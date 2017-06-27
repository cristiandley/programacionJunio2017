package presentacion;

import java.awt.CardLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

/**
 * @author Cristian Leyes
 * {@link https://github.com/cristiandley/programacionJunio2017}
 */
public class App {

	private JFrame frmGestionAvisosPublicitarios;
	private JPanel contenedor;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frmGestionAvisosPublicitarios.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public App() {
		initialize();
	}

	/**
	 * -----------------------------------------------
	 * 		  INICIALIZA EL CONTENIDO DEL FRAME
	 * -----------------------------------------------
	 */
	private void initialize() {
		
		
		frmGestionAvisosPublicitarios = new JFrame();
		frmGestionAvisosPublicitarios.setTitle("GESTION DE AVISOS PUBLICITARIOS");
		frmGestionAvisosPublicitarios.setResizable(false);
		frmGestionAvisosPublicitarios.setBounds(100, 100, 450, 370);
		frmGestionAvisosPublicitarios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmGestionAvisosPublicitarios.getContentPane().setLayout(null);
		
		/**
		 * -----------------------------------------------
		 * 		  		CONTENEDOR PRINCIPAL
		 * -----------------------------------------------
		 */
		contenedor = new JPanel();
		contenedor.setBounds(6, 6, 438, 314);
		frmGestionAvisosPublicitarios.getContentPane().add(contenedor);
		contenedor.setLayout(new CardLayout(0, 0));
		
		/* paneles alternativos */
		contenedor.add(new CrearAvisoPanel(),"CrearAvisoPanel");
		contenedor.add(new ListarAvisoPanel(),"ListarAvisoPanel");
		
		JMenuBar menuBar = new JMenuBar();
		frmGestionAvisosPublicitarios.setJMenuBar(menuBar);
		
		JMenu mnAvisos = new JMenu("Avisos");
		menuBar.add(mnAvisos);
		
		/**
		 * -----------------------------------------------
		 * 		  			EVENTOS MENU
		 * -----------------------------------------------
		 */
		
		JMenuItem mntmCrear = new JMenuItem("Crear");
		mntmCrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) { 
				((CardLayout)contenedor.getLayout()).show(contenedor, "CrearAvisoPanel"); 
			}
		});
		mnAvisos.add(mntmCrear);
		
		JMenuItem mntmListar = new JMenuItem("Listar");
		mntmListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((CardLayout)contenedor.getLayout()).show(contenedor, "ListarAvisoPanel");
			}
		});
		mnAvisos.add(mntmListar);
		
	}

}
