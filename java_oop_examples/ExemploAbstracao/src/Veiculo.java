
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUNO
 */
public abstract class Veiculo {
    protected String marca, modelo;
    protected int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    
    public int medirVelocidade(int deslocamento, int tempo){
        return deslocamento/tempo;
    }
    
    public abstract void acelerar(String qtd);
    
}
