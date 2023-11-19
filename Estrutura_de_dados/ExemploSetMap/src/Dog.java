
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUNO
 */
public class Dog {
    private int idade;

    public Dog(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Dog{" + "idade=" + idade + '}';
    }
    
    public static void main(String[] args) {
        //Set<Dog> dogs = new HashSet<>();
        //Set<Integer> dogs = new TreeSet<>();
        Set<Dog> dogs = new LinkedHashSet<>();
        //dogs.add(2);
        //dogs.add(1);
        //dogs.add(3);
        //dogs.add(5);
        //dogs.add(4);
        //for (Integer dog : dogs) {
            //System.out.println(dog);
        //}
        dogs.add(new Dog(2));
        dogs.add(new Dog(1));
        dogs.add(new Dog(3));
        dogs.add(new Dog(5));
        dogs.add(new Dog(4));
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
    }
}
