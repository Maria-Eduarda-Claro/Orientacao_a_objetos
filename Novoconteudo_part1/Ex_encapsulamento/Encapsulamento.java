public class Encapsulamento {
    private double salario;

    private String nome;


    public void setNome(String nome){
        this.nome = nome;
    }
    public  String getNome(){
        return this.nome;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public Double getSalario(){
        return this.salario;
    }

}


