/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUNO
 */
public class Pessoa {
    private String nome, cpf;
    private int idade;
    private double altura;

    public Pessoa(String nome, String cpf, int idade, double altura) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
        this.altura = altura;
    }

    public Pessoa(String nome, String cpf, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    
    public static void main(String[] args) {
        Pessoa p = new Pessoa("fulano", "934720803279", 19);
    }
}
