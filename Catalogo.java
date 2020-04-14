package diagrama;

import java.util.ArrayList;

public class Catalogo {
	public String nombreCatalogo;
	public ArrayList<Producto> listaProductos;

	public Catalogo() {
		this.listaProductos = new ArrayList<Producto>();
		Producto p1 = new Producto("nike", "45", "naranja", "verano", 38, 60, 1, 54);
		Producto p2 = new Producto("adidas", "42", "verde", "verano", 37, 50, 2, 67);
		Producto p3 = new Producto("puma", "68", "rojo", "invierno", 45, 73, 3, 98);
		Producto p4 = new Producto("nike", "21", "blanco", "invierno", 31, 76, 4, 91);
		Producto p5 = new Producto("nike", "56", "negro", "verano", 34, 23, 5, 80);
		Producto p6 = new Producto("adidas", "45", "naranja", "verano", 45, 56, 6, 100);
		Producto p7 = new Producto("nike", "98", "azul", "verano", 38, 90, 7, 129);

		listaProductos.add(p1);
		listaProductos.add(p2);
		listaProductos.add(p3);
		listaProductos.add(p4);
		listaProductos.add(p5);
		listaProductos.add(p6);
		listaProductos.add(p7);
	}

	public void nuevoProducto(String marca, String modelo, String color, String temporada, double talla, double precio,
			int id, int stock) {
		Producto nuevoProducto = new Producto(marca, modelo, color, temporada, talla, precio, id, stock);
		listaProductos.add(nuevoProducto);

	}

	public void ver_catalogo() {
		for (Producto producto : listaProductos) {

			System.out.println(producto);
			System.out.println(" ***********");

		}

	}

	public Producto getProducto(int id) {
		for (Producto producto : listaProductos) {
			if (producto.getId() == id) {
				return producto;
			}
		}
		return null;
	}

}
