/**
 * Clase Alianza: Una Alianza es una agrupacion de aerolineas.
 */
package Vuelo;
public class Alianza {
    // Atributos de instancia
    /* COMPLETAR */
	
	// Atributos de clase
	/** Numero maximo de aerolineas de la Alianza. */
	public static final int MAX_AEROLINEAS = 3;
	
    /** 
     *  Construye un objeto {@code Alianza}.   
     */    
    public Alianza() {
        /* COMPLETAR */
		
    }
	
	/** 
     *  Si existe, devuelve el vuelo con identificador {@code id} en el array de aerolineas {@code aerolineas}. 
     *  Si no existe, devuelve {@code null}.
     *  
     *  @param id String.
     *  @return Vuelo.
     */ 
   // public Vuelo getVuelo(String id) {
	//
        /* COMPLETAR */
		
   // } // de getVuelo
      
    /** 
     *  Devuelve un {@code String} con los vuelos de todas las aerolineas de la {@code Alianza}.
     *  @return String.
     */  
    /*public String toString() {
        String str = String.format("\n%12s %9s %10s %12s %10s %8s %6s\n","AEROLINEA","IDVUELO","ORIGEN","DESTINO","HSALIDA","HLLEGADA","LIBRES");
        str+="----------------------------------------------------------------------------\n";
        for(int i=0; i<MAX_AEROLINEAS; i++) str+=aerolineas[i].toString()+"\n";
        return str;*/
   // } // de toString    
    
    /** 
     *  Devuelve un {@code String} con los vuelos de todas las aerolineas con ciudad de origen {@code orig} y 
	 *  ciudad de destino {@code dest}, que no esten completos.
     *  
     *  @param orig String.
     *  @param dest String.
	 *  @return String.
     */ 
   /* public String listarVuelos(String orig, String dest) {        
        String str = String.format("\n%12s %9s %10s %12s %10s %8s %6s\n","AEROLINEA","IDVUELO","ORIGEN","DESTINO","HSALIDA","HLLEGADA","LIBRES");
        str+="----------------------------------------------------------------------------\n";
        for(int i=0; i<MAX_AEROLINEAS; i++)
            str+=aerolineas[i].listarVuelos(orig,dest);    
        return str;    
    }*/ // de listarVuelos
    
    /**
	 * Convierte a {@code String} el array {@code histograma} con el histograma de ocupacion de vuelos.
	 * @param int[] histograma.
	 * @return String.
     */	 
    private String toStringHistograma(int[] histograma) {
		String str = "\n==== HISTOGRAMA DE OCUPACION ====\n";   
		
        /* COMPLETAR */
		
	    return str;
	}
    	
    /**
     * Devuelve un {@code String} con el histograma de ocupacion de los vuelos de todas las aerolineas.
     * @return String.
     */    
    /*public String toHistograma() {
	    // Declara y crea el array histograma 
	    /* COMPLETAR */
		
        // Calcula el histograma, invocando para cada aerolinea al metodo toHistograma de la clase Aerolinea        
        /* COMPLETAR */
		
        // Convierte el histograma en String       
        /* COMPLETAR */
		
    //}// de toHistograma
    
	/**
     * Guarda la informacion de todas las aerolineas en sus correspondientes ficheros
     * de texto.
     */
    /*public void guardar() {
       for(int i=0; i<MAX_AEROLINEAS; i++) aerolineas[i].guardar();        
    } */// de guardar
	
} // de Alianza
