package Clube;

public class SocioOuro extends Socio {

    public SocioOuro(int Id, String Nome, int Idade, int QntDependentes, double valorTitulo) {
        super(Id, Nome,  Idade, QntDependentes, valorTitulo);
    }

    public Double CalcularValorTitulo(){
        Double valorTitulo = this.getValorTitulo() + CalcularOuro();
        return valorTitulo;
    }

    private Double CalcularOuro(){
        Double valorOuro = 100.00 * this.getQntDependentes() + 100.00;

        return valorOuro;
    }


}
