package presentacion;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.time.LocalDate;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

import dominio.FranjaHoraria;
import servicio.IServicio;
import servicio.Servicio;

/**
 * @author Cristian Leyes
 * {@link https://github.com/cristiandley/programacionJunio2017}
 */
public class CrearAvisoPanel extends JPanel implements IFormAviso {

	
	private JTextField txtDescripcion;
	private JFormattedTextField txtFechaPublicacion;
	private JTextField txtDuracionPorSegundo;
	private JTextField txtImportePorSegundo;
	private JComboBox<FranjaHoraria> cbxFranjaHoraria;
	
	private IServicio servicio = new Servicio();
	
	/**
	  * -----------------------------------------------
	  *     		CREACION DEL PANEL
	  * -----------------------------------------------
	 */
	public CrearAvisoPanel() {
		
		setLayout(null);
		
		/**
		  *
		  *     		LABELS
		  *
		 */
		JLabel lblDescripcion = new JLabel("Descripcion:");
		lblDescripcion.setBounds(38, 32, 61, 16);
		add(lblDescripcion);
		
		JLabel lblFechaPublicacion = new JLabel("Fecha Publicacion:");
		lblFechaPublicacion.setBounds(38, 66, 61, 16);
		add(lblFechaPublicacion);
		
		JLabel lblDuracionPorSegundo = new JLabel("Duracion Por Segundo:");
		lblDuracionPorSegundo.setBounds(38, 106, 109, 16);
		add(lblDuracionPorSegundo);
		
		JLabel lblImportePorSegundo = new JLabel("Importe Por Segundo");
		lblImportePorSegundo.setBounds(38, 144, 73, 16);
		add(lblImportePorSegundo);
		
		JLabel lblFranjaHoraria = new JLabel("Franja Horaria:");
		lblFranjaHoraria.setBounds(38, 185, 116, 16);
		add(lblFranjaHoraria);
		
		/**
		  *
		  *     		FIELDS
		  *
		 */
		
		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(193, 27, 130, 26);
		add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		try {
			txtFechaPublicacion = new JFormattedTextField(new MaskFormatter("##/##/####"));
		} catch (ParseException e1) {
			e1.printStackTrace();
		}
		txtFechaPublicacion.setBounds(193, 61, 130, 26);
		add(txtFechaPublicacion);
		
		txtDuracionPorSegundo = new JTextField();
		txtDuracionPorSegundo.setBounds(193, 102, 130, 27);
		add(txtDuracionPorSegundo);
		txtDuracionPorSegundo.setColumns(10);
		
		txtImportePorSegundo = new JTextField();
		txtImportePorSegundo.setBounds(193, 139, 130, 26);
		add(txtImportePorSegundo);
		txtImportePorSegundo.setColumns(10);
		
		cbxFranjaHoraria = new JComboBox<FranjaHoraria>();
		cbxFranjaHoraria.setModel(new DefaultComboBoxModel<FranjaHoraria>(FranjaHoraria.values()));
		cbxFranjaHoraria.setBounds(193, 180, 130, 26);
		add(cbxFranjaHoraria);
		
		IFormAviso formulario = this;
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				servicio.cargar(formulario);
				ListarAvisoPanel.tabla.setModel(servicio.listar());
			}
		});
		btnGuardar.setBounds(206, 229, 117, 29);
		add(btnGuardar);
		
	}
	
	/**
	  * -----------------------------------------------
	  *     OVERRIDE METHODS INTERFACE 'IFormAviso'
	  * -----------------------------------------------
	 */

	@Override
	public LocalDate getFechaPublicacion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Integer getDuracionPorSegundo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Double getImportePorSegundo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FranjaHoraria getFranjaHoraria() {
		// TODO Auto-generated method stub
		return null;
	}

}
