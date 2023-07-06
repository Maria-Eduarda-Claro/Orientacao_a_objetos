public class Socio {
    private String nome;
    private int idade;
    private int qntdDependentes;
    private double valorPadrao;

    public Socio(String nome, int idade, int qntdDependentes, double valorPadrao) {
        this.nome = nome;
        this.idade = idade;
        this.qntdDependentes = qntdDependentes;
        this.valorPadrao = valorPadrao;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getQntdDependentes() {
        return qntdDependentes;
    }

    public void setQntdDependentes(int qntdDependentes) {
        this.qntdDependentes = qntdDependentes;
    }
    public Double getValorPadrao() {
        return valorPadrao;
    }
    public void setValorPadrao(Double valorPadrao) {
        this.valorPadrao = valorPadrao;
    }
}
