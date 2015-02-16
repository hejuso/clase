package Biblioteca;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Biblioteca {

	// atributos

	private Usuario[] usuarios;
	private Libro[] libros;
	

	// constructores

	public Biblioteca() {
		
		usuarios = new Usuario[50];
		libros = new Libro[50];
		
		Scanner in = null;

		try {

			in = new Scanner(new FileReader("infoBiblioteca.txt"));
			in.useDelimiter(";");

			int i = 0;
			boolean leerlibros = true;
			
			//for "Leer libros"

			for (i = 0; in.hasNext() && leerlibros; i++) {

				String titulo = in.next();
				System.out.println("TITULO: " + titulo);

				if (titulo.contains("Prestamos:")== false) {

					String autor = in.next();
					System.out.println("AUTOR: " + autor);
					int anyo = in.nextInt();
					System.out.println("AÑO: " + anyo);
					String editorial = in.next();
					System.out.println("EDITORIAL: " + editorial);
					String isbn = in.next();
					System.out.println("ISBN: " + isbn);

					Libro l = new Libro(titulo, autor, anyo, editorial, isbn);
					System.out.println(l.toString());
					libros[i] = l;

				} else {
					leerlibros = false;
				}

			}
			
			
			//for "Usuarios"
			
			int j=0;
			
			for(i=0; in.hasNext();i++){
				
					String nombre = in.next();
					System.out.println("Nombre "+nombre);
					String fecha_inicio = in.next();
					System.out.println("Fecha inicio "+fecha_inicio);
					
				
				for(j=0;j<num_prestamos;j++) {
					
					
				}
				
				
			}
			

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			in.close();
		}
	}

	// metodos

}