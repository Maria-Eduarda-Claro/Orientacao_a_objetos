public class Homem  extends SerVivo{

    @Override
    public void falar(){
        System.out.println("O Homem fala! seu nome é: " + super.getNome() + " Idade:  " + super.getIdade() );

    }

}
