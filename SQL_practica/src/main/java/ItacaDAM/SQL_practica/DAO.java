package ItacaDAM.SQL_practica;

import java.util.List;

public interface DAO <T, K>{
	
	void insertar(T a) throws Exception;
	
	void modificar(T a) throws Exception;
	
	void eliminar(T a);
	
	List<T> obtenerTodos() throws Exception;
	T obtener (K id) throws Exception;


}
