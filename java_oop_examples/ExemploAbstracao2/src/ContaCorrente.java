
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
public class ContaCorrente implements Conta{
    
    private double saldo;

    @Override
    public boolean depositar(double valor) {
        if(valor > 0){
            saldo += valor;
            return true;
        }
        return false;
    }

    @Override
    public boolean sacar(double valor) {
        if(valor <= saldo){
            saldo -= valor;
            return true;
        }
        return false;
    }

    @Override
    public String extrato() {
        return "Seu saldo atual é " + saldo;
    }
    
}
