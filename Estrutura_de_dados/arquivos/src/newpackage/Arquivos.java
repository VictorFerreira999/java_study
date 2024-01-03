/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.nio.file.*;

/**
 *
 * @author victo
 */
public class Arquivos {
    
    public static void main(String[] args){
        Path diretorio = Paths.get("C:\\Users\\victo\\OneDrive\\Pictures\\Estudos\\java\\java_study\\Estrutura_de_dados\\arquivos");
        Path arquivo = Paths.get("C:\\Users\\victo\\OneDrive\\Pictures\\Estudos\\java\\java_study\\Estrutura_de_dados\\arquivos\\build.xml");
        
        if(Files.isDirectory(diretorio)){
            System.out.println("Diretorio exite");
        }else{
            System.out.println("Direto não existe");
        }
        if(Files.exists(diretorio)){
            System.out.println("Arquivo exite");
        }else{
            System.out.println("Arquivo não existe");
        }
        
    }    
}
