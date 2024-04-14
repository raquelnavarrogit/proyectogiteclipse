package proyectogithubeclips;

public class Producto {

	private int id;
	private String nombre;
	private String marca ;
	private int cantidad;
	
	public Producto(int id, String nombre, String marca, int cantidad) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.marca = marca;
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return "Producto [id=" + id + ", nombre=" + nombre + ", marca=" + marca + ", cantidad=" + cantidad + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	
	
	
	
	
	
	

}
