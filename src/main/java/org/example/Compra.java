import java.util.ArrayList;

public class Compra {
	private String cliente;
	private String producto;
	public ArrayList<Productos> unnamed_Productos_ = new ArrayList<Productos>();

	public String getCliente() {
		return this.cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String getProducto() {
		return this.producto;
	}

	public void setProducto(String producto) {
		this.producto = producto;
	}
}