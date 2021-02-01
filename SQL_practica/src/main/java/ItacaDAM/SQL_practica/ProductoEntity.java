package ItacaDAM.SQL_practica;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table( name = "producto" )
public class ProductoEntity {

		  @Id
		  @Column(name = "codigo_producto")
		  private String codigo_producto;
		  
		  @Column(name = "nombre")
		  private String  nombre_producto;
		  
		  
		  @Column(name = "gama")
		  private String  gama;
					  
		  
		  @Column(name = "dimensiones")
		  private String  dimensiones; 
		  
		  @Column(name = "proveedor")
		  private String  proveedor; 		  
		  
		  @Column(name = "descripcion")
			 private String  descripcion; 
		  
		  @Column(name = "cantidad_en_stock")
		  private int  cantidad_en_stock; 		  
		  
		  @Column(name = "precio_venta")
		  private int  precio_venta;
		  
		  @Column(name = "precio_proveedor")
		  private int  precio_proveedor;

		public String getCodigo_producto() {
			return codigo_producto;
		}

		public void setCodigo_producto(String codigo_producto) {
			this.codigo_producto = codigo_producto;
		}

		public String getNombre_producto() {
			return nombre_producto;
		}

		public void setNombre_producto(String nombre_producto) {
			this.nombre_producto = nombre_producto;
		}

		public String getGama() {
			return gama;
		}

		public void setGama(String gama) {
			this.gama = gama;
		}

		public String getDimensiones() {
			return dimensiones;
		}

		public void setDimensiones(String dimensiones) {
			this.dimensiones = dimensiones;
		}

		public String getProveedor() {
			return proveedor;
		}

		public void setProveedor(String proveedor) {
			this.proveedor = proveedor;
		}

		public String getDescripcion() {
			return descripcion;
		}

		public void setDescripcion(String descripcion) {
			this.descripcion = descripcion;
		}

		public int getCantidad_en_stock() {
			return cantidad_en_stock;
		}

		public void setCantidad_en_stock(int cantidad_en_stock) {
			this.cantidad_en_stock = cantidad_en_stock;
		}

		public int getPrecio_venta() {
			return precio_venta;
		}

		public void setPrecio_venta(int precio_venta) {
			this.precio_venta = precio_venta;
		}

		public int getPrecio_proveedor() {
			return precio_proveedor;
		}

		public void setPrecio_proveedor(int precio_proveedor) {
			this.precio_proveedor = precio_proveedor;
		}

		
		
		@Override
		public String toString() {
			return " [codigo_producto=" + codigo_producto + ", nombre_producto=" + nombre_producto
					+ ", gama=" + gama + ", dimensiones=" + dimensiones + ", proveedor=" + proveedor + ", descripcion="
					+ descripcion + ", cantidad_en_stock=" + cantidad_en_stock + ", precio_venta=" + precio_venta
					+ ", precio_proveedor=" + precio_proveedor + "]";
		}
		  
		  
		  
		  
		  
	
		  
		
}
