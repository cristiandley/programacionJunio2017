package dominio;

/**
 * @author Cristian Leyes
 * {@link https://github.com/cristiandley/programacionJunio2017}
 */
public class Tv extends Aviso{

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
