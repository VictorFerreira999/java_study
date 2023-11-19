/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUNO
 */
public class PessoaJuridica extends PessoaFisica{
    private String cnpj;
    
    public PessoaJuridica(String nome, int idade, String cpf, String cnpj) {
        super(nome, idade, cpf);
        this.cnpj = cnpj;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public static void main(String[] args) {
        PessoaJuridica p = 
        new PessoaJuridica("fulano", 19, "349284324", "984325234");
        
        System.out.println(p.getNome());
        System.out.println(p.getCpf());
    }
    
}
