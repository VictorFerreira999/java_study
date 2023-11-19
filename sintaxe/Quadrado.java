public class Quadrado{
  private int lado;

  public Quadrado(int lado){
    this.lado = lado;
  }
  public int getLado(){
    return lado;
  }
  public void setLado(int lado){
    this.lado = lado;
  }
  public int calcularArea(){
    return lado * lado;
  }

  public static void main(String[] args) {

    Quadrado q1 = new Quadrado(4);
    System.out.println(q1.getLado());
    System.out.println(q1.calcularArea());
    q1.setLado(3);
    System.out.println(q1.getLado());
    System.out.println(q1.calcularArea());

  }
}