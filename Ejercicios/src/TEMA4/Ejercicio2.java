package TEMA4;

import java.io.*;
import java.util.*;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner in = null;
		int c;

		try {
			in = new Scanner(new FileReader("palabrasMinus.txt"));
			in.useDelimiter(",");
			do {
				System.out.println(in.next().toLowerCase());

			} while (in.hasNext() == false);

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			in.close();
		}
	}

}