package arquivos._0;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingExercise {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do arquivo (com extensão .txt): ");
        String fileName = scanner.nextLine();

        try (FileWriter escritor = new FileWriter(fileName)) {
            System.out.println("Digite linhas de texto. Para encerrar, digite \"sair\".");

            while (true) {
                String linha = scanner.nextLine();
                if (linha.equalsIgnoreCase("sair")) {
                    break;
                }
                escritor.write(linha + System.lineSeparator());
            }

            System.out.println("Arquivo \"" + fileName + "\" criado com sucesso!");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar o arquivo: " + e.getMessage());
        }

        scanner.close();
    }

}
