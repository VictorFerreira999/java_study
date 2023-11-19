/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUNO
 */
public class Animal {
    private String nome, especie;

    public Animal(String nome, String especie) {
        this.nome = nome;
        this.especie = especie;
    }

    @Override
    public String toString() {
        return "Animal{" + "nome=" + nome + ", especie=" + especie + '}';
    }
    
    
    
}
