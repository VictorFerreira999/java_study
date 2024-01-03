/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.util.ArrayList;

/**
 *
 * @author victo
 */
public class TratamentoDeErros {
    
    public static void main(String[] args){
        
        ArrayList<String> carros = new ArrayList<>();
        
        /*carros.add("HRV");
        carros.add("Polo");
        carros.add("Cruze");
        carros.add("Argo");
        carros.add("Fusion");
        */
        
        int  nota1, nota2, res;
        nota1 = 60;
        nota2 = 20;
        
        if(nota1 > 50){
            throw new IllegalArgumentException("Valor invalido");
        }
        if(nota2 > 50){
            throw new IllegalArgumentException("Valor invalido");
        }
        
        
        
        
        
        
        
        /*try{
            System.out.println(carros.get(10));
        }catch(Exception e){
            System.out.println("Erro: " + e.getMessage());
        }finally{
            System.out.println("fim do try");
        }
        */ 
        
        
        
    }
    
}
