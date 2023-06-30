package Produtos;

// Crie uma classe chamada ProdutoIndustria herdando da classe Produto, adicionar
//atributo ValorIpi e percentualIpi.
public class ProdutoIndustria extends Produto {      // aqui cria o metodo construtor

    private Double percentualIpi; // antes de criar o metodo construtor definir os objetos
    private Double valorIpi;

    public ProdutoIndustria(int codigo, String descricao, Double valor, double percentualIpi) {             //GERADO PELO METODO CONSTRUTOR
        super(codigo, descricao, valor, percentualIpi);
    } // metodo construtor

    public Double getPercentualIpi() {
        return percentualIpi;
    }

    public void setPercentualIpi(Double percentualIpi) {
        this.percentualIpi = percentualIpi;
    }

    public Double getValorIpi() {
        return valorIpi;
    }

    public void setValorIpi(Double valorIpi) {
        this.valorIpi = valorIpi;
    }


    public void CalculoValorIpi(){
       valorIpi = percentualIpi * getValor();
       setValor(getValor() + valorIpi);
    }




}
