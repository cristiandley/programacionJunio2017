package repositorio;

import java.sql.Connection;

/**
 * Created by Cristian Leyes on 27/06/17.
 */
public class Repositorio implements IRepositorio{

    private Connection conexion = null;

    /* Los datos de la base de datos con la que vamos a trabajar:
     * url de conexion (donde esta ubicada fisicamente la base de datos), usuario y password
     */
    private String url = "jdbc:mysql://localhost:3306/parcial";
    private String user = "root";
    private String password = "root";

    public Repositorio() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
