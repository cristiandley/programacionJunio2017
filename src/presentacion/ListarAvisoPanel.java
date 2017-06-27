package presentacion;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import servicio.IServicio;
import servicio.Servicio;

/**
 * @author Cristian Leyes
 * {@link https://github.com/cristiandley/programacionJunio2017}
 */
public class ListarAvisoPanel extends JPanel {

	static JTable tabla;

	private IServicio servicio = new Servicio();

	public ListarAvisoPanel() {

		setLayout(null);

		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(6, 50, 438, 206);
		add(scrollPane);

		tabla = new JTable();
		tabla.setModel(servicio.listar()); 
		scrollPane.setViewportView(tabla);

	}

}
