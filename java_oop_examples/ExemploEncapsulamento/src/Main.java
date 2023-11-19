/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUNO
 */
public class Main {
    public static void main(String[] args) {
        Conta c = new Conta("fulano", 1000);
        c.nome = "ciclano";
        c.setSaldo(1200);
        System.out.println(c.nome);
        System.out.println(c.getSaldo());
    }
}
