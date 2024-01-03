/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.io.IOException;
import java.nio.file.*;
import java.util.List;

/**
 *
 * @author victo
 */
public class ArquivosList {
    
    public static void main(String[] args){
        Path arquivo = Paths.get("C:\\Users\\victo\\OneDrive\\Pictures\\Estudos\\java\\java_study\\Estrutura_de_dados\\arquivos\\New.txt");
        
        try{
            List<String> linhas = Files.readAllLines(arquivo);
            /*for(String linha : linhas){
                System.out.println(linha);
            }
            */
            linhas.forEach(linha -> System.out.println(linha));
        }catch(Exception e){
            System.out.println("Erro");
        }        
        
        
    }    
}
