package PruebaVentana;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;



public class Ventana extends JFrame implements ActionListener{
	
	//constructor
	
	JPanel contentpane;
	JTextField texto1, texto2, texto3;
	JButton boton1, boton2, boton3, boton4;
	
	public Ventana(){
		
		setBounds(550, 350, 450, 300);
		setVisible(true);
		contentpane = new JPanel();
		contentpane.setBackground(Color.lightGray);
		setContentPane(contentpane);
		contentpane.setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//contenido ventana
		
		texto1 = new JTextField("5");
		texto2 = new JTextField();
		texto3 = new JTextField();
		
		boton1 = new JButton("LE BUTTON");
		boton2 = new JButton();
		boton3 = new JButton();
		boton4 = new JButton();
		
		texto1.setBounds(25,75,140,25);
		contentpane.add(texto1);
		
		
		boton1.setBounds(25, 25, 140, 25);
		contentpane.add(boton1);
		boton1.addActionListener(this);
	/*	texto2.setBounds(x, y, width, height);
		texto3.setBounds(x, y, width, height); */

		
	}
	
	
	
	public static void main(String args[]){
		
		
		
		Ventana v = new Ventana();
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		
		if (e.getSource()==boton1){
			
			texto1=new JTextField("2");
		}
		
	}



	private JTextField JTextField(String string) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
