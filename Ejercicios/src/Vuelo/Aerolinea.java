package Vuelo;
import java.util.*;
import java.io.*;
/**
 * Clase Aerolinea: Permite representar todos los vuelos de una aerolinea.
 *
 */
public class Aerolinea {
    // Atributos de instancia
    /* COMPLETAR */
	
	// Atributos de clase
    /** Numero maximo de vuelos de cada aerolinea. */
    public static final int MAX_VUELOS = 10;
    
    /** 
     *  Construye un objeto {@code Aerolinea} de nombre {@code nom}.
     *  @param nom String.
     */
    public Aerolinea(String nom) {
	
        /* COMPLETAR */
		   
    }

    /** 
     *  Lee desde fichero toda la informacion de los vuelos 
     *  que ofrece la aerolinea y los va almacenando en el 
     *  array de vuelos {@code vuelos}.
     */    
    private void cargar() {
     try{  
        Scanner fich = new Scanner(new File(this.nombre)); //, "UTF-8");
        
        while (fich.hasNext() && ofertados<MAX_VUELOS) {            
            String ident = fich.next();
            String origen = fich.next();
            String destino = fich.next();
            String horasal = fich.next();
            String horalleg = fich.next();
            fich.nextLine();            
            int reservadas = fich.nextInt();
            fich.nextLine();
            vuelos[ofertados] = new Vuelo(ident, origen, destino, horasal, horalleg);
            
            while(reservadas!=0) {
                int numP = fich.nextInt();
                String pas = fich.nextLine().trim();                
                vuelos[ofertados].reservar(pas,numP);
                reservadas--;
            }
            fich.nextLine();
            ofertados++;
        }
       
        fich.close();  
     }catch(IOException e){ System.out.println(e); }
    } // de cargar
    
    /** 
     *  Devuelve el nombre {@code nom} de la {@code Aerolinea}.
     *  @return String.
     */ 
    public String getNombre() { return nombre; }
    
    /** 
     *  Si existe, devuelve un vuelo con identificador {@code id} en el array de vuelos {@code vuelos}.
     *  Si no existe, devuelve {@code null}. 
     *  @param id String.
     *  @return Vuelo.
     */  
    public Vuelo getVuelo(String id) {
	
        /* COMPLETAR */
    
	} // de getVuelo   
           
    /** 
     *  Devuelve un {@code String} con los datos de todos los vuelos ofertados por la {@code Aerolinea}.
     *  @return String.
     */
    public String toString() {
        String str = "";
        for(int i=0; i<ofertados; i++) 
            str+=str.format("%12s %46s %5d\n", this.nombre, vuelos[i].toString(), Vuelo.MAX_PLAZAS-vuelos[i].getReservadas());
        return str;
    } // de toString
    
	/** 
     *  Devuelve un {@code String} con los vuelos con ciudad de origen {@code orig} y 
	 *  ciudad de destino {@code dest}, que no esten completos.
     *  @param orig String.
     *  @param dest String.
     *  @return String.
     */
    public String listarVuelos(String orig, String dest) {
		String str = "";
		
        /* COMPLETAR */
	
        return str; 		
    } // de listarVuelos
	
	/**
     * Devuelve un array {@code histograma} tal que:
     * histograma[i] = numero de vuelos que tienen i plazas reservadas (0<=i<=Vuelo.MAX_PLAZAS).
     * @return int[].
     */
    public int[] toHistograma() {
		/* se invoca desde el metodo toHistograma de la clase Alianza */ 
		int[] histograma = /* COMPLETAR */ ;
		
        /* COMPLETAR */
		
		return histograma;   
    } // de toHistograma
	
    /** 
     *  Escribe en un fichero llamado {@code nombre}, nombre de la {@code Aerolinea}, toda la informacion de la misma.   
     */
    public void guardar() {
	  /* se invoca desde el metodo guardar de la clase Alianza */ 
      try{
          //PrintWriter ficheroSalida = new PrintWriter(new OutputStreamWriter(new FileOutputStream(this.nom), "UTF-8"));
          PrintWriter ficheroSalida = new PrintWriter(this.nombre);
          for(int i=0; i<ofertados; i++) {
            vuelos[i].guardar(ficheroSalida);
            ficheroSalida.println("=== === === === === === === ===");
          }
          ficheroSalida.close();
      }catch(Exception ex) { System.err.println("Error al guardar: " + ex.getMessage()); }        
    } // de guardar
    
} // de Aerolinea