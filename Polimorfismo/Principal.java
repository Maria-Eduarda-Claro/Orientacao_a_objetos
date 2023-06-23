import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        SerVivo servivo1 = new Homem();
        System.out.println("Informe o nome do Homem:");
        servivo1.setNome(teclado.next());

        System.out.println("Informe a idade do Homem:");
        servivo1.setIdade(teclado.nextInt());

        SerVivo servivo2 = new Cachorro();
        System.out.println("Informe o nome do cachorro:");
        servivo2.setNome(teclado.next());

        System.out.println("Informe a idade do cachorro:");
        servivo2.setIdade(teclado.nextInt());

        SerVivo servivo3 = new Gato();
        System.out.println("Informe o nome do gato:");
        servivo3.setNome(teclado.next());

        System.out.println("Informe a idade do gato:");
        servivo3.setIdade(teclado.nextInt());

        //System.out.println("Homem: " + servivo1.getNome() + "idade: "+ servivo1.getIdade());
        servivo1.falar();

        //System.out.println("Cachorro: " + servivo2.getNome() + "idade: "+ servivo2.getIdade());
        servivo2.falar();

        //System.out.println("Gato:" + servivo3.getNome() + "idade:"+ servivo3.getIdade());
        servivo3.falar();



    }
}
