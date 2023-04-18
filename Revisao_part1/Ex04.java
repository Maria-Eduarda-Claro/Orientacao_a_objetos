import java.util.Scanner;
public class Ex04 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um numero:");
        int numero = entrada.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("O numero antecessor é:" + antecessor);
        System.out.println("O numero sucessor é:" + sucessor);
    }

}
