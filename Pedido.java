package diagrama;

public class Pedido {
	int id;
	String estado;
	String direccion;
	String fecha;

	public Pedido(int id, String estado, String fecha, String direccion) {
		this.id = id;
		this.estado = estado;
		this.fecha = fecha;
		this.direccion = direccion;
	}

	public Pedido(String fecha, String direccion) {
		this.fecha = fecha;
		this.direccion = direccion;
	}

	public Pedido() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

}