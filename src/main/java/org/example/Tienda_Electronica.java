import java.util.ArrayList;

public class Tienda_Electronica {
	private ArrayList<Producto> listaDeProductos;
	private ArrayList<Cliente>listaDeClientes;
	public ArrayList<Producto> unnamedProductos = new ArrayList<Producto>();
	public ArrayList<Cliente> unnamedCliente = new ArrayList<Cliente>();

	public void mostrarProducto() {
		throw new UnsupportedOperationException();
	}

	public void buscarProductosPorNombre(String nombre) {
		boolean encontrado = false;
		for (Producto producto : listaDeProductos) {
			if (producto.getNombre().equalsIgnoreCase(nombre)) {
				System.out.println("Producto encontrado" + producto);
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println("No se encontraron productos con el nombre: " + nombre);
		}
	}

	public void buscarProductosPorCategoria(String categoria) {
		boolean encontrado = false;
		for (Producto producto : listaDeProductos) {
			if (producto.getCategoria().equalsIgnoreCase(categoria)) {
				System.out.println("Productos encontrados" + producto);
				encontrado = true;
			}
		}

		if (!encontrado) {
			System.out.println("No se encontraron productos en esta categoria " + categoria);
		}
	}

	public void agregarProducto(Productos producto) {
		productos.add(producto);
		System.out.println("Producto agregado correctamente.");
	}

	public void modificarProducto(String nombre, double nuevoPrecio, int nuevoStock) {
		boolean productoEncontrado = false;

		for (Producto producto : productos) {
			if (producto.nombre.equalsIgnoreCase(nombre)) {
				producto.precio = nuevoPrecio;
				producto.stock = nuevoStock;
				productoEncontrado = true;
				System.out.println("Producto modificado correctamente.");
				break;
			}
		}

		if (!productoEncontrado) {
			System.out.println("Producto no encontrado.");
		}
	}

	public void eliminarProducto(String nombre) {
		Producto productoAEliminar = null;

		for (Producto producto : productos) {
			if (producto.nombre.equalsIgnoreCase(nombre)) {
				productoAEliminar = producto;
				break;
			}
		}

		if (productoAEliminar != null) {
			productos.remove(productoAEliminar);
			System.out.println("Producto eliminado correctamente.");
		} else {
			System.out.println("Producto no encontrado.");
		}
	}

	public void realizarCompra(String nombre, int cantidad) {
		Producto productoComprado = null;
		for (Producto producto : productos) {
			if (producto.nombre.equalsIgnoreCase(nombre)) {
				productoComprado = producto;
				break;
			}
		}

		if (productoComprado != null) {
			if (productoComprado.stock >= cantidad) {
				System.out.println("Compra realizada. Stock actualizado.");
			}

			else {
				System.out.println("No hay suficiente stock para realizar la compra.");
			}
		} else {
			System.out.println("Producto no encontrado.");
		}
	}

	}