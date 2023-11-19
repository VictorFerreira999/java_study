package Exemplos01;

import java.util.Scanner;

public class Quadrado {

    private int lado;

    public Quadrado(int lado) {
        this.lado = lado;
    }

    public int getLado() {
        return lado;
    }

    public void setLado(int lado) {
        this.lado = lado;
    }

    public int calcularArea() {
        return lado * lado;
    }

    public static void main(String[] args) {
        System.out.println("Digite o tamanho dos lados");
        int tamanho = new Scanner(System.in).nextInt();
        Quadrado q = new Quadrado(tamanho);
        System.out.println("O objeto foi criado "
                + "com o tamanho: " + q.getLado());
        System.out.println("A area do quadrado é: "
                + q.calcularArea());
        while (true) {
            System.out.println("Deseja alterar o tamanho?");
            String resposta = new Scanner(System.in).nextLine().toUpperCase();
            if (resposta.equals("Y")) {
                System.out.println("Digite o tamanho dos lados");
                tamanho = new Scanner(System.in).nextInt();
                q.setLado(tamanho);
                System.out.println("O tamanho dos lados agora é: "
                        + q.getLado());
                System.out.println("A area do quadrado é: "
                        + q.calcularArea());
            } else {
                break;
            }
        }
    }
}
