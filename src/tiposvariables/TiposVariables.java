
package tiposvariables;


public class TiposVariables {

   
    public static void main(String[] args) {
       
    
    //Variables publicas
    VariablesPublicas.estado = 
            "PROCESANDO SOLICITUD";
   
    VariablesPublicas.identificador =
            (int) (Math.random()* 100);
    
    System.out.println("La Ciudad es " +
            Constantes.ciudad);
    
    if(Constantes.pais.equals("Argentina")) {
        VariablesPorInstancia variablesporinstancia =
            new VariablesPorInstancia("Daniel", "Programador");
            
    
    }
    
    
    }
    
}
  
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

