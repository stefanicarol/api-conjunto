/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;

/**
 *
 * @author pedrohenriquesilvarodrigues
 */
public class Interseccao {
    
    public Interseccao(){
        
    }
    
    public boolean elementoNeutro(ArrayList listInterno ,ArrayList listExternoUniverso){
            Boolean status = null;
            for(Object i: listInterno){
                if(listExternoUniverso.equals(i)){
                    status = true;
                }
                else{
                    return false;
                }
            }
            return status;     
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
    
    
    
    
    
    
    
    
    
    
    
    
}
