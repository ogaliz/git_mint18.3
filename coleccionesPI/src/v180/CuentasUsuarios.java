package v180;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Se debera buscar una colección que no permita repetir clientes.
 * Tabién habrá que plantear que tipo de operaciones realizaremos con mas asiduidad. 
 * **/
public class CuentasUsuarios {

	public static void main(String[] args) {
		
		Cliente cl1 = new Cliente("Antonio", "00001", 250000);
		Cliente cl2 = new Cliente("Lucia", "00002", 250000);
		Cliente cl3 = new Cliente("Daniela", "00003", 350000);
		Cliente cl4 = new Cliente("Julio", "00004", 500000);

		//Creamos la interfaz e instanciamos la clase que mas nos conviene.
		Set<Cliente> clientesbanco = new HashSet<>();
		
		clientesbanco.add(cl1);
		clientesbanco.add(cl2);
		clientesbanco.add(cl3);
		clientesbanco.add(cl4);
		
		/*for (Cliente cliente : clientesbanco) {
			System.out.println(cliente.getNombre()+" "+cliente.getN_cuenta()+" "+cliente.getSaldo()+".");
		}*/
		
		if(cl1.equals(cl2)) {
			System.out.println("Son el mismo libro.");
			System.out.println(cl1.hashCode());
			System.out.println(cl2.hashCode());
			
		}
		
		Iterator<Cliente> miIterador = clientesbanco.iterator();
		
		while(miIterador.hasNext()) {
			String nombreCliente = miIterador.next().getNombre();
			System.out.println(nombreCliente);

		}
		
		System.out.println("Borrado de un registro");
		
		Iterator<Cliente> borraDatos = clientesbanco.iterator();
		
		while(borraDatos.hasNext()) {
			
			String nombre_cliente = borraDatos.next().getNombre();
			
			if(nombre_cliente.equals("Antonio")) {
				
				borraDatos.remove();
			}
		}
		
		for (Cliente cliente : clientesbanco) {
			System.out.println(cliente.getNombre());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
