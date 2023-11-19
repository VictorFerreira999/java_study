/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilha;

import java.util.Scanner;
import java.util.Stack;

/*
Escreva um programa para verificar se uma expressão matemática tem os parenteses
agrupados de forma correta
((A + B) - INCORRETO
A+B( - INCORRETO
)A + B(-C - INCORRETO
(A+B))-(C+D - INCORRETO
((A + B)+D) - CORRETA
*/
public class Exemplo2 {
    public static void main(String[] args) {
        Stack<Character> pilha = new Stack<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma expressão");
        String palavra = scan.nextLine();
        char[] palavra2 = palavra.toCharArray();
        for (int i = 0; i < palavra2.length; i++) {
            if(palavra2[i] == '('){
                pilha.push(palavra2[i]);
            } else if(palavra2[i] == ')'){
                if(!pilha.empty()){
                    pilha.pop();
                } else {
                    pilha.push(palavra2[i]);
                }
            }
        }
        if(pilha.empty()){
            System.out.println("A expressão está correta");
        } else {
            System.out.println("A expressão está incorreta");
        }
    }
}
