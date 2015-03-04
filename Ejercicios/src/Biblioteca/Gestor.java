package Biblioteca;

import java.util.Scanner;

public class Gestor {

	public static int menu(Scanner tec) {

		System.out.println(" * * * MENU PRINCIPAL * * * \n" + "1. USUARIO \n"
				+ "2. LIBROS \n" + "3. PRESTAMOS \n" + "4. GUARDAR \n"
				+ "0. TERMINAR");

		System.out.println("");

		int op = tec.nextInt();

		return op;

	}

	public static int submenu(int submenu, Scanner tec) {
		int op = 0;

		switch (submenu) {

		case 1:

			System.out.println(" * * * MENU USUARIOS * * * \n"
					+ "1. Alta usuario \n" + "2. Baja usuario \n"
					+ "3. Informacion Usuario \n" + "0. Terminar");

			op = tec.nextInt();

			break;

		case 2:

			System.out.println(" * * * MENU LIBRO * * * \n"
					+ "1. Alta libro \n" + "2. Informacion libro \n"
					+ "0. Terminar");

			op = tec.nextInt();

			break;

		case 3:

			System.out.println(" * * * MENU PRESTAMOS * * * \n"
					+ "1. Prestamos Activos \n" + "2. Prestamos sancionados \n"
					+ "3. Histograma de prestamos \n" + "0. Terminar");

			op = tec.nextInt();

			break;

		} // fin switch

		return op;

	}

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int opcion;
		int opSubmenu = 0;

		Biblioteca b = new Biblioteca();
		do {

			opcion = menu(teclado);

			do {
				switch (opcion) {

				case 1:// usuarios

					opSubmenu = submenu(opcion, teclado);

					switch (opSubmenu) {

					case 1: // alta
						System.out.println("Alta USUARIO:");
						System.out.println("Introduce sus datos: \n");
						System.out.print("Nombre: ");
						String nombre = teclado.next();
						System.out.print("DNI: ");
						String dni = teclado.next();
						System.out.print("DIRECCION: ");
						String direccion = teclado.next();

						Usuario u = new Usuario(nombre, dni, direccion);
						b.altaUsuario(u);

						break;

					case 2: // baja

						System.out.println("Baja USUARIO:");
						b.getUsuarios();
						System.out.println("");
						System.out
								.println("Introduce el dni para dar de baja.");

						b.bajaUsuario(teclado.next());

						break;

					case 3: // Informacion

						System.out.println("Info USUARIO:");
						b.getUsuarios();
						System.out.println("Introduce el dni.");

						System.out.println(b.getUsuario(teclado.next())
								.toString());

						break;

					case 0:
						b.guardar();
						break;

					} // switch usuarios

					break;

				case 2:// libros

					opSubmenu = submenu(opcion, teclado);

					switch (opSubmenu) {

					case 1:

						System.out.println("Introduce los datos del libro.");
						System.out.println("TITULO: ");
						String titulo_ = teclado.next();

						System.out.println("AUTOR: ");
						String autor_ = teclado.next();

						System.out.println("ANYO: ");
						int anyo_ = teclado.nextInt();

						System.out.println("EDITORIAL: ");
						String editorial_ = teclado.next();

						System.out.println("ISBN: ");
						String isbn_ = teclado.next();

						Libro l = new Libro(titulo_, autor_, anyo_, editorial_,
								isbn_);

						b.altaLibro(l);
						System.out.println("");
						break;

					case 2:

						System.out.println("Info LIBRO:");
						b.getLibros();
						System.out.println("Introduce el ISBN.");

						System.out.println(b.getLibro(teclado.next())
								.toString());

						break;

					case 0:

						b.guardar();
						break;

					} // switch libros

				case 3:

					opSubmenu = submenu(opcion, teclado);

					switch (opSubmenu) {

					case 1:

						System.out.print(" PRESTAMOS ACTIVOS "
								+ b.getNumPrestamosActivos());

						break;
					case 2:

						System.out.print(" PRESTAMOS ACTIVOS "
								+ b.getNumPrestamosSanciones());

						break;
					case 3:

						System.out.println("HISTOGRAMA");

						b.histograma();

						break;
					case 0:

						b.guardar();
						break;

					}// swith prestamos

					break;

				} // switch menu

			} while (opSubmenu != 0);

		} while (opcion != 0);

	}
}