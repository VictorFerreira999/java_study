
public class ContaInvestimento {

    private int nConta;
    private String nome;
    private double saldo, taxaJuros;

    public ContaInvestimento(int nConta, String nome, double saldo, double taxaJuros) {
        this.nConta = nConta;
        this.nome = nome;
        this.saldo = saldo;
        this.taxaJuros = taxaJuros;
    }

    public void adicioneJuros() {
        saldo += saldo * taxaJuros / 100;
    }

    public double getTaxaJuros() {
        return taxaJuros;
    }

    public void setTaxaJuros(double taxaJuros) {
        this.taxaJuros = taxaJuros;
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

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            System.out.println("Tá trollando");
        }
    }

    public void sacar(double valor) {
        if (valor <= saldo && valor > 0) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente");
        }
    }

    public static void main(String[] args) {
        ContaInvestimento c = new ContaInvestimento(197323, "fulano", 1000, 1);
        for (int i = 0; i < 5; i++) {
            c.adicioneJuros();
            System.out.println(String.format("%.2f", c.getSaldo()));
        }
    }
}
