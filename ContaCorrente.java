
import java.util.*;

public class ContaCorrente {
    private int nConta;
    private String nome;
    private double saldo;

    public ContaCorrente(int nConta, String nome) {
        this.nConta = nConta;
        this.nome = nome;
        this.saldo = 0;
    }

    public int getnConta() {
        return nConta;
    }

    public void setnConta(int nConta) {
        this.nConta = nConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaCorrente{" + "nConta=" + nConta + ", nome=" + nome + ", saldo=" + saldo + '}';
    }
    
    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
        } else {
            System.out.println("Tá trollando");
        }
    }
    
    public void sacar(double valor){
        if(valor <= saldo && valor > 0){
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
    
    public static void main(String[] args) {
        List<ContaCorrente> banco = new ArrayList<>();
        while(true){
            System.out.println("Digite 1 para criar uma conta"
                    + "\nDigite 2 para logar em sua conta"
                    + "\nDigite qualquer coisa para sair");
            int escolha = new Scanner(System.in).nextInt();
            if(escolha == 1){
                System.out.println("Digite seu nome completo");
                String nome = new Scanner(System.in).nextLine();
                int nConta = new Random().nextInt(1000000);
                ContaCorrente c = new ContaCorrente(nConta, nome);
                banco.add(c);
                System.out.println("Conta criada com sucesso, "
                        + "o numero da sua conta é: "+c.getnConta());
            } else if(escolha == 2){
                System.out.println("Digite seu nome completo"
                        + " e o número da conta");
                String nome = new Scanner(System.in).nextLine();
                int nConta = new Scanner(System.in).nextInt();
                for(ContaCorrente c1: banco){
                    if(c1.getNome().equals(nome) &&
                            c1.getnConta() == nConta) {
                        System.out.println("Login efetuado");
                        while(true){
                            System.out.println("Digite 1 para depositar"
                                    + "\nDigite 2 para sacar"
                                    + "\nDigite qualquer coisa para deslogar");
                            escolha = new Scanner(System.in).nextInt();
                            if(escolha == 1){
                                System.out.println("Digite a quantia");
                                double valor = new Scanner(System.in).nextDouble();
                                c1.depositar(valor);
                            } else if (escolha == 2){
                                System.out.println("Digite a quantia");
                                double valor = new Scanner(System.in).nextDouble();
                                c1.sacar(valor);
                            } else {
                                break;
                            }
                        }
                    }
                }
            } else {
                System.out.println("Encerrando o app...");
                break;
            }
        }
    }
}
