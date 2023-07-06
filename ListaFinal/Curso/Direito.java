public class Direito extends Curso{
    private Double valor = 300.00;

    public Direito(int codigo, String nomeAluno, String nomeCurso,  double valorPadrao){
        setCodigo(codigo);
        setNomeAluno(nomeAluno);
        setNomeCurso(nomeCurso);
        setValorPadrao(valorPadrao);
    }
    @Override
    public double calcularMensalidade() {
        super.setValorPadrao((valor * 2));
        return super.getValorPadrao();
    }
}
