/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUNO
 */
public class PessoaFisica extends Pessoa{
    protected String cpf;
    
    public PessoaFisica(String nome, int idade, String cpf) {
        super(nome, idade);
        this.cpf = cpf;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public static void main(String[] args) {
        PessoaFisica p = new PessoaFisica("fulano", 19, "432977238");
        p.nome = "ciclano";
        
    }
    
}
