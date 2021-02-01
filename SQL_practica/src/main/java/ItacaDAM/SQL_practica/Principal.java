package ItacaDAM.SQL_practica;

import java.util.Scanner;


public class Principal {

	public static void main(String[] args) throws Exception {
		


		int opcion=0;
		Scanner reader = new Scanner(System.in);

		 
		 ClienteDAO miCliente = new ClienteDAO();	
		 ClienteEntity cliente = new ClienteEntity();

		 ProductoDAO miProducto = new ProductoDAO();	
		 ProductoEntity producto = new ProductoEntity();
		 
		 DetallesPedidosDAO midetallesPedidos= new DetallesPedidosDAO();

		
		
		
		 System.out.println("1-Añadir un cliente" +"\n"+ "2-Buscar un cliente por ID" +"\n"+ "3-Mostrar todos los clientes" +"\n"+ "4-Buscar por NombreCliente, NombreContacto o ApellidoContacto"
			 		+"\n"+ "5-Actualizar un producto" +"\n" +"6-Muestra todos los detalles de los pedidos de un Cliente "+"\n"+ "0-Para salir");
		 opcion = reader.nextInt();
		
		
		while (opcion!=0) {
	
			switch (opcion) {
			case 1:
					
				 miCliente.insertar(cliente);

				
				break;
			case 2:
				
				miCliente.obtener(cliente);


				
				break;
				
			case 3:
				
				System.out.println( miCliente.obtenerTodos());

				break;
		
			case 4:
				
							
				System.out.println(miCliente.obtenerNombre(cliente));

				break;
			case 5:
				
				
				miProducto.modificar(producto);

				break;
				
				
				case 6:
				
					System.out.println( midetallesPedidos.obtenerTodosIDcliente());

					
				break;

			
			default:
				System.out.println("Opción no válida\n");
				break;
			}
			
			 System.out.println("1-Añadir un cliente" +"\n"+ "2-Buscar un cliente por ID" +"\n"+ "3-Mostrar todos los clientes" +"\n"+ "4-Buscar por NombreCliente, NombreContacto o ApellidoContacto"
				 		+"\n"+ "5-Actualizar un producto" +"\n" +"6-Muestra todos los detalles de los pedidos de un Cliente "+"\n"+ "0-Para salir");
			 opcion = reader.nextInt();
			
			
			
			
		}
				
		 
		
		    
	
		 
		 
		

	}
	
}
