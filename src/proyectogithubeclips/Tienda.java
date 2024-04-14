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
	
	
	
	
	
	
	
	
	
	
	
	
}
