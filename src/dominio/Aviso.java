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
   
    abstract double calcularImporte();
    
    /**
	 * -----------------------------------------------
	 * 				GETTERS & SETTERS
	 * -----------------------------------------------
	 */
    
    public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public LocalDate getFechaPublicacion() {
		return fechaPublicacion;
	}

	public void setFechaPublicacion(LocalDate fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}

    
}
