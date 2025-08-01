import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Contato {
    private List<String> telefones;
    private Set<String> emails;


    // Construtor
    public Contato() {
        telefones = new ArrayList<>();
        emails = new HashSet<>();
    }


    // Adiciona um telefone
    public void adicionarTelefone(String telefone) {
        telefones.add(telefone);
    }


    // Adiciona um email
    public boolean adicionarEmail(String email) {
        if (!emails.contains(email)) {
            emails.add(email);
            return true;  // Email adicionado com sucesso
        }
        return false;  // Email duplicado
    }


    // Exibe os detalhes do contato
    public void exibirContato() {
        System.out.println("Telefones: " + telefones);
        System.out.println("Emails: " + emails);
    }


    // Verifica se o contato tem algum telefone
    public List<String> getTelefones() {
        return telefones;
    }


    // Verifica se o contato tem algum email
    public Set<String> getEmails() {
        return emails;
    }
}
