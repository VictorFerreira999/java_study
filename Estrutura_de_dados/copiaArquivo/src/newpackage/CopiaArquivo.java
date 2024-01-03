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
public class CopiaArquivo {
    /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
    
    public static void main(String[] args){
        Path logoNova = Paths.get("C:\\Users\\victo\\OneDrive\\Pictures\\Estudos\\java\\java_study\\Estrutura_de_dados\\copiaArquivo\\aaa.jpg");
        Path logoAntiga = Paths.get("C:\\Users\\victo\\OneDrive\\Pictures\\Estudos\\java\\java_study\\Estrutura_de_dados\\copiaArquivo\\teste.jpg");
        
        try{
            byte[] bytesLogoNova = Files.readAllBytes(logoNova);
            Files.write(logoAntiga, bytesLogoNova);
            
        }catch(Exception e){
            System.out.println("Erro");
        }        
        
        
    }    
}


