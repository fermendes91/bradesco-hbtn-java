import java.util.Comparator;
import java.util.List;

public class Consulta {
    public static Produto obterProdutoMaiorPreco(List<Produto> produtos) {
        return produtos.stream()
                       .max(Comparator.comparing(Produto::getPreco))
                       .orElse(null);
    }
}
