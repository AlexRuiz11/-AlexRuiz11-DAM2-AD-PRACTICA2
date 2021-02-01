package ItacaDAM.SQL_practica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.query.Query;






public class ClienteDAO implements DAO{
	

Scanner reader = new Scanner(System.in);
ClienteEntity cliente2 = new ClienteEntity();



	public void insertar(Object a) throws Exception {
		
		
		Session sf = conex.setUp();
		
	
	 cliente2 = new ClienteEntity();
	 
	 
	 int codigo_cliente;
	 String  nombre_cliente; 
	 String  nombre_contacto; 
	 String  apellido_contacto; 
	 String  telefono;
	 String  fax;
	 String  linea_direccion1; 
	 String  linea_direccion2; 
	 String  ciudad;
	 String  region;
	 String  pais; 
	 int  codigo_postal; 
	 int  codigo_empleado_rep_ventas;
	 int  limite_credito;
	 
System.out.println("Vamos a crear un Cliente." +"\n"+" Dame su ID:");
codigo_cliente = reader.nextInt();
cliente2.setId(codigo_cliente);
System.out.println("Dime su nombre:");
nombre_cliente= reader.nextLine();
nombre_cliente= reader.nextLine();
cliente2.setNombre_cliente(nombre_cliente);
System.out.println("Dime el nombre del contacto");
nombre_contacto= reader.nextLine();
cliente2.setNombre_contacto(nombre_contacto);
System.out.println("Dime el apellido: ");
apellido_contacto= reader.nextLine();
cliente2.setApellido_contacto(apellido_contacto);
System.out.println("Dime tu telefono: ");
telefono = reader.nextLine();
cliente2.setTelefono(telefono);
System.out.println("Dime tu fax");
fax= reader.nextLine();
fax= reader.nextLine();
cliente2.setFax(fax);
System.out.println("Digame su 1ºDirección: " );
linea_direccion1= reader.nextLine();
cliente2.setLinea_direccion1(linea_direccion1);
System.out.println("Digame su 2ºDirección: ");
linea_direccion2= reader.nextLine();
cliente2.setLinea_direccion2(linea_direccion2);
System.out.println("Digame su  Ciudad: ");
ciudad= reader.nextLine();
cliente2.setCiudad(ciudad);
System.out.println("Digame su Región: ");
region= reader.nextLine();
cliente2.setRegion(region);
System.out.println("Digame su Pais: ");
pais= reader.nextLine();
cliente2.setPais(pais);
System.out.println("Digame su codigo postal: ");
codigo_postal = reader.nextInt();
cliente2.setCodigo_postal(codigo_postal);
System.out.println("Digame el codigo del empleado: ");
codigo_empleado_rep_ventas = reader.nextInt();
cliente2.setCodigo_empleado_rep_ventas(codigo_empleado_rep_ventas);
System.out.println("Digame el limite de credito: ");
limite_credito = reader.nextInt();
cliente2.setLimite_credito(limite_credito);
		
	
		sf.getTransaction().begin();
		sf.persist(cliente2);
		sf.getTransaction().commit();
		System.out.println("Cliente registrado..");
		System.out.println();
		
		
	}

	public void modificar(Object a) {
		// TODO Auto-generated method stub
		
	}

	public void eliminar(Object a) {
		// TODO Auto-generated method stub
		
	}

	public List<ClienteEntity> obtenerTodos() throws Exception  {
		
		
		
	  
	    	
			Session sf = conex.setUp();
			

			   //Query   query = sf.createQuery("select  nombre_cliente  from ClienteEntity e ORDER BY nombre_cliente");createQuery("select  e  from ClienteEntity e");
			Query   query = sf.createQuery("select  e  from ClienteEntity e");
			  
			   List<ClienteEntity> entities=query.getResultList();
			 
		    	        
	
	    
	    
			return entities;
	}

	public Object obtener(Object id) throws Exception {
		
		Session sf = conex.setUp();

		cliente2 = new ClienteEntity();
		System.out.println("Digite el id del producto a buscar:");
	
		//cliente2 = sf.find(ClienteEntity.class, reader.nextInt());
		cliente2 = sf.find(ClienteEntity.class, reader.nextInt());
	
			System.out.println(cliente2);
			System.out.println();
		 
		
		return id;
		
	}
	
	
public List<ClienteEntity> obtenerNombre(Object id) throws Exception {
		
		Session sf = conex.setUp();
		String dato;

		cliente2 = new ClienteEntity();
		System.out.println("Dime el nombre del cliente, el nombre del contacto o el apellido del contacto");
		dato= reader.nextLine();

	
		Query   query = sf.createQuery("select  e  from ClienteEntity e where nombre_cliente = '"+ dato +"'" +" or nombre_contacto= '"+dato+"' or apellido_contacto = '"+dato+ "'");//“nombre_cliente”, “nombre_contacto” o “apellido_contacto”.

		  
		   List<ClienteEntity> entities=query.getResultList();
		
		return entities;
		
	}

}
