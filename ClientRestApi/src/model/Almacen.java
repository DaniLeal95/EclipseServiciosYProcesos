package model;

public class Almacen {
	//propiedades
	private int idproducto,cantidad;
	private String tipo,nombre;
	
	//constructores
	public Almacen (){
		this.idproducto = 0;
		this.cantidad = 0;
		this.tipo = null;
		this.nombre = null;
	}
	public Almacen(int idproducto, int cantidad, String tipo, String nombre) {
		
		this.idproducto = idproducto;
		this.cantidad = cantidad;
		this.tipo = tipo;
		this.nombre = nombre;
	}
	
	//getters and setters
	public int getIdproducto() {
		return idproducto;
	}
	public void setIdproducto(int idproducto) {
		this.idproducto = idproducto;
	}
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Override
	public String toString() {
		return "Almacen [idproducto=" + idproducto + ", cantidad=" + cantidad + ", tipo=" + tipo + ", nombre=" + nombre
				+ "]";
	}
	
	
}
