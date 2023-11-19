/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista.Model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ALUNO
 */
public class GerenciadorDeProdutos {
    List<Produto> produtos;
    
    public GerenciadorDeProdutos(){
        produtos = new ArrayList<>();
    }
    
    public void addProduto(Produto p){
        File dir = new File("C:\\Users\\aluno\\Documents\\NetBeansProjects\\Aplicacoes");
        //Cria um novo arquivo
        File arq = new File(dir, "Estoque.txt");
        try {
            
            FileReader fileReader = new FileReader(arq);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = "";

            //Lista que irá guardar o resultado, ou seja,
            // cada linha do arquivo que corresponde a um User
            List <String> result = new ArrayList();

            while ((linha = bufferedReader.readLine()) != null) {
                if (linha != null && !linha.isEmpty()) {
                    result.add(linha);
                }
            }
            fileReader.close();
            bufferedReader.close();
            produtos.clear();
            for (String s : result) {
                //Usamos o método split da classe String
                // para separar as partes entre os ponto e vírgulas.
                //Guardamos o resultado em um array
                String[] user = s.split(";");

                //Criamos um objeto User e setamos em seus atributos
                //as posições correspondentes do array
                Produto u = new Produto(user[0], user[1], Double.parseDouble(user[2]));
                
                produtos.add(u);
              
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        produtos.add(p);
        
        try {
            arq.createNewFile();
            FileWriter fileWriter = new FileWriter(arq, false);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            //Utilizamos o método print() para escrever na
            // mesma linha e um ponto e vírgula no final.
            //O println forçará a troca de linha
            // para o próximo user.
            for (Produto user : produtos) {
                printWriter.print(user.getDescricao()+ ";");
                printWriter.print(user.getMarca()+ ";");
                printWriter.println(user.getPreco());
            }
            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public Produto consultaProduto(String desc, String marca){
        
        File dir = new File("C:\\Users\\aluno\\Documents\\NetBeansProjects\\Aplicacoes");
        //Cria um novo arquivo
        File arq = new File(dir, "Estoque.txt");
        try {
            
            FileReader fileReader = new FileReader(arq);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = "";

            //Lista que irá guardar o resultado, ou seja,
            // cada linha do arquivo que corresponde a um User
            List <String> result = new ArrayList();

            while ((linha = bufferedReader.readLine()) != null) {
                if (linha != null && !linha.isEmpty()) {
                    result.add(linha);
                }
            }
            fileReader.close();
            bufferedReader.close();
            produtos.clear();
            for (String s : result) {
                //Usamos o método split da classe String
                // para separar as partes entre os ponto e vírgulas.
                //Guardamos o resultado em um array
                String[] user = s.split(";");

                //Criamos um objeto User e setamos em seus atributos
                //as posições correspondentes do array
                Produto u = new Produto(user[0], user[1], Double.parseDouble(user[2]));
                produtos.add(u);

                //exibe o conteúdo do objeto u
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Produto atual;
        //for(Produto atual: produtos){
        for (int i = 0; i < produtos.size(); i++) {
            atual = produtos.get(i);
            if(atual.getDescricao().equals(desc) && 
                    atual.getMarca().equals(marca)){
                return atual;
            }
        }
        
        return null;
    }
    
    public boolean removeProduto(String desc, String marca){
        File dir = new File("C:\\Users\\aluno\\Documents\\NetBeansProjects\\Aplicacoes");
        //Cria um novo arquivo
        File arq = new File(dir, "Estoque.txt");
        try {
            
            FileReader fileReader = new FileReader(arq);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = "";

            //Lista que irá guardar o resultado, ou seja,
            // cada linha do arquivo que corresponde a um User
            List <String> result = new ArrayList();

            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
                if (linha != null && !linha.isEmpty()) {
                    result.add(linha);
                }
            }
            fileReader.close();
            bufferedReader.close();
            produtos.clear();
            for (String s : result) {
                //Usamos o método split da classe String
                // para separar as partes entre os ponto e vírgulas.
                //Guardamos o resultado em um array
                String[] user = s.split(";");

                //Criamos um objeto User e setamos em seus atributos
                //as posições correspondentes do array
                Produto u = new Produto(user[0], user[1], Double.parseDouble(user[2]));
                produtos.add(u);

                //exibe o conteúdo do objeto u
                System.out.println(u.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Produto saindo = consultaProduto(desc, marca);
        if(saindo == null){
            return false;
        } else {
            produtos.remove(saindo);
            try {
            arq.createNewFile();
            FileWriter fileWriter = new FileWriter(arq, false);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            //Utilizamos o método print() para escrever na
            // mesma linha e um ponto e vírgula no final.
            //O println forçará a troca de linha
            // para o próximo user.
            for (Produto user : produtos) {
                printWriter.print(user.getDescricao()+ ";");
                printWriter.print(user.getMarca()+ ";");
                printWriter.println(user.getPreco());
            }
            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
            return true;
        }
    }
    
    public boolean atualizaProduto(String desc, String marca,
            String nDesc, String nMarca, Double nPreco){
        File dir = new File("C:\\Users\\aluno\\Documents\\NetBeansProjects\\Aplicacoes");
        //Cria um novo arquivo
        File arq = new File(dir, "Estoque.txt");
        try {
            
            FileReader fileReader = new FileReader(arq);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String linha = "";

            //Lista que irá guardar o resultado, ou seja,
            // cada linha do arquivo que corresponde a um User
            List <String> result = new ArrayList();

            while ((linha = bufferedReader.readLine()) != null) {
                System.out.println(linha);
                if (linha != null && !linha.isEmpty()) {
                    result.add(linha);
                }
            }
            fileReader.close();
            bufferedReader.close();
            produtos.clear();
            for (String s : result) {
                //Usamos o método split da classe String
                // para separar as partes entre os ponto e vírgulas.
                //Guardamos o resultado em um array
                String[] user = s.split(";");

                //Criamos um objeto User e setamos em seus atributos
                //as posições correspondentes do array
                Produto u = new Produto(user[0], user[1], Double.parseDouble(user[2]));
                produtos.add(u);

                //exibe o conteúdo do objeto u
                System.out.println(u.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Produto att = consultaProduto(desc, marca);
        if(att == null){
            return false;
        } else {
            int index = produtos.indexOf(att);
            
            produtos.get(index).setDescricao(nDesc);
            produtos.get(index).setMarca(nMarca);
            produtos.get(index).setPreco(nPreco);
            try {
            arq.createNewFile();
            FileWriter fileWriter = new FileWriter(arq, false);
            PrintWriter printWriter = new PrintWriter(fileWriter);
            //Utilizamos o método print() para escrever na
            // mesma linha e um ponto e vírgula no final.
            //O println forçará a troca de linha
            // para o próximo user.
            for (Produto user : produtos) {
                printWriter.print(user.getDescricao()+ ";");
                printWriter.print(user.getMarca()+ ";");
                printWriter.println(user.getPreco());
            }
            printWriter.flush();
            printWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
            return true;
        }
    }
}
