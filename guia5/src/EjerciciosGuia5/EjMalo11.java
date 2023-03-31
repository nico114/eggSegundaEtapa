/*
 Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.
 */
package EjerciciosGuia5;



/**
 *
 * @author Tomas
 */
public class EjMalo11 {
    public static void main(String[] args) {
     
        
       
        
        String equipo[] = {"Gaby","Thomas","nicolas","ana","miguel","German","Alicia"};
        String aux="";
        for (String muestra: equipo){
            aux=aux+" [ "+muestra + "]";
            
        }
        System.out.println( aux );
        
      
    }
    
}