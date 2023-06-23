public class Gato extends SerVivo{
    @Override
    public void falar() {
        System.out.println("O gato mia! " + super.getNome() + " Idade: " + super.getIdade());

    }
}
