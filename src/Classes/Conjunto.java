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
    
    
    public Boolean contem_propriamente(ArrayList listElementos){
        boolean Status = true;
        
        for(Object el: listElementos){
            if(elementos.contains(el)){
                Status  = false; // não e conjunto propriamente
            }else{
                Status = true;
            }
        }
        
        if(Status == true){
            boolean Status2 = true;
            for(Object el: elementos){
                if(! listElementos.contains(el)){
                    Status2 = false;           
                }    
            }     
        }  
        return Status;
    }
    
    
 
  
    
    public ArrayList<String> uniao(ArrayList listElementos){
        
 
        if (uniao.elementoNeutro(listElementos) == true){
            return getElementos();
        }

        
        else if(uniao.idempotencia(elementos,listElementos).equals(true)){
            return getElementos();
        }
        
        
        else if(uniao.comutativa(elementos,listElementos).equals(true)){ 
            return null;
            
        }
        else{
            return uniao.uniao(elementos,listElementos);
            
        }   
    }
    
   
    public ArrayList<String> Interseccao(ArrayList listElementos, ArrayList ConjuntoUniverso){
        
        if(Interseccao.elementoNeutro(elementos, ConjuntoUniverso) == true){
            return getElementos();
        }
        
        else if(Interseccao.idempotencia(elementos,listElementos).equals(true)){
            return getElementos();
        }
        
        else if(Interseccao.comutativa(elementos,listElementos).equals(true)){ 
            return null;
            
        }
        
        else{
            return Interseccao.Interseccao(elementos,listElementos);
            
        }   
        
    }
    
    public ArrayList Complemento(ArrayList listElementos){
        ArrayList<String> Result = listElementos;
        
        for(Object i : elementos){
            if(listElementos.contains(i)){
                Result.remove(i);
            }   
        }
        return Result;
    }
    
    
    public ArrayList Diferenca(ArrayList listElementos){
        ArrayList<String> Result = listElementos;
        
        for(Object i : elementos){
            if(listElementos.contains(i)){
             Result.remove(i);
            }else{
              Result.add(i.toString());
            }
        }
        return  Result;
         
    }
    
    public ArrayList<String> ConjuntoDasPartes(){
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
        return Result;
    }
    
    
    public ArrayList<String> ProdutoCartesiano(ArrayList listElementos){
        ArrayList<String> Result = new ArrayList();

        for(Object i: elementos){
            for(Object j: listElementos){
                if(i != j){
                    Result.add("{" + i + "," + j + "}"); 
                }
            }
        }
        System.out.print(Result);
        return Result;
     }
     
    public String imprimir() {
        return "Conjunto{" + "Conjunto" + nome + " {" + elementos + '}';
    }
    
}
