/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author victo
 */
public class LeituraDeArquivo {
    public static void main(String[] args) {
        try (FileReader fileReader = new FileReader("C:\\Users\\victo\\OneDrive\\Pictures\\Estudos\\java\\java_study\\Estrutura_de_dados\\arquivosEscrita\\arquivo_saida.txt");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            String linha;
            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}