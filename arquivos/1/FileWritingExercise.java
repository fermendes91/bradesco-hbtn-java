package arquivos.um;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileWritingExercise {

    public static void main(String[] args) {
        String nomeArquivo = "exemplo.txt";

        System.out.println("Conteúdo do arquivo '" + nomeArquivo + "':\n");

        try (BufferedReader leitor = new BufferedReader(new FileReader(nomeArquivo))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }
            System.out.println("\nLeitura do arquivo concluída.");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

}
