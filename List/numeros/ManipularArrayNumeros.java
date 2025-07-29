import java.util.List;

public class ManipularArrayNumeros {

    public static int buscarPosicaoNumero(List<Integer> lista, int numero) {
        return lista.indexOf(numero);
    }

    public static void adicionarNumero(List<Integer> lista, int numero) throws Exception {
        int posicao = buscarPosicaoNumero(lista, numero);
        if (posicao != -1) {
            throw new Exception("Numero jah contido na lista");
        }
        lista.add(numero);
    }

    public static void removerNumero(List<Integer> lista, int numero) throws Exception {
        int posicao = buscarPosicaoNumero(lista, numero);
        if (posicao == -1) {
            throw new Exception("Numero nao encontrado na lista");
        }
        lista.remove(posicao);
    }

    public static void substituirNumero(List<Integer> lista, int numeroSubstituir, int numeroSubstituto) {
        int posicao = buscarPosicaoNumero(lista, numeroSubstituir);
        if (posicao != -1) {
            lista.set(posicao, numeroSubstituto);
        } else {
            lista.add(numeroSubstituto);
        }
    }
}
