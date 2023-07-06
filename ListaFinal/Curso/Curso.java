
    public abstract class Curso {
        private int codigo;
        private String nomeAluno;
        private String nomeCurso;
        private double valorPadrao;

        public int getCodigo() {
            return codigo;
        }

        public void setCodigo(int codigo) {
            this.codigo = codigo;
        }

        public String getNomeAluno() {
            return nomeAluno;
        }

        public void setNomeAluno(String nomeAluno) {
            this.nomeAluno = nomeAluno;
        }

        public String getNomeCurso() {
            return nomeCurso;
        }

        public void setNomeCurso(String nomeCurso) {
            this.nomeCurso = nomeCurso;
        }

        public double getValorPadrao() {
            return valorPadrao;
        }

        public void setValorPadrao(double valorPadrao) {
            this.valorPadrao = valorPadrao;
        }

        public abstract double calcularMensalidade();
    }




