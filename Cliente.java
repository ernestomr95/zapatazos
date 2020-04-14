package diagrama;

public class Cliente {
	String nombre;
	String dni;
	String fecha_nac;
	char sexo;
	Catalogo catalogo;
	Carrito carritoActual;

	public Cliente(String nombre, String dni, String fecha_nac, char sexo) {
		super();
		this.nombre = nombre;
		this.dni = dni;
		this.fecha_nac = fecha_nac;
		this.sexo = sexo;
	}

	public Cliente() {

	}

	public Cliente(String nombre, String dni, String fecha_nac, char sexo, Catalogo catalogo) {
		this.nombre = nombre;
		this.dni = dni;
		this.fecha_nac = fecha_nac;
		this.sexo = sexo;
		this.catalogo = catalogo;
		this.carritoActual = new Carrito();

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(String fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public char getSexo() {
		return sexo;
	}

	public void setSexo(char sexo) {
		this.sexo = sexo;
	}

	public void autentificarse() {

	}

	public void registrarse() {

	}

	public void ver_catalogo() {

		catalogo.ver_catalogo();
	}

	public void añadir_cesta(int id) {

		carritoActual.añadir_cesta(catalogo.getProducto(id));
	}

}
