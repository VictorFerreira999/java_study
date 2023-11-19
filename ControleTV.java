/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUNO
 */
public class ControleTV {
    private int canal, volume;
    
    public ControleTV(int canal, int volume){
        this.canal = canal;
        this.volume = volume;
    }
    
    public int getCanal(){
        return canal;
    }
    
    public void setCanal(int canal){
        this.canal = canal;
    }
    
    public int getVolume(){
        return volume;
    }
    
    public void aumentarVolume(){
        volume+=1;
    }
    
    public void reduzirVolume(){
        volume-=1;
    }
    
    public static void main(String[] args) {
        ControleTV c = new ControleTV(10, 0);
        c.setCanal(12);
        for (int i = 0; i < 10; i++) {
            c.aumentarVolume();
        }
        c.reduzirVolume();
        System.out.println(c.getCanal());
        System.out.println(c.getVolume());
        
    }
}
