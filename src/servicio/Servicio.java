package servicio;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import javax.swing.table.DefaultTableModel;

import dominio.Tv;
import presentacion.IFormAviso;
import repositorio.IRepositorio;
import repositorio.Repositorio;

/**
 * @author Cristian Leyes
 *         {@link https://github.com/cristiandley/programacionJunio2017}
 */
public class Servicio implements IServicio {
	
	private IRepositorio repositorio = new Repositorio();

	/**
	  * -----------------------------------------------
	  *     OVERRIDE METHODS INTERFACE 'IServicio'
	  * -----------------------------------------------
	 */
	

	@Override
	public void cargar(IFormAviso formulario) {
		
		Tv tv = new Tv();
		tv.setDescripcion(formulario.getDescripcion());
		tv.setFechaPublicacion(formulario.getFechaPublicacion());
		tv.setDuracionPorSegundo(formulario.getDuracionPorSegundo());
		tv.setImportePorSegundo(formulario.getImportePorSegundo());
		tv.setFranjaHoraria(formulario.getFranjaHoraria());
		
		repositorio.guardar(tv);

	}

	@Override
	public DefaultTableModel listar() {

		List<Tv> avisos = (List<Tv>) repositorio.consultar();

		/**
		 * ----------------------------------------------- 
		 * 			ORDENAMIENTO <Mayor/Menor>
		 * ----------------------------------------------- 
		 */
		Collections.sort(avisos, new Comparator<Tv>() {

			@Override
			public int compare(Tv o1, Tv o2) {
				return o1.getFechaPublicacion().compareTo(o2.getFechaPublicacion());
			}
		}.reversed()); 


		/**
		 * ----------------------------------------------- 
		 * 		MODELO DE DATOS A VISUALIZAR
		 * ----------------------------------------------- 
		 */
		DefaultTableModel modelo = new DefaultTableModel();

		String[] columnas = { "ID", "Descripcion", "Fecha Publicacion", "Duracion (s)", "Costo/s", "Horario", "Importe Total" };

		modelo.setColumnIdentifiers(columnas);

		for (Tv tv: avisos) {
			Object[] row = { 
					tv.getId(),
					tv.getDescripcion(),
					tv.getFechaPublicacion(),
					tv.getDuracionPorSegundo(),
					tv.getImportePorSegundo(),
					tv.getFranjaHoraria(),
					tv.calcularImporte()
					};
			
			modelo.addRow(row);
		}

		return modelo;
	}

}
