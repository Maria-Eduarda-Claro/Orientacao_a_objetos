public class ProdutoIndustria extends Produto{

    Double valorIpi;
    Double percentualIpi;

    public Double getValorIpi() {
        return valorIpi;
    }

    public void setValorIpi(Double valorIpi) {
        this.valorIpi = valorIpi;
    }

    public Double getPercentualIpi() {
        return percentualIpi;
    }

    public void setPercentualIpi(Double percentualIpi) {
        this.percentualIpi = percentualIpi;
    }

    public void calcularIpi() {
        this.valorIpi = this.getValor() + this.getPercentualIpi();
        this.setValor(this.getValor() + this.valorIpi);
    }

}
