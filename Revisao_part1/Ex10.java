import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o numero:");
        double numero = entrada.nextDouble();

        double soma;
        if(numero % 2 == 0){
            soma = numero + 8;
        }
        else{
            soma = numero + 7;
        }
        System.out.println("O valor total é: " + soma);
    }
}
