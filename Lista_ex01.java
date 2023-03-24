//1. Faça um programa que receba três inteiros e diga qual deles é o maior e qual o menor. Consegue criar mais de uma solução?

import java.util.Scanner;
public class Lista_ex01 {

    public static void main(String[] args){
        Scanner teclado = new Scanner(System.in);
        int numero1;
        int numero2;
        int numero3;
        System.out.println("Informe o primeiro numero:");
        numero1 = teclado.nextInt();

        System.out.println("Informe o segundo numero:");
        numero2 = teclado.nextInt();

        System.out.println("Informe o terceiro numero:");
        numero3 = teclado.nextInt();

        if((numero1 > numero2) && (numero1 > numero3)){
            System.out.println("O Numero 1 é o maior");
        }
        if((numero2 > numero1) && (numero2 > numero3)){
            System.out.println("O numero 2 é o maior");
        }
        if((numero3 > numero1) && (numero3 > numero2)){
            System.out.println("O numero 3 é o maior");
        }
        if((numero1 < numero2) && (numero1 < numero3)){
            System.out.println("O numero 1 é o menor");
        }
        if((numero2 < numero1) && (numero2 < numero3)){
            System.out.println("O numero 2 é o menor");
        }
        if((numero3 < numero1) && (numero3 < numero2)){
            System.out.println("O numero 3 é o menor");
        }
    }
}
