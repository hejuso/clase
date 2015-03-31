package pruebaBBDD;

import java.sql.ResultSet;
import java.sql.SQLException;

public class MainPrueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MyDataBase conexion = new MyDataBase();
		ResultSet resultado;
		String nombres;
		String DNI = null;
		
		resultado = conexion.getQuery("select * from asignado");
		
		try {
			while(resultado.next()){
				nombres = resultado.getString("codigo");
				DNI = resultado.getString("DNI");
				System.out.println("Código \n"+nombres);
				System.out.println("DNI \n"+DNI);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}