import java.util.Scanner;
public class Ex03 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o nome do produto:");
        String nome = entrada.nextLine();
        System.out.println("Informe o valor do produto:");
        double valor = entrada.nextDouble();
        System.out.println("Informe o percentual de desconto :");
        double desconto = entrada.nextDouble();
        System.out.println("Informe a quantidade de produtos:");
        int quantidade = entrada.nextInt();

        double valorFinal = quantidade *(valor * (desconto / 100));

        System.out.println("O nome do item é:" + nome);
        System.out.println("O valor do produto é:" + valor);
        System.out.println("O percentual de desconto foi de:" + desconto);
        System.out.println("A quantidade de itens foi:" + quantidade);
        System.out.println("O valor final do produto é de: " + valorFinal);


    }
}
