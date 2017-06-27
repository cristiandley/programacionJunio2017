package servicio;

import javax.swing.table.DefaultTableModel;

import presentacion.IFormAviso;


/**
 * @author Cristian Leyes 
 * {@link https://github.com/cristiandley/programacionJunio2017}
 */
public interface IServicio {

	void cargar(IFormAviso formulario);
	
	DefaultTableModel listar();
	
}
