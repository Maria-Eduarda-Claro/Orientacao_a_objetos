public class Plano2 extends Plano{
    private Double porcentagemPlano2 = 0.15;
    private Double valor = 30.00;
    public Plano2(int codigo, String nome, double valorPadrao){
        setCodigo(codigo);
        setNome(nome);
        setValorPadrao(valorPadrao);
    }

    @Override
    public double calcularMensalidade() {
        super.setValorPadrao((porcentagemPlano2 * valor) + valor);
        return super.getValorPadrao();
    }
}

