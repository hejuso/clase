package GestionDeEmpleados;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.*;

public class Empresa {

	// Atributos

	private String nombre = "Empresas CHACHIS S.L.";
	private int antiguedadEmpresa;
	private int maxTrabajadores;
	private int numTrabajadores;
	private Trabajador[] trabajadores;

	// constructor

	public Empresa() {

		int numTrab = 0;
		int i = 0;
		
		Scanner in = null;
		try {
			
			in = new Scanner(new FileReader("TrabajadoresEmpresa.txt"));
			while(in.hasNext()) {
				
				String nombreT = in.next();
				String dniT = in.next();
				int antiguedadT = in.nextInt();
				int salarioT = in.nextInt();
				String departamentoT = in.next();
				
				Trabajador t = new Trabajador(nombreT, dniT, antiguedadT, salarioT, departamentoT);
				trabajadores [i] = t;
				
			}
						
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			in.close();

		}
	}
		//Metodos
		

		
		public int getNumTrabajadores(){
			
			return numTrabajadores;
		}
		
		public String getNombreEmpresa(){
			
			return nombre;
		}
		
		public boolean existeEmpleado(String numDni){
			
			int i = 0;
			System.out.println("numTrabajadores: "+numTrabajadores);
			while(i < numTrabajadores && !numDni.equals(trabajadores[i].getDNI()) ){
				System.out.println(trabajadores[i].getDNI());
				i++;
			}
			
			boolean existe = false;
			
			if (i < trabajadores.length){
			existe = true; 
			}
			
			return existe;
		}
		
		public void anyadirEmpleado(Trabajador e){
			
			boolean existe = existeEmpleado(e.getDNI());
					
			if (!existe && numTrabajadores < maxTrabajadores){
				
				trabajadores[]
				
			}
			
			
		}

	
}