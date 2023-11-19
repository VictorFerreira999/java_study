/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUNO
 */
public class Moto extends Veiculo{

    public Moto(String marca, String modelo, int ano) {
        super(marca, modelo, ano);
    }

    @Override
    public void acelerar(String qtd) {
        System.out.println("Dei dois toquinhos e acelerei "+qtd);
    }
    
}
