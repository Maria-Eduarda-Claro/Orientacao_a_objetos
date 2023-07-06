public class Sistemas extends Curso{
    private Double valor = 300.00;
    private double taxa = 0.05;

    public Sistemas(int codigo, String nomeAluno, String nomeCurso,  double valorPadrao){
        setCodigo(codigo);
        setNomeAluno(nomeAluno);
        setNomeCurso(nomeCurso);
        setValorPadrao(valorPadrao);
    }
    @Override
    public double calcularMensalidade() {
        Double mansalidade = valor * 2;
        super.setValorPadrao(mansalidade + (mansalidade * taxa));
        return super.getValorPadrao();
    }
}
