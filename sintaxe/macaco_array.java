
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUNO
 */
public class MacacoPrime {
    private String nome;
    private String[] estomago;
    
    public MacacoPrime(String nome){
        this.nome = nome;
        estomago = new String[3];
    }
    
    public void comer(String alimento){
        boolean cheio = true;
        for (int i = 0; i < estomago.length; i++) {
            if(estomago[i] == null){
                estomago[i] = alimento;
                cheio = false;
                break;
            }
        }
        if(cheio){
            System.out.println("Estomago cheio");
        }
        
    }
    
    public void verEstomago(){
        System.out.println(Arrays.toString(estomago));
    }
    
    public void digerir(){
        boolean vazio = true;
        for (int i = 0; i < estomago.length; i++) {
            if(estomago[i] !=  null){
                estomago[i] = null;
                vazio = false;
                break;
            }
        }
        if(vazio){
            System.out.println("Estomago vazio");
        }
    }
    
    public static void main(String[] args) {
        MacacoPrime kk = new MacacoPrime("King Kong");
        kk.comer("Banana");
        kk.verEstomago();
        kk.comer("Maçã");
        kk.verEstomago();
        kk.comer("Uva");
        kk.verEstomago();
        kk.comer("Pêra");
        kk.digerir();
        kk.verEstomago();
        kk.digerir();
        kk.verEstomago();
        kk.digerir();
        kk.verEstomago();
        kk.digerir();
    }
}
