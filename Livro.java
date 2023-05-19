public class Livro {

    private int idLivro;
    private String titulo;
    private Integer qntEmprestimo;
    private String Status;

    public int getIdLivro(){
        return this.idLivro;
    }

    public void setIdLivro(int idLivro){
        this.idLivro = idLivro;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public Integer getQntEmprestimo(){
        return qntEmprestimo;
    }

    public void setQntEmprestimo(Integer qntEmprestimo){
        this.qntEmprestimo = qntEmprestimo;
    }

    public String getStatus(){
        return Status;
    }
    public void setStatus (String Status){
        this.Status = Status;
    }

    public void emprestar(){
        this.qntEmprestimo +=1;
        this.Status = "Emprestado";
    }






}
