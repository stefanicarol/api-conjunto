/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.util.ArrayList;
import Classes.uniao;
import Classes.Interseccao;




/**
 *
 * @author pedro.def
 */


public class Conjunto  {
    
    private String nome;
    ArrayList<String> elementos = new ArrayList();

    public Conjunto() {
        
    }
    
    public Conjunto(String nome) {
        this.nome = nome;
    }
    
   
    public String getNome() {
        return nome;
    }


    public ArrayList<String> getElementos() {
        return elementos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setElementos(ArrayList<String> elementos) {
        this.elementos = elementos;
    }
    
    
    public String inserir(String elemento){
        if (elementos.contains(elemento)){
            return "já possui";
        }
        else{
            elementos.add(elemento);
            return "Adicionado";
        }
    }
    
    public Boolean pertence(String elemento){
        if(elementos.contains(elemento)){
            return true;
        }
        else{
            return false;
        }  
    }
    
    
    public Boolean contem(ArrayList listElementos){
        Boolean status = true;
            for(Object el:listElementos){
                if(elementos.contains(el)){
                    status = true;     
                }
                else{
                    return false;
                }
            }
            return status;
            }
    
    
    public Boolean contem_propriamente(){
        return true;
    }
    
    
 
  
    
    public String uniao(ArrayList listElementos){
        
 
        if (uniao.elementoNeutro(listElementos).equals(true)){
            return imprimir();
        }
        
        else if(uniao.idempotencia(elementos,listElementos).equals(true)){
            return imprimir();
        }
        
        // falta comunitativa 
        else if(uniao.comutativa(elementos,listElementos).equals(true)){ 
            return null;
            
        }
        else{
            return uniao.uniao(elementos,listElementos);
            
        }   
    }
    
   
    public String Intersecçao(){
        if(Interseccao.)
        
        
    }
    
    
  
    
    public ArrayList Complemento(ArrayList listElementos){
        ArrayList<String> Result = listElementos;
        
        for(Object i : elementos){
            if(listElementos.equals(i)){
                Result.remove(i);
            }   
        }
        return Result;
    }
    
    
    public ArrayList Diferenca(ArrayList listElementos){
        ArrayList<String> Result = listElementos;
        
        for(Object i : elementos){
            if(listElementos.equals(i)){
                Result.remove(i);
            }
        }
        return  Result;
        
        
    }
    
    public void ConjuntoDasPartes(){
        ArrayList<String> Result = new ArrayList();

        
        for(Object i: elementos){
            Result.add("{" + i + "}");
        }
     
        for(Object i: elementos){
            for(int j = 1; j < elementos.size();j++){
                if(i != elementos.get(j) && j > -1){
                    Result.add("{" + i + "," + elementos.get(j) + "}"); 
                }
            }
        }
 
        
        Result.add("{" + elementos + "}"); 
        System.out.print(Result);
    }
    
    
    public void ProdutoCartesiano(ArrayList listElementos){
        ArrayList<String> Result = new ArrayList();

        for(Object i: elementos){
            for(Object j: listElementos){
                if(i != j){
                    Result.add("{" + i + "," + j + "}"); 
                }
            }
        }
        System.out.print(Result);
     }
     
    public String imprimir() {
        return "Conjunto{" + "Conjunto" + nome + " {" + elementos + '}';
    }
    
}
