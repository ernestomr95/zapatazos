package diagrama;

import java.util.ArrayList;
import java.util.Scanner;

public class Carrito {

	public ArrayList<Producto> arraycesta = new ArrayList<Producto>();

	public void añadir_cesta(Producto producto) {
		arraycesta.add(producto);

	}

	Pedido pedido = new Pedido();

	Scanner sc = new Scanner(System.in);

	public void Sumaprecio() {
		double y = 0;
		for (Producto producto : arraycesta) {
			double x = producto.getPrecio();
			y = y + x;
		}

		System.out.println(y);
	}

	public void vercesta() {
		for (Producto producto : arraycesta) {
			System.out.println(producto);
		}

	}

	Cliente cliente = new Cliente();

	public void realizarpedido() {
		System.out.println("Introduzca el dia de su pedido en formato dd/mm/aaaa");

		String fecha = sc.nextLine().substring(0, 2);

		System.out.println("Introduzca la dirección del pedido ");

		String direccion = sc.nextLine();
		int id = 1;
		String estado = "En camino";
		pedido = new Pedido(id, estado, fecha, direccion);
		System.out.println("El pedido se enviará a: " + pedido.getDireccion());
		System.out.println("Fecha de entrega, dia: " + (Integer.parseInt(pedido.getFecha()) + 15));

	}

	public void borrarpedido() {
		this.arraycesta = new ArrayList<Producto>();
	}

	public void verpedido() {
		System.out.println("Pedido con id--> " + pedido.getId() + "\nEstado--> " + pedido.getEstado() + "\nFecha--> "
				+ pedido.getFecha() + "\nDireccion--> " + pedido.getDireccion() + "\n");

	}
}