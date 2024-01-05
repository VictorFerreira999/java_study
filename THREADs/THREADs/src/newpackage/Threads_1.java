/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package newpackage;

/**
 *
 * @author victo
 */
public class Threads_1 {
    
    public static void main(String[] args){
        //Thread atual
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
        
        //Nova thread
        MeuRunnable meuRunnable = new MeuRunnable();
        
        Thread t1 = new Thread(meuRunnable);
        t1.start();  
        
        //Runnable como lambda
        Thread t2 = new Thread(() -> System.out.println(Thread.currentThread().getName()));
        t2.start();
        
        //varias threads
        Thread t3 = new Thread(new MeuRunnable());
        t3.start();
    }
    
}
