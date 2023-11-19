/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exemplos01;

import java.util.Scanner;

/**
 *
 * @author ALUNO
 */
public class Retangulo {
    private int base, altura;
    
    public Retangulo(int base, int altura){
        this.base = base;
        this.altura = altura;
    }
    
    public int getBase(){
        return base;
    }
    
    public void setBase(int base){
        this.base = base;
    }
    
    public int getAltura(){
        return altura;
    }
    
    public void setAltura(int altura){
        this.altura = altura;
    }
    
    public int calcularArea(){
        return base * altura;
    }
    
    public int calcularPerimetro(){
        return 2*(base+altura);
    }
    
    public static void main(String[] args) {
        System.out.println("Digite"
                + "a base e a altura "
                + "do retangulo que será "
                + "criado");
        int b = new Scanner(System.in).nextInt();
        int a = new Scanner(System.in).nextInt();
        Retangulo r = new Retangulo(b, a);
        System.out.println("A area do retangulo é"
                + r.calcularArea());
        System.out.println("O perimetro do "
                + "retangulo é"
                + r.calcularPerimetro());
        while(true){
            System.out.println("Deseja trocar "
                    + "algum dos valores?");
            String re = new Scanner(System.in).nextLine();
            re = re.toUpperCase();
            if(re.equals("S")){
                System.out.println("Digite"
                + "a base e a altura "
                + "do retangulo");
                b = new Scanner(System.in).nextInt();
                a = new Scanner(System.in).nextInt();
                r.setBase(b);
                r.setAltura(a);
                System.out.println("A area do retangulo é"
                + r.calcularArea());
                System.out.println("O perimetro do "
                + "retangulo é"
                + r.calcularPerimetro());
            } else {
                break;
            }
            
        }
    }
    
}
