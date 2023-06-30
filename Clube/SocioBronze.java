package Clube;

public class SocioBronze extends Socio{
    public SocioBronze(int Id, String Nome, int Idade, int QntDependentes, double valorTitulo) {
        super(Id, Nome, Idade, QntDependentes, valorTitulo);
    }

    public Double CalcularValorTitulo(){
        Double valorTitulo = this.getValorTitulo() + CalcularBronze();
        return valorTitulo;
    }
    public Double CalcularBronze(){
        Double valorTitulo = 25.00 * this.getQntDependentes() + 55.00;
        return valorTitulo;
    }

}
