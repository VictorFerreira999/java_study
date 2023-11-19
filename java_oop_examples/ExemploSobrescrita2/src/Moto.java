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
    public void acelerar(){
        System.out.println("randamdam");
    }
      
    public static void main(String[] args) {
        Veiculo v = new Veiculo("fiat", "palio", 2002);
        v.acelerar();
        Moto m = new Moto("honda", "pcx", 2018);
        m.acelerar();
    }
}
