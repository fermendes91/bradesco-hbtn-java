import java.io.*;
import java.util.*;

public class Estoque {
    private String nomeArquivo;
    private List<Produto> produtos;

    public Estoque(String nomeArquivo) {
        this.nomeArquivo = nomeArquivo;
        this.produtos = new ArrayList<>();
        carregarArquivo();
    }

    private void carregarArquivo() {
        produtos.clear();
        File arquivo = new File(nomeArquivo);

        if (!arquivo.exists()) return;

        try (BufferedReader leitor = new BufferedReader(new FileReader(arquivo))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                String[] partes = linha.split(",");
                if (partes.length != 4) continue;

                int id = Integer.parseInt(partes[0].trim());
                String nome = partes[1].trim();
                int quantidade = Integer.parseInt(partes[2].trim());
                double preco = Double.parseDouble(partes[3].trim());

                produtos.add(new Produto(id, nome, quantidade, preco));
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Erro ao carregar arquivo: " + e.getMessage());
        }
    }

    private void salvarArquivo() {
        try (BufferedWriter escritor = new BufferedWriter(new FileWriter(nomeArquivo))) {
            for (Produto p : produtos) {
                escritor.write(p.toCsv());
                escritor.newLine();
            }
        } catch (IOException e) {
            System.out.println("Erro ao salvar arquivo: " + e.getMessage());
        }
    }

    public void adicionarProduto(String nome, int quantidade, double preco) {
        int novoId = gerarIdUnico();
        Produto novo = new Produto(novoId, nome, quantidade, preco);
        produtos.add(novo);
        salvarArquivo();
        System.out.println("Produto \"" + nome + "\" adicionado com ID " + novoId);
    }

    private int gerarIdUnico() {
        int maxId = 0;
        for (Produto p : produtos) {
            if (p.getId() > maxId) {
                maxId = p.getId();
            }
        }
        return maxId + 1;
    }

    public void excluirProduto(int id) {
        boolean removido = produtos.removeIf(p -> p.getId() == id);
        if (removido) {
            salvarArquivo();
            System.out.println("Produto com ID " + id + " removido com sucesso.");
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

    public void atualizarQuantidade(int id, int novaQuantidade) {
        boolean atualizado = false;
        for (Produto p : produtos) {
            if (p.getId() == id) {
                p.setQuantidade(novaQuantidade);
                atualizado = true;
                break;
            }
        }

        if (atualizado) {
            salvarArquivo();
            System.out.println("Quantidade do produto ID " + id + " atualizada para " + novaQuantidade + ".");
        } else {
            System.out.println("Produto com ID " + id + " não encontrado.");
        }
    }

    public void exibirEstoque() {
        if (produtos.isEmpty()) {
            System.out.println("Estoque vazio.");
        } else {
            for (Produto p : produtos) {
                System.out.println(p);
            }
        }
    }
}