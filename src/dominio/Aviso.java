package dominio;

import java.time.LocalDate;

/**
 * @author Cristian Leyes
 * {@link https://github.com/cristiandley/programacionJunio2017}
 */
public abstract class Aviso {

    private long id;

    private String descripcion;

    private LocalDate fechaPublicacion;
   
    /**
     * -----------------------------------------------
	 * 				CALCULAR IMPORTE
	 * -----------------------------------------------
     * 
     * calcula el importe dado segun la franja horaria
     * 
     * @return importeCalculado
     */
   
    public double calcularImporte(){
    	double importeCalculado = 0;
		return importeCalculado;
    }
    
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
