package graficos;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Event;

import javax.swing.*;

public class PruebaEventos {

	public static void main(String[] args) {
		
		MarcoBotones miMarco = new MarcoBotones();
		
		miMarco.setVisible(true);
		
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}//cierre del metodo main
	
}//cierre del class del main
	
class MarcoBotones extends JFrame{
		
	/**
	 * numero de serie para la clase 
	 */
	private static final long serialVersionUID = 1L;

	//metodo constructor
	public MarcoBotones() {
		
		setTitle("Botones y eventos");
		setBounds(700,400,700,400);
		
		LaminaBotones miLamina = new LaminaBotones();
		add(miLamina);
		
	}	
		
}//cierre del class MarcoBotones

class LaminaBotones extends JPanel{
	
	//Paso 1, instanciar los objetos boton
	JButton botonAzul = new JButton("Azul");
	JButton botonAmarillo = new JButton("Amarillo");
	JButton botonRojo = new JButton("Rojo");
	
	//metodo constructor, crear estado de la lamina por defecto.
	public LaminaBotones() {
		
		add(botonAzul);
		add(botonAmarillo);
		add(botonRojo);
		
		//añadimos el objeto que va a ser el modificado al aplicar la accion
		//action es lo mismo que decirle "al hacer clic"
		botonAzul.addActionListener();
		botonRojo.addActionListener();
		botonAmarillo.addActionListener();
		
	}//cierre del constructor
	
	
}//cierre de la clase LaminaBotones 

//vamos a crear un objeto para que no sea la propia lamina la que cambie con la accion
class ColorFondo implements ActionListener{
	
	public ColorFondo(Color c) {
		
		colorDeFondo=c;
	}
	
	public void actionPerformed(ActionEvent evento) {
		
	}
	
	private Color colorDeFondo; 
	
}//cierre de la clase ColorFondo
	
	
	


