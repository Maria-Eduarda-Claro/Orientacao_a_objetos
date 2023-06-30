package Produtos;

//Crie uma classe chamada Produto, com os atributos, codigo, descrição, Valor;
public class Produto {            //CLASSE PRINCIPAL

     private int codigo;
     private String descricao;
     private Double valor;

    private double percentualIpi;


    public Produto(int codigo, String descricao, Double valor, double percentualIpi) {           //METODO CONSTRUTOR, CRIA AQUI PRIMEIRO
        this.codigo = codigo;
        this.descricao = descricao;
        this.valor = valor;
        this.percentualIpi = percentualIpi;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public double getPercentualIpi() {
        return percentualIpi;
    }

    public void setPercentualIpi(double percentualIpi) {
        this.percentualIpi = percentualIpi;
    }
}

