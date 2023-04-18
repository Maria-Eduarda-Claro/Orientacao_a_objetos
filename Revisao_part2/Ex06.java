import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int soma = 0;
        int quantidade = 0;

        for (int i = 13; i <= 73; i++){
            soma = soma + i;
            quantidade++;
        }

        double media = (double) soma / quantidade;

        System.out.println("A media aritmetica é:" + media);




    }
}
