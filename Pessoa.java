
public class Pessoa {

    private String nome;
    private int idade;
    private double peso, altura;

    public Pessoa(String nome, int idade, double peso, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void engordar(double valor) {
        peso += valor;
    }

    public void emagrecer(double valor) {
        peso -= valor;
    }

    public void crescer(double valor) {
        altura += valor;
    }

    public void envelhecer() {
        idade += 1;
        if (idade < 21) {
            crescer(0.5);
        }
    }

    public static void main(String[] args) {
        Pessoa p = new Pessoa("fulano", 15, 80, 170);
        p.engordar(5);
        System.out.println(p.getPeso());
        p.emagrecer(3);
        System.out.println(p.getPeso());
        p.envelhecer();
        System.out.println(p.getIdade());
        System.out.println(p.getAltura());
    }

}
