package br.com.aula01;
import java.util.Scanner;
public class desafio {
    public static void main (String args[]) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro número:");
        double numero1 = entrada.nextDouble();

        System.out.print("Informe o segundo número:");
        double numero2 = entrada.nextDouble();

        double soma = numero1 + numero2;
        double divisao = numero1 / numero2;
        double subtracao = numero1 - numero2;
        double multiplicacao = numero1 * numero2;

        System.out.printf("a soma dos valores eh %f\n", soma);
        System.out.printf("a divisao dos valores eh %f\n", divisao);
        System.out.printf("a subtracao dos valores eh %f\n", subtracao);
        System.out.printf("a multiplicacao dos valores eh %f\n", multiplicacao);




    }
}
