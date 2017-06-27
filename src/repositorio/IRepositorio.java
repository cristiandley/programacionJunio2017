package repositorio;

import java.awt.List;

/**
 * @author Cristian Leyes
 * {@link https://github.com/cristiandley/programacionJunio2017}
 */
public interface IRepositorio {

	void guardar(Object objeto);
	List consultar();

}
