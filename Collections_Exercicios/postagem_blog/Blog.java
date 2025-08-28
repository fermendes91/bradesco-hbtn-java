import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Blog {
    private List<Post> posts;

    public Blog() {
        this.posts = new ArrayList<>();
    }

    public void adicionarPostagem(Post post) {
        for (Post existente : posts) {
            if (existente.equals(post)) {
                throw new RuntimeException("Postagem jah existente");
            }
        }
        posts.add(post);
    }

    public Set<Autor> obterTodosAutores() {
        Set<Autor> autores = new TreeSet<>();
        for (Post post : posts) {
            autores.add(post.getAutor());
        }
        return autores;
    }

    public Map<Categorias, Integer> obterContagemPorCategoria() {
        Map<Categorias, Integer> contagem = new TreeMap<>();
        for (Post post : posts) {
            Categorias cat = post.getCategoria();
            contagem.put(cat, contagem.getOrDefault(cat, 0) + 1);
        }
        return contagem;
    }

    public Set<Post> obterPostsPorCategoria(Categorias categoria) {
        Set<Post> resultado = new TreeSet<>();
        for (Post post : posts) {
            if (post.getCategoria() == categoria) {
                resultado.add(post);
            }
        }
        return resultado;
    }

    public Set<Post> obterPostsPorAutor(Autor autor) {
        Set<Post> resultado = new TreeSet<>();
        for (Post post : posts) {
            if (post.getAutor().equals(autor)) {
                resultado.add(post);
            }
        }
        return resultado;
    }

    public Map<Categorias, Set<Post>> obterTodosPostsPorCategorias() {
        Map<Categorias, Set<Post>> mapa = new TreeMap<>();
        for (Post post : posts) {
            mapa.putIfAbsent(post.getCategoria(), new TreeSet<>());
            mapa.get(post.getCategoria()).add(post);
        }
        return mapa;
    }

    public Map<Autor, Set<Post>> obterTodosPostsPorAutor() {
        Map<Autor, Set<Post>> mapa = new TreeMap<>();
        for (Post post : posts) {
            mapa.putIfAbsent(post.getAutor(), new TreeSet<>());
            mapa.get(post.getAutor()).add(post);
        }
        return mapa;
    }
}