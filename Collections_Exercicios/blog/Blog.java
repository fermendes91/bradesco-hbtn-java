import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Blog {
	
	private List<Post> posts = new ArrayList<>();

	public List<Post> getPosts() {
		return posts;
	}

	public void setPosts(List<Post> posts) {
		this.posts = posts;
	}
	
	public void adicionarPostagem(Post post) {
		posts.add(post);
	}
	
    public Set<String> obterTodosAutores() {
        Set<String> autores = new TreeSet<>();
        for (Post post : posts) {
            autores.add(post.getAutor());
        }
        return autores;
    }
    
    public Map<String, Integer> obterContagemPorCategoria() {
        Map<String, Integer> contagem = new TreeMap<>();

        for (Post post : posts) {
            String categoria = post.getCategoria();
            contagem.put(categoria, contagem.getOrDefault(categoria, 0) + 1);
        }

        return contagem;
    }



}
