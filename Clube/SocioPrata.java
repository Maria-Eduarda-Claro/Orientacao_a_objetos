package Clube;

public class SocioPrata extends Socio{
    public SocioPrata(int Id, String Nome, int Idade, int QntDependentes, double valorTitulo) {
        super(Id, Nome, Idade, QntDependentes, valorTitulo);
    }

    public Double CalcularValorTitulo(){
        Double valorTitulo = this.getValorTitulo() + CalcularPrata();
        return valorTitulo;
    }
    public Double CalcularPrata(){
        Double valorTitulo = 50.00 * this.getQntDependentes() + 75.00;
        return valorTitulo;
    }

}
