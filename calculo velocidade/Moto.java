public class Moto extends Automovel {
    @Override
    public void Acelerar(){
        double Acelerar = getVelocidadeMedia()*2;
        System.out.println("A velocidade media da moto é:" + Acelerar);

    }

}
