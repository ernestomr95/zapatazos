package diagrama;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Catalogo catalogo = new Catalogo();
		Cliente cliente = new Cliente();
		Carrito carrito = new Carrito();
		int rp, rp2, rp3, id;

		do {

			System.out.println("Bienvenido a Zapatazos. Por favor, regístrese para poder realizar una compra.");
			System.out.println("[1]-->Registrarse \n[2]-->Continuar sin registrar");

			rp = sc.nextInt();

			while (rp != 1) {
				System.out.println(
						"Lo siento, este programa solo está disponible para clientes registrados \n[1]-->Registrarse \n[2]-->Continuar sin registar");
				rp = sc.nextInt();
			}
			System.out.println("Introduzca su nombre");
			String nombre = sc.next();

			System.out.println("Introduzca su dni");
			String dni = sc.next();

			System.out.println("Introduzca su fecha de nacimiento en formato dd/mm/aaaa");
			String fecha_nac = sc.next();

			System.out.println("Introduzca su sexo");
			char sexo = sc.next().charAt(0);

			cliente = new Cliente(nombre, dni, fecha_nac, sexo, catalogo);

			System.out.println("Gracias por completar su registro " + cliente.nombre);

			System.out.println("[1]-->Ver catálogo \n[2]-->Salir de la aplicación");
			rp2 = sc.nextInt();

		} while (rp2 != 1);

		catalogo.ver_catalogo();
		do {
			System.out.println(
					"[1]-->Añadir producto a la cesta \n[2]-->Borrar pedido\n[3]-->Realizar pedido\n[4]-->Ver cesta\n[5]-->Ver precio actual\n[6]-->Ver pedido\n[7]-->Salir");

			rp3 = sc.nextInt();

			switch (rp3) {
			case 1:
				System.out.println("Introduzca el id del producto que quiere añadir a la cesta");
				id = sc.nextInt();
				Producto producto = catalogo.getProducto(id);
				carrito.añadir_cesta(producto);
				System.out.println("Producto añadido");

				break;

			case 2:
				carrito.borrarpedido();
				System.out.println("Su pedido ha sido borrado");
				break;

			case 3:
				carrito.realizarpedido();
				System.out.println("Gracias por confiar en Zapatazos," + cliente.nombre);
				break;

			case 4:
				carrito.vercesta();
				break;

			case 5:
				carrito.Sumaprecio();
				break;

			case 6:
				carrito.verpedido();
				System.out.println("A nombre de--> " + cliente.nombre);
				break;
			}
		} while (rp3 != 7);
		sc.close();
	}
}
