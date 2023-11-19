
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUNO
 */
public class Funcionario {
    private String nome;
    private double salario;
    
    public Funcionario(String nome, double salario){
        this.nome = nome;
        this.salario = salario;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getSalario(){
        return salario;
    }
    
    public void aumentarSalario(double percentualDeAumento){
        salario += salario * percentualDeAumento / 100;
    }
    
    @Override
    public String toString(){
        return "Funcionario{nome="+ nome +", salario="+ salario+"}";
    }
    
    public static void main(String[] args) {
        //Criando uma lista de funcionarios
        List<Funcionario> funcionarios = new ArrayList<>();
        System.out.println("Bem vindo ao sistema de cadastro");
        //repita eternamente
        while (true) {
            System.out.println("Para cadastrar um funcionario digite 1"
                    + "para conceder um aumento digite 2");
            //lendo o que o usuario digitou e salvando na variavel escolha
            int escolha = new Scanner(System.in).nextInt();
            switch (escolha) {
                //caso o usuario escolha cadastrar
                case 1:
                    System.out.println("Digite o nome do funcionario");
                    //salvando o que foi digitado na variavel nome
                    String nome = new Scanner(System.in).nextLine();
                    System.out.println("Digite o salario do funcionario");
                    //salvando o que foi digitado na variavel salario
                    double salario = new Scanner(System.in).nextDouble();
                    //criando um novo objeto do tipo Funcionario
                    Funcionario f1 = new Funcionario(nome, salario);
                    //adicionando o funcionário criado na lista
                    funcionarios.add(f1);
                    System.out.println("Funcionario cadastrado com sucesso");
                    //mostrando a lista de funcionários
                    System.out.println("Funcionarios cadastrados:\n"+funcionarios);
                    break; 
                //caso o usuario escolha conceder um aumento
                case 2:
                    System.out.println("Digite o nome do funcionario");
                    //salvando o que foi digitado na variavel nome
                    nome = new Scanner(System.in).nextLine();
                    boolean achei = false;
                    //percorrendo a lista de funcionarios
                    for(Funcionario f: funcionarios){
                        //comparando o que foi digitado com o nome de cada funcionario
                        if(nome.equals(f.getNome())){
                            //caso encontre um funcionario com esse nome
                            achei = true;
                            System.out.println("Digite o percentual de aumento");
                            //salvando o que foi digitado na variavel aumento
                            double aumento = new Scanner(System.in).nextDouble();
                            //aumentando o salario do funcionario com base no que foi digitado
                            f.aumentarSalario(aumento);
                            System.out.println("Salario aumentado com sucesso");
                            //mostrando o salario do funcionario pós aumento
                            System.out.println("O salario de "+f.getNome()+" é "
                                    + f.getSalario());
                            //encerra a procura pelo funcionário(já foi encontrado)
                            break;
                        }
                      //caso não encontre um funcionario com esse nome
                    } if (!achei){
                        System.out.println("Não existe cadastro para este funcionario");
                    }
                    break;
                //caso digite algo diferente das opções 1 e 2
                default:
                    System.out.println("Opção inválida");
                    break;
            }
        }
    }
}
