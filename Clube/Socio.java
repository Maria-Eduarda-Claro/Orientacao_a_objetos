package Clube;

public class Socio {
    private int  id;
    private String Nome;
    private int Idade;
    private int QntDependentes;
    private double valorTitulo;

    public Socio(int id, String nome, int idade, int QntDependentes, double valorTitulo) {
        this.id = id;
        Nome = nome;
        Idade = idade;
        QntDependentes = QntDependentes;
        this.valorTitulo = valorTitulo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int idade) {
        Idade = idade;
    }

    public int getQntDependentes() {
        return QntDependentes;
    }

    public void setQntDependentes(int QntDependentes) {
        QntDependentes = QntDependentes;
    }

    public double getValorTitulo() {
        return valorTitulo;
    }

    public void setValorTitulo(double valorTitulo) {
        this.valorTitulo = valorTitulo;
    }
}
