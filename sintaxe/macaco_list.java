
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
/*
Desenvolva uma classe Macaco que possua os atributos nome e 
estomago (será uma lista)
Métodos: comer(alimento), verEstomago(), digerir().
Faça um programa criando dois macacos, alimentando-os com 3 alimentos diferentes 
e verificando o conteúdo do estomago a cada refeição.
Experimente fazer com que um macaco se alimente do outro, 
é possível fazer um macaco canibal?
*/
public class Macaco {
    
    private String nome;
    private List<String> estomago;
    
    public Macaco(String nome){
        this.nome = nome;
        estomago = new ArrayList<String>();
    }
    
    public void comer(String alimento){
        estomago.add(alimento);
    }
    
    public void verEstomago(){
        System.out.println(estomago);
    }
    
    public void digerir(){
        estomago.remove(0);
    }
    
    public static void main(String[] args) {
        Macaco cezar = new Macaco("Cezar");
        Macaco prego = new Macaco("Prego");
        
        cezar.comer("Banana");
        cezar.verEstomago();
        cezar.comer("Maçã");
        cezar.verEstomago();
        cezar.comer("Frango");
        cezar.verEstomago();
        
        prego.comer("uva");
        prego.verEstomago();
        prego.comer("laranja");
        prego.verEstomago();
        prego.comer("pêra");
        prego.verEstomago();
        
        cezar.comer(prego.nome);
        cezar.verEstomago();
        
        
        
    }
}
