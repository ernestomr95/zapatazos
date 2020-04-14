package diagrama;

public class Ventas {
	int id,unidades;
	String fecha_venta,comprador,fecha_envio,fecha_llegada,direccion;
	double importe;
	
	public Ventas(int id, int unidades, String fecha_venta, String comprador, String fecha_envio, String fecha_llegada,
			String direccion, double importe) {
		super();
		this.id = id;
		this.unidades = unidades;
		this.fecha_venta = fecha_venta;
		this.comprador = comprador;
		this.fecha_envio = fecha_envio;
		this.fecha_llegada = fecha_llegada;
		this.direccion = direccion;
		this.importe = importe;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getUnidades() {
		return unidades;
	}
	public void setUnidades(int unidades) {
		this.unidades = unidades;
	}
	public String getFecha_venta() {
		return fecha_venta;
	}
	public void setFecha_venta(String fecha_venta) {
		this.fecha_venta = fecha_venta;
	}
	public String getComprador() {
		return comprador;
	}
	public void setComprador(String comprador) {
		this.comprador = comprador;
	}
	public String getFecha_envio() {
		return fecha_envio;
	}
	public void setFecha_envio(String fecha_envio) {
		this.fecha_envio = fecha_envio;
	}
	public String getFecha_llegada() {
		return fecha_llegada;
	}
	public void setFecha_llegada(String fecha_llegada) {
		this.fecha_llegada = fecha_llegada;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	
	public void Consultarfactura() {
		
		System.out.println();
	}
}