
import java.util.Arrays;

public class MacacoPremium {
    private String nome;
    private Alimento[] estomago;
    
    public MacacoPremium(String nome){
        this.nome = nome;
        estomago = new Alimento[3];
    }
    
    public void comer(String nome, double kcal){
        Alimento a = new Alimento(nome, kcal);
        boolean cheio = true;
        for (int i = 0; i < estomago.length; i++) {
            if(estomago[i] == null){
                cheio = false;
                estomago[i] = a;
                break;
            }
        } if(cheio){
            System.out.println("Estomago cheio!");
        }
    }
    
    public void verEstomago(){
        System.out.println(Arrays.toString(estomago));
    }
    
    public void digerir(){
        boolean vazio = true;
        for (int i = 0; i < estomago.length; i++) {
            if(estomago[i] != null){
                vazio = false;
                estomago[i] = null;
                break;
            }
        } if (vazio) {
            System.out.println("Estomago vazio!");
        }
    }
    
    public static void main(String[] args) {
        MacacoPremium cezar = new MacacoPremium("cezar");
        cezar.verEstomago();
        cezar.comer("Maçã", 40);
        cezar.verEstomago();
        cezar.comer("Uva", 21);
        cezar.verEstomago();
        cezar.comer("Banana", 60);
        cezar.verEstomago();
        cezar.digerir();
        cezar.verEstomago();
    }
}
