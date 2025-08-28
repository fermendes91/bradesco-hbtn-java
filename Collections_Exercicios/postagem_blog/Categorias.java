public enum Categorias {
    DEVOPS("DevOps"),
    DESENVOLVIMENTO("Desenvolvimento"),
    DATA_SCIENCE("Data Science");

    private String descricao;

    Categorias(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return name();
    }
}
