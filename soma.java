package br.com.aula01;
import java.util.Scanner;         //
public class Soma {
    public static void main (String args[]){
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro número:");
        int numero1 = entrada.nextInt();

        System.out.print("Informe o segundo número:"); //
        double numero2 = entrada.nextDouble();

        System.out.print("Informe o terceiro número:");

        double soma = numero1 + numero2;

        System.out.printf("A soma de eh %d\n", numero1);
        System.out.printf("Com o numero %f\n", numero2);
        System.out.printf("A soma dos valores eh %f\n", soma);
