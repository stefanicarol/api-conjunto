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


public class Conjunto {
    
    private String nome;
    private String elemento;
    ArrayList<String> elementos = new ArrayList();

    public Conjunto() {
        
    }

    public Conjunto(String nome) {
        this.nome = nome;
    }

    
    public String getNome() {
        return nome;
    }

    public String getElemento() {
        return elemento;
    }

    public ArrayList<String> getElementos() {
        return elementos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setElemento(String elemento) {
        this.elemento = elemento;
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
    
    
    public Boolean contem(ArrayList conjList){
        Boolean status = true;
            for(Object el:conjList){
                if(elementos.contains(el)){
                    status = true;     
                }
                else{
                    return false;
                }
            }
            return status;
            }         
    
    
    
    
    
    
    
    
    public String imprimir() {
        return "Conjunto{" + "Conjunto" + nome + " {" + elementos + '}';
    }
    
}