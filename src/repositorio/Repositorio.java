package repositorio;

import java.util.List;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import dominio.FranjaHoraria;
import dominio.Tv;

/**
 * @author Cristian Leyes
 * {@link https://github.com/cristiandley/programacionJunio2017}
 */
public class Repositorio implements IRepositorio {

	private Connection conexion = null;

	/**
	 * ----------------------------------------------- 
	 * 				DATOS CONEXION DB
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
	 * 		OVERRIDE METHODS INTERFACE 'IRepositorio' 
	 * -----------------------------------------------
	 */

	@Override
	public void guardar(Object objeto) {

		try {
			conexion = DriverManager.getConnection(url, user, password);

			/**
			 * ----------------------------------------------- 
			 * 			FORMATO QUERY Y PREPARACION 
			 * -----------------------------------------------
			 */
			String queryInsert = "INSERT "
					+ "INTO "
					+ "aviso "
					+ "(descripcion, "
					+ "fecha_publicacion, "
					+ "duracion, "
					+ "importe_por_segundo, "
					+ "franja_horaria) "
					+ "VALUES (?,?,?,?,?)";
			
			PreparedStatement stmt = conexion.prepareStatement(queryInsert);

			Tv tv = (Tv) objeto;

			stmt.setString(1, tv.getDescripcion());
			stmt.setDate(2, Date.valueOf(tv.getFechaPublicacion()));
			stmt.setInt(3, tv.getDuracionPorSegundo());
			stmt.setDouble(4, tv.getImportePorSegundo());
			stmt.setString(5, tv.getFranjaHoraria().toString());
			/* Ejecutamos la Query */
			stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (!conexion.isClosed()) {
					conexion.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	@Override
	public List<?> consultar() {
		List<Tv> avisos = new ArrayList<Tv>();


		try {

			conexion = DriverManager.getConnection(url, user, password);

			/**
			 * ----------------------------------------------- 
			 * 			FORMATO QUERY Y PREPARACION 
			 * -----------------------------------------------
			 */
			String consulta = "SELECT "
					+ "id, "
					+ "descripcion, "
					+ "fecha_publicacion, "
					+ "duracion, "
					+ "importe_por_segundo, "
					+ "franja_horaria "
					+ "FROM "
					+ "aviso";

			PreparedStatement stmt = conexion.prepareStatement(consulta);
			
			/* EJECUCION QUERY */
			ResultSet rs = stmt.executeQuery();
			/* RECORREMOS CADA REGISTRO */
			while (rs.next()) {
				
				Tv tv = new Tv();
				tv.setId(rs.getLong(1));
				tv.setDescripcion(rs.getString(2));
				tv.setFechaPublicacion(rs.getDate(3).toLocalDate());
				tv.setDuracionPorSegundo(rs.getInt(4));
				tv.setImportePorSegundo(rs.getDouble(5));
				tv.setFranjaHoraria(FranjaHoraria.valueOf(rs.getString(6)));
				
				avisos.add(tv);
			}
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (!conexion.isClosed()) {
					conexion.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return avisos;
	}

}
