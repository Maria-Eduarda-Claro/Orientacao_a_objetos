public class Marketing extends Curso{
    private Double valor = 300.00;

    public Marketing(int codigo, String nomeAluno, String nomeCurso,  double valorPadrao){
        setCodigo(codigo);
        setNomeAluno(nomeAluno);
        setNomeCurso(nomeCurso);
        setValorPadrao(valorPadrao);
    }
    @Override
    public double calcularMensalidade() {
        super.setValorPadrao((valor * 1.5));
        return super.getValorPadrao();
    }
}
