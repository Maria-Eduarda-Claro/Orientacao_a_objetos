public class Caminhao extends Automovel {

    @Override
    public void Acelerar(){
        double Acelerar = (getVelocidadeMedia()*2 +3);
        System.out.println("A velocidade media do Caminhao é:" + Acelerar);
    }

}
