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
public class uniao {
    
        public uniao(){

            
        }
     
       
        
        public static boolean elementoNeutro(ArrayList listExterno){
            String status = null;
            if(listExterno == null){
                return true;  
            }
            return false;   
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
            
            for(Object i: listInterno){
                A_u_B.add((String) i);      //AuB
            }
            return A_u_B;
            
        }
        
        public static ArrayList uniao(ArrayList listInterno, ArrayList listExterno){
            ArrayList<String> A_u_B = listInterno;

            for(Object i: listInterno){
                A_u_B.add((String) i);      
            }
            return A_u_B;
            
        }
        
  } 

