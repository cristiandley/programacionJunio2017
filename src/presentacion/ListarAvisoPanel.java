package presentacion;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import servicio.IServicio;
import servicio.Servicio;

import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import javax.swing.ListSelectionModel;
import javax.swing.RowFilter;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * @author Cristian Leyes
 * {@link https://github.com/cristiandley/programacionJunio2017}
 */
public class ListarAvisoPanel extends JPanel {
	
	private TableRowSorter<DefaultTableModel> filtrar;

	static JTable tabla;

	private IServicio servicio = new Servicio();
	private JTextField txtBuscar;

	public ListarAvisoPanel() {

		setLayout(null);

		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 101, 517, 221);
		add(scrollPane);

		tabla = new JTable();
		tabla.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		tabla.setModel(servicio.listar()); 
		scrollPane.setViewportView(tabla);
		
		filtrar = new TableRowSorter<DefaultTableModel>((DefaultTableModel) tabla.getModel());
		
		tabla.setRowSorter(filtrar);
		
		ListSelectionModel seleccion = tabla.getSelectionModel();
		seleccion.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		seleccion.addListSelectionListener(new ListSelectionListener() {
			@Override
			public void valueChanged(ListSelectionEvent e) {
			// TODO Auto-generated method stub
				System.out.println(tabla.getValueAt(tabla.getSelectedRow(),0));
			}
		});
		
		JLabel lblBuscar = new JLabel("Buscar:");
		lblBuscar.setBounds(12, 59, 70, 15);
		add(lblBuscar);
		
		txtBuscar = new JTextField();
		txtBuscar.setBounds(76, 59, 187, 17);
		add(txtBuscar);
		txtBuscar.setColumns(10);
		
		txtBuscar.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				filtrar();
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				filtrar();
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				filtrar();
			}
		});

	}
	
	private void filtrar() {
		//Creamos una lista de filtros para filtrar en mas de una columna
		ArrayList<RowFilter<Object,Object>> filtros = new ArrayList<RowFilter<Object,Object>>();
		filtros.add(RowFilter.regexFilter(txtBuscar.getText(), 0));
		filtros.add(RowFilter.regexFilter(txtBuscar.getText(), 1));
		filtros.add(RowFilter.regexFilter(txtBuscar.getText(), 2));
		RowFilter<Object, Object> rf = RowFilter.orFilter(filtros);
		filtrar.setRowFilter(rf);
	}
}
