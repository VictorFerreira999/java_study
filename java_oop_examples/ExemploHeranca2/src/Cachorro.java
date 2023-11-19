
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
public class Cachorro extends Animal{
    
    private String raça;
    
    public Cachorro(String especie, int idade, String raça) {
        super(especie, idade);
        this.raça = raça;
    }
    
    @Override
    public String comunicar(){
        return "Wholf wholf";
    }
    
    
}
