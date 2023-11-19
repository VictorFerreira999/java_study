/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista.Model;

/**
 *
 * @author ALUNO
 */
public class Produto {
    private String descricao, marca;
    private double preco;

    public Produto(String descricao, String marca, double preco) {
        this.descricao = descricao;
        this.marca = marca;
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" + "descricao=" + descricao + ", marca=" + marca + ", preco=" + preco + '}';
    }
    
}
