package diagrama;

public class Producto {
	String marca;
	String modelo;
	String color;
	String temporada;
	double talla;
	double precio;
	int id;
	int stock;

	public Producto(String marca, String modelo, String color, String temporada, double talla, double precio, int id,
			int stock) {
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.temporada = temporada;
		this.talla = talla;
		this.precio = precio;
		this.id = id;
		this.stock = stock;
	}

	public Producto() {

	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTemporada() {
		return temporada;
	}

	public void setTemporada(String temporada) {
		this.temporada = temporada;
	}

	public double getTalla() {
		return talla;
	}

	public void setTalla(double talla) {
		this.talla = talla;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {

		return "\n| Marca=" + marca + "|" + "\n| Modelo=" + modelo + "|" + "\n| Color=" + color + "|" + "\n| Temporada="
				+ temporada + "|" + "\n| Talla=" + talla + "|" + "\n| Precio=" + precio + "|" + "\n| Id=" + id + "|"
				+ "\n| Stock=" + stock + "|";
	}
}