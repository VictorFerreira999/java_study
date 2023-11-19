/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUNO
 */
public interface Conta {
    
    public boolean depositar(double valor);
    
    public boolean sacar(double valor);
    
    public String extrato();
    
}
