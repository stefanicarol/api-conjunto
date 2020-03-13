/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author pedro.def
 */
public class verificacao {
    
    public static class uniao{
        
        ArrayList<String> uniao = new ArrayList();
        
        public boolean elementoNeutro(ArrayList listInterno, ArrayList listExterno){
            String status = null;
            if(listExterno == null){
                return true;  
            }
            return false;   
        }
        
        
        public Boolean idempotencia(ArrayList listInterno, ArrayList listExterno){
            Boolean status = null;
            for(Object i: listInterno){
                if(listExterno.equals(i)){
                    status =true;
                }
                else{
                    return false;
                }     
            }
            return status;  
        }
        
        
        public Boolean comutativa(ArrayList listInterno, ArrayList listExterno){
            ArrayList<String> conjunto1 = new ArrayList();
            ArrayList<String> conjunto2 = new ArrayList();
            
            
            /*
            AuB --> ListInterno (uniao) listExterno
            */
            for(Object i: listInterno){
                conjunto1.add((String) i);
                
                
                
                
                
            }
            
            
            
            
        }
        
  } 
}
