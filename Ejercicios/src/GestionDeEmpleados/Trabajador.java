package GestionDeEmpleados;

public class Trabajador {

	// atributos

	private String nombre;
	private String dni;
	private int antiguedad;
	private int salario;
	private String departamento;

	// Constructor

	public Trabajador(String anombre, String adni, int aantiguedad,
			int asalario, String adepartamento) {

		nombre = anombre;
		dni = adni;
		antiguedad = aantiguedad;
		salario = asalario;
		departamento = adepartamento;

	}
	
	//Metodos
	
	public String getNombre(){
		return nombre;
	}
	
	public String getDNI(){
		return dni;
	}
	
	public int getAntiguedad(){
		return antiguedad;
	}
	
	public int getSalario(){
		
		return salario;
	}
	
	public String getDepartamento(){
		
		return departamento;
	}
	
	//Lo convierte todo a String
	public String toString(){
		
		String datos = nombre+" con DNI: "+dni+".Antiguedad de "+Integer.toString(antiguedad)+". Departamento: "+departamento+". Salario: "+Integer.toString(salario);
		
		return datos;
	}

}
