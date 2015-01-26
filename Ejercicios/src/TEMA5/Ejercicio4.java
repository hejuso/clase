package TEMA5;

public class Ejercicio4 {

	// ATRIBUTOS

	int X;
	int Y;

	// CONSTRUCTOR

	public Ejercicio4() {
		X = 0;
		Y = 0;
	}

	public Ejercicio4(int i, int j) {

		X = i;
		Y = j;
	}

	// METODOS

	public int getX() {

		return X;
	}

	public int getY() {

		return Y;
	}

	public void imprimir() {

		System.out.println("Esta situado en el punto (" + X + "," + Y + ")");
	}

}