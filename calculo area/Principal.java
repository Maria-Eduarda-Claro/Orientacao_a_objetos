import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);


        Figura figura1 = new Quadrado();
        System.out.println("Informe o tamanho do lado do quadrado: ");
        ((Quadrado) figura1).setLado((int) teclado.nextDouble());

        System.out.println("Informe a cor do quadrado: ");
        figura1.setColor(teclado.next());

        Figura figura2 = new Circulo();
        System.out.println("Informe o raio do ciruclo ");
        ((Circulo) figura2).setRaio((int) teclado.nextDouble());

        System.out.println("Informe a cor do circulo: ");
        figura2.setColor(teclado.next());


        figura1.area();


        figura2.area();




    }
}
