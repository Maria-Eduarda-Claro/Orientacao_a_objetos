import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Automovel automovel1 = new Carro();
        System.out.println("Informe o nome do carro:");
        automovel1.setNome(teclado.next());

        System.out.println("Informe a marca do automovel");
        automovel1.setMarca(teclado.next());

        System.out.println("Informe a velocidade media:");
        automovel1.setVelocidadeMedia(teclado.nextDouble());


        Automovel automovel2 = new Moto();
        System.out.println("Informe o nome da moto:");
        automovel2.setNome(teclado.next());

        System.out.println("Informe a marca da moto");
        automovel2.setMarca(teclado.next());

        System.out.println("Informe a velocidade media:");
        automovel2.setVelocidadeMedia(teclado.nextDouble());


        Automovel automovel3 = new Caminhao();
        System.out.println("Informe o nome do caminhao:");
        automovel3.setNome(teclado.next());

        System.out.println("Informe a marca do caminhao");
        automovel3.setMarca(teclado.next());

        System.out.println("Informe a velocidade media:");
        automovel3.setVelocidadeMedia(teclado.nextDouble());

        System.out.println("o nome do carro é:" + automovel1.getNome() + "marca:" + automovel1.getMarca());
        automovel1.Acelerar();

        System.out.println("o nome da moto é:" + automovel2.getNome() + "marca:" + automovel2.getMarca());
        automovel2.Acelerar();

        System.out.println("o nome do caminhao é:" + automovel3.getNome() + "marca:" + automovel3.getMarca());
        automovel3.Acelerar();


    }
}
