public class Carro extends Automovel {

    @Override
    public void Acelerar(){
        double Acelerar = (getVelocidadeMedia()*2 +10);
        System.out.println("A velocidade media do carro é:" + Acelerar);
    }
}
