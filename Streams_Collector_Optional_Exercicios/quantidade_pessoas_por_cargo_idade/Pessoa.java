public class Pessoa implements Comparable<Pessoa> {
    private int codigo;
    private String nome;
    private String cargo;
    private int idade;
    private double salario;

    public Pessoa(int codigo, String nome, String cargo, int idade, double salario) {
        this.codigo = codigo;
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNome() {
        return nome;
    }

    public String getCargo() {
        return cargo;
    }

    public int getIdade() {
        return idade;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public String toString() {
        // formato exigido: 6 casas decimais e vírgula como separador
        return String.format("[%d] %s %s %d R$ %.6f",
                codigo, nome, cargo, idade, salario).replace('.', ',');
    }

    @Override
    public int compareTo(Pessoa outra) {
        int cmp = this.nome.compareTo(outra.nome);
        if (cmp == 0) {
            return Integer.compare(this.codigo, outra.codigo);
        }
        return cmp;
    }
}