public class SocioBronzePrata extends Socio {
    public SocioBronzePrata(String nome, int idade, int qntdDependentes, double valorPadrao) {
        super(nome, idade, qntdDependentes, valorPadrao);
    }
    public Double calcularValorTitulo() {
        double valor = this.getValorPadrao() + this.calcularBronzePrata();
        return valor;
    }
    public double calcularBronzePrata(){
        double calculo =  (25.00 * super.getQntdDependentes() + 55.00);
        return calculo;
    }
}


