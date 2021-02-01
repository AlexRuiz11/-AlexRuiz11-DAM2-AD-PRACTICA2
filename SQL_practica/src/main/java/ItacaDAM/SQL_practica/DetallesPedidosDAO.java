package ItacaDAM.SQL_practica;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.DetachedCriteria;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Property;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query; 

public class DetallesPedidosDAO implements DAO {
	
	
	Scanner reader = new Scanner(System.in);


	public void insertar(Object a) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void modificar(Object a) throws Exception {
		// TODO Auto-generated method stub
		
	}

	public void eliminar(Object a) {
		// TODO Auto-generated method stub
		
	}

	public List obtenerTodos() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	public List<DetallesPedidosEntity> obtenerTodosIDcliente() throws Exception {

		Session sf = conex.setUp();		
		int id=5;
		int Total;
		System.out.println("Digame el limite de credito: ");
		id = reader.nextInt();

		
			
	Query   query = sf.createQuery("select  e   from DetallesPedidosEntity e where codigo_pedido in ( select codigo_pedido FROM PedidosEntity  where codigo_cliente=" + id+ ")  GROUP BY codigo_pedido");
		Query   query2 = sf.createQuery("select   sum(cantidad*precio_unidad) as Total   from DetallesPedidosEntity e where codigo_pedido in ( select codigo_pedido FROM PedidosEntity where codigo_cliente=" + id+ ") ");
		 List<DetallesPedidosEntity> entities2=query2.getResultList();
	
		System.out.println("El total es:" + entities2);

		   List<DetallesPedidosEntity> entities=query.getResultList();
		 
	    	        

 
 
		return entities;
		
	}

	public Object obtener(Object id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
