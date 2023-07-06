public abstract class Plano {
    private int codigo;
    private String nome;
    private double valorPadrao;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValorPadrao() {
        return valorPadrao;
    }

    public void setValorPadrao(double valorPadrao) {
        this.valorPadrao = valorPadrao;
    }

    public abstract double calcularMensalidade();
}
