package dominio;

/**
 * @author Cristian Leyes
 *
 */
public class Tv {

	private Integer duracionPorSegundo;
	
	private double importePorSegundo;
	
	private FranjaHoraria franjaHoraria;

	
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

	
	
}
