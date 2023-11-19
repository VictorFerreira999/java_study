
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUNO
 */
public class Lista {
    public static void main(String[] args) {
        // Criando duas ArrayLists de String para armazenar pessoas.
        List<String> pessoas = new ArrayList<>();
        List<String> pessoas2 = new ArrayList<>();

        // Adicionando elementos à primeira lista.
        pessoas.add("João");
        pessoas.add("Pedro");
        System.out.println(pessoas);

        // Adicionando "Kalel" na posição 0 da lista.
        pessoas.add(0, "Kalel");
        System.out.println(pessoas);

        // Adicionando elementos à segunda lista.
        pessoas2.add("Fulano");
        pessoas2.add("Beltrano");

        // Adicionando todos os elementos da segunda lista à primeira.
        pessoas.addAll(pessoas2);
        System.out.println(pessoas);

        // Adicionando todos os elementos da segunda lista na posição 0 da primeira.
        pessoas.addAll(0, pessoas2);
        System.out.println(pessoas);

        // Verificando se a lista contém o elemento "Kalel".
        System.out.println(pessoas.contains("Kalel"));

        // Obtendo o elemento na posição 3 da lista.
        System.out.println(pessoas.get(3));

        // Obtendo o índice da primeira ocorrência de "Fulano".
        System.out.println(pessoas.indexOf("Fulano"));

        // Obtendo o índice da última ocorrência de "Fulano".
        System.out.println(pessoas.lastIndexOf("Fulano"));

        // Substituindo o elemento na posição 3 por "Louise".
        pessoas.set(3, "Louise");
        System.out.println(pessoas);

        // Obtendo o tamanho da lista.
        System.out.println(pessoas.size());

        // Limpando a segunda lista.
        pessoas2.clear();
        System.out.println(pessoas2);

        // Criando uma sublista da primeira lista que vai da posição 2 (inclusive) à 5 (exclusiva).
        pessoas2 = pessoas.subList(2, 5);
        System.out.println(pessoas2);

        // Convertendo a lista em um array de objetos.
        Object[] pessoas3 = pessoas.toArray();
        System.out.println(Arrays.toString(pessoas3));

        // Criando uma lista de objetos Animal e adicionando elementos.
        List<Animal> animais = new ArrayList<>();
        Animal a = new Animal("Leonardo", "Tartaruga");
        animais.add(new Animal("Rex", "Cachorro"));
        animais.add(new Animal("Yummi", "Gato"));
        animais.add(a);
        System.out.println(animais);

        // Removendo o objeto "a" da lista de animais.
        animais.remove(a);
        System.out.println(animais);

        // Imprimindo a lista de pessoas e removendo o elemento na posição 1.
        System.out.println(pessoas);
        pessoas.remove(1);
        System.out.println(pessoas);

        // Criando uma nova lista de pessoas (pessoas4) como sublista da lista original.
        List<String> pessoas4 = new ArrayList<>();
        pessoas4 = pessoas.subList(2, 5);
        System.out.println(pessoas4);

        // Removendo todos os elementos de pessoas que estão na lista pessoas4.
        pessoas.removeAll(pessoas4);
        System.out.println(pessoas);

        // Limpando a lista pessoas.
        pessoas.clear();
        System.out.println(pessoas.isEmpty());

        // Verificando se o array pessoas3 tem tamanho zero.
        System.out.println(pessoas3.length == 0); 
    }
}