import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CsvFileReader {

    public static void main(String[] args) {
        String fileName = "funcionarios.csv";
         
        try (BufferedReader leitor = new BufferedReader(new FileReader(fileName))) {
            String linha;
            boolean primeiraLinha = true;

            while ((linha = leitor.readLine()) != null) {
                if (linha.trim().isEmpty()) continue;

                String[] dados = linha.split(",");

                if (primeiraLinha) {
                    System.out.println("Funcionário: " + dados[0]);
                    System.out.println("Idade: " + dados[1]);
                    System.out.println("Departamento: " + dados[2]);
                    System.out.println("Salarial: " + dados[3]);
                    System.out.println("------------------------");
                    primeiraLinha = false;
                } else {
                    System.out.println("Funcionário: " + dados[0]);
                    System.out.println("Idade: " + dados[1]);
                    System.out.println("Departamento: " + dados[2]);
                    System.out.println("Salarial: " + dados[3]);
                    System.out.println("------------------------");
                }
            }

            System.out.println("Leitura do arquivo concluída.");
        } catch (IOException e) {
            System.out.println("Erro ao ler o arquivo: " + e.getMessage());
        }
    }

}
