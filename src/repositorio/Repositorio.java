package repositorio;

import java.awt.List;
import java.sql.Connection;

/**
 * Created by Cristian Leyes on 27/06/17.
 */
public class Repositorio implements IRepositorio{

    private Connection conexion = null;

    /**
	  * -----------------------------------------------
	  *     		DATOS CONEXION DB
	  * -----------------------------------------------
	 */
    private String user = "root";
    private String password = "root";
    private String url = "jdbc:mysql://localhost:3306/parcial";

    public Repositorio() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
	  * -----------------------------------------------
	  *   OVERRIDE METHODS INTERFACE 'IRepositorio'
	  * -----------------------------------------------
	 */
    
	@Override
	public void guardar(Object objeto) {
		
		
		
	}

	@Override
	public List consultar() {
		
		
		return null;
	}

}
