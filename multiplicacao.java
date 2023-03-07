package br.com.aula01;
import java.util.Scanner;
public class multiplicacao {
    public static void main (String args[]) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro número:");
        double numero1 = entrada.nextDouble();

        System.out.print("Informe o segundo número:");
        double numero2 = entrada.nextDouble();

        System.out.print("Informe o terceiro número:");
        double numero3 = entrada.nextDouble();

        double multiplicacao = numero1 * numero2 * numero3;

        System.out.printf("A multiplicacao dos valores eh %f", multiplicacao);


    }
}
