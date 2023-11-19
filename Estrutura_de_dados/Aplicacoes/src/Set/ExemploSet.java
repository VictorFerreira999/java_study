/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Faça um programa que leia uma frase e informe o número de palavras não 
repetidas da frase
*/
public class ExemploSet {
    public static void main(String[] args) {
        System.out.println("Digite uma frase");
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();
        String[] palavras = frase.split(" ");
        Set<String> palavras2 = new HashSet<>();
        for (int i = 0; i < palavras.length; i++) {
            boolean sim = palavras2.add(palavras[i]);
            if(sim){
                palavras[i] = null;
            }
        }
        for (int i = 0; i < palavras.length; i++) {
            if(palavras2.contains(palavras[i])){
                palavras2.remove(palavras[i]);
            }
        }
        
        System.out.println(palavras2.size());
        
    }
}
