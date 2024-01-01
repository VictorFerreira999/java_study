/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author victo
 */

import java.util.LinkedList;

public class LinkedListClasse {
    public static void main(String[] args){
        LinkedList<String> lista = new LinkedList<>();
        lista.add("Elemento1");
        lista.add("Elemento2");
        lista.add("Elemento3");
        lista.add("Elemento4");
        lista.add("Elemento5");
        for(String elemento : lista){
            System.out.println(elemento);
        }
        
        lista.remove(1);
        for(String elemento : lista){
            System.out.println(elemento);
        }
        
        

    }
    
}
