public class ProdutoRevenda extends Produto {

    Double valorIcms;
    Double percentualIems;

    public Double getValorIcms() {
        return valorIcms;
    }

    public void setValorIcms(Double valorIcms) {
        this.valorIcms = valorIcms;
    }

    public Double getPercentualIcms() {
        return percentualIems;
    }

    public void setPercentualIems(Double percentualIems) {
        this.percentualIems = percentualIems;
    }

    public void calcularIcms() {
        this.valorIcms = this.getValor() + this.getPercentualIcms();
        this.setValor(this.getValor() + this.valorIcms);
    }
}
