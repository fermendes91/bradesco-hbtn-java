import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingExercise {

    public static void main(String[] args) {
        String fileName = "exemplo.txt";

        System.out.println("Conteúdo do arquivo '" + fileName + "':\n");

        try (BufferedReader leitor = new BufferedReader(new FileReader(fileName))) {
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
