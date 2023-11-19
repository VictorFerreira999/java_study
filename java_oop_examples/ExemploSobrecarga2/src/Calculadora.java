/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUNO
 */
public class Calculadora {

    public Calculadora() {
    }
    
    public double calcula(int a, int b){
        return a+b;
    }
    
    public double calcula(double a, double b){
        return a+b;
    }
    
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        c.calcula(5.4, 4);
    }
}
