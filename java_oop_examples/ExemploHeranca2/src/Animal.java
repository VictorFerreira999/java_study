
import java.util.ArrayList;
import java.util.List;

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
    protected String especie;
    protected int idade;

    public Animal(String especie, int idade) {
        this.especie = especie;
        this.idade = idade;
    }
    
    public String comunicar(){
        return "...";
    }
    
    public static void main(String[] args) {
        Cachorro c = new Cachorro("cachorro", 3, "Caramelo");
        System.out.println(c.comunicar());
        List<Animal> animais = new ArrayList<>();
        animais.add(c);
    }
    
}
