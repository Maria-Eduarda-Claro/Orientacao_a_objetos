public class Plano1 extends Plano{

    private Double porcentagemPlano1 = 0.05;
    private Double valor = 30.00;
    public Plano1(int codigo, String nome, double valorPadrao){
        setCodigo(codigo);
        setNome(nome);
        setValorPadrao(valorPadrao);
    }

    @Override
    public double calcularMensalidade() {
        super.setValorPadrao((porcentagemPlano1 * valor) + valor);
        return super.getValorPadrao();
    }
}
