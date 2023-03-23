import java.util.Scanner;

public class Condicional{

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero;
        double preco;


        System.out.println("Informe um numero:");
        numero = teclado.nextInt();

        System.out.println("Informe um preço:");
        preco = teclado.nextFloat();

        if (numero > 0){
            System.out.println("o número informado é maior do que zero!");
        }else{
            System.out.println("o numero informado é menor ou igual a zero!");
        }

        if(preco > 10.0){
            System.out.println("O preço do produto está normal");
        }else{
            System.out.println("O preço do produto está na promoção");
        }
    }

}



