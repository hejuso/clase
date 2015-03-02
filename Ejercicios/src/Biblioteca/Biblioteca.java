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
			in.nextLine();
			// in.nextLine();

			int i = 0;
			boolean leerlibros = true;

			// for "Leer libros"

			for (i = 0; in.hasNext() && leerlibros; i++) {

				in.nextLine();
				String titulo = in.next();
				System.out.println("");
				System.out.println("TITULO: " + titulo);

				if (titulo.contains("Prestamos:") == false) {

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

			// for "Usuarios"

			int j = 0;

			for (i = 0; in.hasNext(); i++) {

				System.out.println("");
				System.out.println("USUARIOS");
				System.out.println("");
				String nombre = in.next();
				System.out.println("Nombre: " + nombre);
				String dni = in.next();
				System.out.println("DNI: " + dni);
				String direccion = in.next();
				System.out.println("Dirección: " + direccion);
				int num_prestamos = in.nextInt();
				System.out.println("Num. Prestamos: " + num_prestamos);
				System.out.println("");

				Prestamo[] p = new Prestamo[num_prestamos];
				for (j = 0; j < num_prestamos; j++) {

					in.nextLine();
					System.out.println("");
					System.out.println("LIBROS");
					System.out.println("");
					int id = in.nextInt();
					System.out.println("ID: " + id);
					String libro = in.next();
					System.out.println("Libro: " + libro);
					String fecha_inicio = in.next();
					System.out.println("Fecha inicio: " + fecha_inicio);
					String fecha_fin = in.next();
					System.out.println("Fecha Fin: " + fecha_fin);
					String sanction = in.next();
					System.out.println("Sanción: " + sanction);
					String estado = in.next();
					System.out.println("Estado: " + estado);

					int k;
					int posicion = 0;
					boolean encontrado = false;

					for (k = 0; k < libros.length && !encontrado; k++) {

						if (libros[k] != null
								&& libro.contains(libros[k].getTitulo())) {

							posicion = k;

							encontrado = true;
						}

					}

					Prestamo prestamo = new Prestamo(id, libros[posicion],
							fecha_inicio, fecha_fin, sanction, estado);
					p[j] = prestamo;

				}
				System.out.println("");
				System.out.println("MOSTRAR USUARIOS toString()");
				Usuario u = new Usuario(nombre, dni, direccion, p);
				System.out.println(u.toString());

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			in.close();
		}
	}

	// metodos

	public void altaUsuario(Usuario usuarios_) {

		int i = 0;
		boolean anyadido = false;

		while (!anyadido) {

			if (usuarios[i] == null) {

				usuarios[i] = usuarios_;
				anyadido = true;
			}
			i++;

		}

	}

	public void bajaUsuario(String dni_) {

		boolean borrado = false;
		int i = 0;

		while (!borrado) {

			if (usuarios[i].getDNI() == dni_) {

				usuarios[i] = null;
				borrado = true;
			}

			i++;
		}

	}

	public void altaLibro(Libro libro_) {

		int i = 0;
		boolean anyadido = false;

		while (!anyadido) {

			if (libros[i] == null) {

				libros[i] = libro_;
				anyadido = true;
			}
			i++;

		}

	}

	public int getNumPrestamosActivos() {

		int i = 0;
		int numPrestamosActivos = 0;

		for (i = 0; i < usuarios.length; i++) {

			if (usuarios[i] != null) {
				Prestamo[] prestamosActivos = usuarios[i].getPrestamosActivos();
				for (int j = 0; j < prestamosActivos.length; j++) {
					if (prestamosActivos[i] != null) {
						numPrestamosActivos++;
					}
				}
			}

		}

		return numPrestamosActivos;
	}

	public int getNumPrestamosSanciones() {

		int i = 0;
		int numPrestamosSancionados = 0;

		for (i = 0; i < usuarios.length; i++) {

			if (usuarios[i] != null) {
				Prestamo[] prestamosSancionados = usuarios[i]
						.getPrestamosSancionados();
				for (int j = 0; j < prestamosSancionados.length; j++) {
					if (prestamosSancionados[i] != null) {
						numPrestamosSancionados++;
					}
				}
			}

		}

		return numPrestamosSancionados;

	}

	public Usuario[] getUsuarios() {

		int i = 0;

		for (i = 0; i < usuarios.length && usuarios[i] != null; i++) {

			System.out.println(usuarios[i].toString());

		}

		return usuarios;
	}

	public Libro[] getLibro() {

		int i = 0;

		for (i = 0; i < libros.length && libros[i] != null; i++) {

			System.out.println(libros[i].toString());

		}

		return libros;

	}

	public Usuario getUsuario(String dni) {

		int i = 0;
		Usuario getUsuario = null;
		boolean encontrado = false;

		for (i = 0; i < usuarios.length && usuarios[i] != null; i++) {

			if (!encontrado && usuarios[i].getDNI().equals(dni)) {

				getUsuario = usuarios[i];

			}
		}

		return getUsuario;

	}

	public Libro getLibro(String isbn) {

		int i = 0;
		Libro getLibro = null;
		boolean encontrado = false;

		for (i = 0; i < libros.length && libros[i] != null; i++) {

			if (!encontrado && libros[i].getIsbn().equals(isbn)) {

				getLibro = libros[i];

			}
		}

		return getLibro;

	}

	public void histograma() {

		int i = 0;
		int histograma[] = new int[10];

		for (i = 0; i < usuarios.length && usuarios[i] != null; i++) {

			histograma[usuarios[i].getNumPrestamos()]++;
			System.out.println("Prestamos: " + usuarios[i].getNumPrestamos());

		}

		int j = 0;

		for (i = 0; i < histograma.length; i++) {

			if (histograma[i] != 0) {

				System.out.print("Con " + i + "prestamos, hay: ");
				for (j = 0; j < histograma[j]; j++) {

					System.out.print("| ");

				}

			}

		}

	}
	
	/*public void guardar(){
		
		PrintWriter out = null;
		
		try{
			
			
		}catch{
			
		}finally{
			
		}
		
	}*/

}
