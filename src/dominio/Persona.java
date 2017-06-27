package dominio;

import java.time.LocalDate;

/**
 * Created by cristian on 27/06/17.
 */
public class Persona {

    private long id;

    private String nombre;

    private String apellido;

    private int documento;

    private TipoDocumento tipoDocumento;

    private LocalDate fechaNacimiento;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public TipoDocumento getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(TipoDocumento tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /*
    * CONSTRUCTOR
    * */

    public Persona(String nombre, String apellido, int documento, TipoDocumento tipoDocumento,
                   LocalDate fechaNacimiento) {
        super();
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.tipoDocumento = tipoDocumento;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona() {
        super();
    }

    @Override
    public String toString() {
        return "Persona [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento
                + ", tipoDocumento=" + tipoDocumento + ", fechaNacimiento=" + fechaNacimiento + "]";
    }
}
