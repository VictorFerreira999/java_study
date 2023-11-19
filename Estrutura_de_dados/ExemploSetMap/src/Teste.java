
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ALUNO
 */
public class Teste {
    public static void main(String[] args) {
        //Map<String, String> pessoas = new HashMap<>();
        //Map<String, String> pessoas = new TreeMap<>();
        Map<String, String> pessoas = new LinkedHashMap<>();
        pessoas.put("64381298623", "fulano");
        pessoas.put("95788322345", "ciclano");
        pessoas.put("23874243242", "beltrano");
        System.out.println(pessoas.keySet());
        System.out.println(pessoas.values());
    }
}
