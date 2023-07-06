public class SocioPrata extends Socio{
    public SocioPrata(String nome, int idade, int qntdDependentes, double valorPadrao) {
        super(nome, idade, qntdDependentes, valorPadrao);
    }
    public Double calcularValorTitulo() {
        double valor = this.getValorPadrao() + this.calcularPrata();
        return valor;
    }
    public double calcularPrata(){
        double calculo =  (50.00 * super.getQntdDependentes() + 75.00);
        return calculo;
    }
}

