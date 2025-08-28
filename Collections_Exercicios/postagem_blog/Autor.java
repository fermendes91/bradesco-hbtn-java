public class Autor implements Comparable<Autor> {
    private String nome;
    private String sobrenome;

    public Autor(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    public String getNomeCompleto() {
        return nome + " " + sobrenome;
    }

    @Override
    public String toString() {
        return getNomeCompleto();
    }

    @Override
    public int compareTo(Autor outro) {
        return this.getNomeCompleto().compareTo(outro.getNomeCompleto());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Autor)) return false;
        Autor outro = (Autor) obj;
        return this.getNomeCompleto().equals(outro.getNomeCompleto());
    }

    @Override
    public int hashCode() {
        return getNomeCompleto().hashCode();
    }
}