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
    
    public static boolean elementoNeutro(ArrayList listInterno, ArrayList listExternoUniverso){
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
    
    
    
    public static Boolean idempotencia(ArrayList listInterno, ArrayList listExterno){ 
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
    
    public static ArrayList comutativa(ArrayList listInterno, ArrayList listExterno){
            ArrayList<String> A_u_B = listInterno;
            
            for(Object i: listExterno){
                A_u_B.add((String) i);     
            }
            return A_u_B;
            
        }
    
    public static ArrayList Interseccao(ArrayList listInterno, ArrayList listExterno){
        ArrayList<String> Result = new ArrayList();
        
        for(Object i:listInterno){
            if(listExterno.contains(i)){
                Result.add((String) i);
            }   
        }
        return Result;
    }
    
   
    
    
    
    
    
    
    
    
    
    
}
