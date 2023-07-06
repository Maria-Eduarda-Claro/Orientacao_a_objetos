public class SocioOuro extends Socio{

    public SocioOuro(String nome, int idade, int qntdDependentes, double valorPadrao) {
        super(nome, idade, qntdDependentes, valorPadrao);
    }
    public Double calcularValorTitulo() {
        double valor = this.getValorPadrao() + this.calcularOuro();
        return valor;
    }
    public double calcularOuro(){
        double calculo =  (100.00 * super.getQntdDependentes() + 100.00);
        return calculo;
    }
}
