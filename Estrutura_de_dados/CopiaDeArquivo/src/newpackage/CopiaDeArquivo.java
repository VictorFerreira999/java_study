import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopiaDeArquivo {
    public static void main(String[] args) {
        // Caminho do arquivo de origem
        String caminhoOrigem = "Caminho/Para/source.txt";

        // Caminho do arquivo de destino
        String caminhoDestino = "Caminho/Para/destination.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(caminhoOrigem));
             BufferedWriter writer = new BufferedWriter(new FileWriter(caminhoDestino))) {

            String linha;
            // Ler cada linha do arquivo de origem
            while ((linha = reader.readLine()) != null) {
                // Escrever a linha no arquivo de destino
                writer.write(linha);
                // Adicionar uma quebra de linha para manter o formato original
                writer.newLine();
            }

            System.out.println("Cópia concluída com sucesso!");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
