public class Cachorro  extends SerVivo{

    @Override
    public void falar(){
        System.out.println("O cachorro late!  seu nome é:" + super.getNome() + " Idade: " + super.getIdade());
    }

}
