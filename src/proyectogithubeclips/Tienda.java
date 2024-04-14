package proyectogithubeclips;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Tienda {

	ArrayList <Cliente> usuarios = new ArrayList <Cliente> ();
	ArrayList <Producto> stock = new ArrayList <Producto> ();
	Cliente cliente;
	Producto producto;
	
	public Tienda() {
		super();
	}
	
	public void añadirCliente () {
		
		String nom = JOptionPane.showInputDialog("Introduzca el nombre del cliente: ");
		String ape = JOptionPane.showInputDialog("Introduzca el apellido del cliente: ");
		String dni = JOptionPane.showInputDialog("Introduzca el dni del cliente: ");
		
		Cliente usuario = new Cliente (nom,ape,dni);
		
		usuarios.add(usuario);
	}
	
	public void añadirProducto () {
		
		String nombre = JOptionPane.showInputDialog("Introduzca el nombre del producto: ");
		String marcas = JOptionPane.showInputDialog("Elija la marca del producto: ");
		int id = Integer.parseInt(JOptionPane.showInputDialog("Introduzca el id del producto: "));
		int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Introduzca las unidades del producto: "));
		
		Producto elemento = new Producto (id,nombre,marcas,cantidad);
		
		stock.add(elemento);
	}
	
	public void mostrarClientes() {
		
		for (int i = 0; i < usuarios.size(); i++) {
			JOptionPane.showMessageDialog(null,usuarios.get(i));
		}
	}
	
	
	public void mostrarProductos () {
		
		for (int i = 0; i < stock.size(); i++) {
			JOptionPane.showMessageDialog(null,stock.get(i));
		}
	}
	
	
	
	
	
	
	
	
	
	
}
