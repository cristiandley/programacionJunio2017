package dominio;

import java.time.LocalDate;

/**
 * @author Cristian Leyes
 * {@link https://github.com/cristiandley/programacionJunio2017}
 */
public abstract class Aviso {

    protected long id;

    protected String descripcion;

    protected LocalDate fechaPublicacion;
   
    /**
     * -----------------------------------------------
	 * 				CALCULAR IMPORTE
	 * -----------------------------------------------
     */
   
    abstract void calcularImporte();
}
