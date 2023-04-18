import java.util.Scanner;


public class Ex01 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro numero:");
        double numero1 = entrada.nextDouble();

        System.out.println("Informe o segundo numero:");
        double numero2 = entrada.nextDouble();

        System.out.println("Informe o terceiro numero:");
        double numero3 = entrada.nextDouble();

        System.out.println("Informe o quarto numero:");
        double numero4 = entrada.nextDouble();

        double soma = numero1 + numero2 + numero3 + numero4;
        double divisao = soma / numero4;
        double multiplicacao = divisao * numero4;
        double subtracao = divisao - numero4;

        System.out.println("A soma dos valores é:" + soma);
        System.out.println("A divisao dos valores é:" + divisao);
        System.out.println("A multiplicacao dos valores é:"+ multiplicacao);
        System.out.println("A subtracao dos valores é:"+ divisao);


    }
}
