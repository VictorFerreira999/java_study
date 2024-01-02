/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arquivos;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author victo
 */
public class arquivos {
    public static void  main(String[] args){
        try (FileWriter fileWriter = new FileWriter("C:\\Users\\victo\\OneDrive\\Pictures\\Estudos\\java\\java_study\\Estrutura_de_dados\\arquivosEscrita\\arquivo_saida.txt");
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)){
            
            bufferedWriter.write("Conteúdo a ser escrito no arquivo.");
            bufferedWriter.newLine();
            bufferedWriter.write("Outra linha.");
                
            } catch (IOException e){
                e.printStackTrace();
            }
    }
    
}
