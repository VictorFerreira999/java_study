public class Cafe{

  private String tamanho;
  private int preco;

  public Cafe(String t, int p){
    tamanho = t;
    preco = p;
  }

  public int darTroco(int cupom){
    int troco = cupom - preco;
    return troco;
  }

  public int vender(int cupom){
    if(cupom >= preco){
      System.out.println("Você pode pagar pelo café "+ tamanho);
      if(cupom == preco){
        System.out.println("Compra concluida");
        cupom = 0;
      } else {
        cupom = darTroco(cupom);
        System.out.println("Seu troco é: "+ cupom);
      }
    }
    return cupom;
  }

  public static void main(String[] args) {
    Cafe c0 = new Cafe("menorzin", 1);
    Cafe c1 = new Cafe("pequeno", 2);
    Cafe c2 = new Cafe("médio", 5);
    Cafe c3 = new Cafe("grande", 6);
    Cafe c4 = new Cafe("extra grande", 8);

    System.out.println("Digite o valor do seu cupom");
    Scanner scan = new Scanner(System.in);
    int cupom = scan.nextInt();

    Cafe cafes[] = {c4, c3, c2, c1, c0};
    for(int i = 0; i < cafes.length; i++){
      cupom = cafes[i].vender(cupom);
    }
  }
  
}