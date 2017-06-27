package presentacion;


import java.time.LocalDate;

import dominio.FranjaHoraria;

/**
 * @author Cristian Leyes
 * {@link https://github.com/cristiandley/programacionJunio2017}
 */
public interface IFormAviso {

	LocalDate getFechaPublicacion();
	String getDescripcion();
	Integer getDuracionPorSegundo();
	Double getImportePorSegundo();
	FranjaHoraria getFranjaHoraria();
	
}
