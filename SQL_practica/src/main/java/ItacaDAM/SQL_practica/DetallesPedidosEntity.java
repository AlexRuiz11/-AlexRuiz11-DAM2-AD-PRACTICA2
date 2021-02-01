package ItacaDAM.SQL_practica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table( name = "detalle_pedido" )
public class DetallesPedidosEntity {
	
			  @Id
			  @Column(name = "codigo_pedido")
			  private int codigo_pedido;
			  
			  @Column(name = "codigo_producto")
			  private String  codigo_producto;
			  
			  
			  @Column(name = "cantidad")
			  private int  cantidad;
						  
			  
			  @Column(name = "precio_unidad")
			  private double  precio_unidad; 
			  
			  @Column(name = "numero_linea")
			  private int  numero_linea;

			public int getCodigo_pedido() {
				return codigo_pedido;
			}

			public void setCodigo_pedido(int codigo_pedido) {
				this.codigo_pedido = codigo_pedido;
			}

			public String getCodigo_producto() {
				return codigo_producto;
			}

			public void setCodigo_producto(String codigo_producto) {
				this.codigo_producto = codigo_producto;
			}

			public int getCantidad() {
				return cantidad;
			}

			public void setCantidad(int cantidad) {
				this.cantidad = cantidad;
			}

			public double getPrecio_unidad() {
				return precio_unidad;
			}

			public void setPrecio_unidad(double precio_unidad) {
				this.precio_unidad = precio_unidad;
			}

			public int getNumero_linea() {
				return numero_linea;
			}

			public void setNumero_linea(int numero_linea) {
				this.numero_linea = numero_linea;
			}

			@Override
			public String toString() {
				return " [codigo_pedido=" + codigo_pedido + ", codigo_producto="
						+ codigo_producto + ", cantidad=" + cantidad + ", precio_unidad=" + precio_unidad
						+ ", numero_linea=" + numero_linea + "]\n";
			} 		  
			  
			  
			  
			

}
