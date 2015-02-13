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

		Scanner in = null;

		try {

			Libro[] libros = new Libro[4];
			in = new Scanner(new FileReader("infoBiblioteca.txt"));
			in.useDelimiter(";");

			int i = 0;
			boolean leerlibros = true;

			for (i = 0; in.hasNext() && leerlibros; i++) {

				String titulo = in.next();
				System.out.println("TITULO: " + titulo);

				if (titulo.compareTo("Prestamos:") != 0) {

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

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			in.close();
		}
	}

	// metodos

}