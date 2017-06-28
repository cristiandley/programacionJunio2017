package repositorio;

import java.util.List;
import java.util.ArrayList;

import dominio.Tv;

/**
 * @author Cristian Leyes
 * {@link https://github.com/cristiandley/programacionJunio2017}
 */
public interface IRepositorio {

	void guardar(Object objeto);
	List<?> consultar();

}
