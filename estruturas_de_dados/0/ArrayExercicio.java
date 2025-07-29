import java.util.Scanner;

public class ArrayExercicio {
	
	   public static void main(String[] args) {
	        // Criando o scanner para entrada de dados
	        Scanner scanner = new Scanner(System.in);

	        // Definindo o tamanho do array
	        int tamanhoArray = 10;
	        int[] numeros = new int[tamanhoArray];
	        int soma = 0;
	        int maiorNumero = Integer.MIN_VALUE;

	        // Preenchendo o array com números fornecidos pelo usuário
	        // Utilize scanner.nextInt(); para receber o numero digitado
	        System.out.println("Digite 10 números inteiros:");
	        
	        String conteudoArray = new String();
	        Integer somaArray = 0;
	        Integer maiorValor = 0;
	        for(int i = 0; i < tamanhoArray; i++) {
	        	System.out.print("Digite o número " + (i+1) + ": ");
	        	int opcao = scanner.nextInt();
	        	conteudoArray = conteudoArray.isEmpty() ? String.valueOf(opcao) : conteudoArray.concat(" " + opcao);
	        	somaArray += opcao;
	        	if (opcao > maiorValor) {
	        	    maiorValor = opcao;
	        	}
	        	numeros[i] = opcao;
	        }

	        // Exibindo os resultados
	        System.out.println("Contéudo do array:\n" + conteudoArray);
	        System.out.println("Soma de todos os números: " + somaArray);
	        System.out.print("Maior número no array: " + maiorValor);

	        // Fechando o scanner
	        scanner.close();
	    }

}
