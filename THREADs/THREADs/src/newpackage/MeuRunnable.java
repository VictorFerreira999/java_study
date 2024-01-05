/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author victo
 */
public class MeuRunnable implements Runnable {
    
    @Override
    public void run(){
        String name = Thread.currentThread().getName();
        System.out.println(name);        
    }
    
}
