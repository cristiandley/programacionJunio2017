package dominio;

import java.time.LocalDate;

/**
 * @author Cristian Leyes
 * {@link https://github.com/cristiandley/programacionJunio2017}
 */
public class Tv extends Aviso{

	private Integer duracionPorSegundo;
	
	private double importePorSegundo;
	
	private FranjaHoraria franjaHoraria;

	public Tv(String descripcion, LocalDate fechaPublicacion, Integer duracionPorSegundo, Double importePorSegundo,
			FranjaHoraria franjaHoraria) {
		super();
		this.descripcion = descripcion;
		this.fechaPublicacion = fechaPublicacion;
		this.duracionPorSegundo = duracionPorSegundo;
		this.importePorSegundo = importePorSegundo;
		this.franjaHoraria = franjaHoraria;
	}
	
	/**
	 * -----------------------------------------------
	 * 				GETTERS & SETTERS
	 * -----------------------------------------------
	 */
	
	public Integer getDuracionPorSegundo() {
		return duracionPorSegundo;
	}

	public void setDuracionPorSegundo(Integer duracionPorSegundo) {
		this.duracionPorSegundo = duracionPorSegundo;
	}

	public double getImportePorSegundo() {
		return importePorSegundo;
	}

	public void setImportePorSegundo(double importePorSegundo) {
		this.importePorSegundo = importePorSegundo;
	}

	public FranjaHoraria getFranjaHoraria() {
		return franjaHoraria;
	}

	public void setFranjaHoraria(FranjaHoraria franjaHoraria) {
		this.franjaHoraria = franjaHoraria;
	}

	
	/**
	  * -----------------------------------------------
	  *   OVERRIDE METHOD ABSTRAC CLASS 'Aviso'
	  * -----------------------------------------------
	 * @return 
	 */

	@Override
	public double calcularImporte() {
		return (this.getImportePorSegundo() * this.getDuracionPorSegundo());
	}
	

	@Override
	public String toString() {
		return "Aviso "
				+ "[id=" + id 
				+ ", descripcion=" + descripcion 
				+ ", fechaPublicacion=" + fechaPublicacion
				+ ", duracionPorSegundo=" + duracionPorSegundo
				+ ", importePorSegundo=" + importePorSegundo 
				+ ", franjaHoraria=" + franjaHoraria + "]";
	}

	
	
	
}
