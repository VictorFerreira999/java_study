public class Bola{

  private String cor;

  public Bola(String c){
    cor = c;
  }

  public String getCor(){
    return cor;
  }

  public void setCor(String c){
    cor = c;
  }

  public static void main(String[] args) {
    
     Bola b1 = new Bola("Laranja");
     System.out.println(b1.getCor());
     b1.setCor("Verde");
     System.out.println(b1.getCor());
  }
  
}