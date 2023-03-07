package br.com.aula01;
import java.util.Scanner;
public class desafioTabuada {
    public static void main (String args[]) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Informe o primeiro número:");
        int numero1 = entrada.nextInt();


        System.out.printf("A multiplicacao por 1 é %d\n", numero1 *1);
        System.out.printf("A multiplicacao por 2 é %d\n", numero1 *2);
        System.out.printf("A multiplicacao por 3 é %d\n",numero1*3);
        System.out.printf("A multiplicacao por 4 é %d\n",numero1*4);
        System.out.printf("A multiplicacao por 5 é %d\n",numero1*5);
        System.out.printf("A multiplicacao por 6 é %d\n",numero1*6);
        System.out.printf("A multiplicacao por 7 é %d\n", numero1 *7);
        System.out.printf("A multiplicacao por 8 é %d\n", numero1 *8);
        System.out.printf("A multiplicacao por 9 é %d\n", numero1 *9);
        System.out.printf("A multiplicacao por 10 é %d\n",numero1*10);

    }
}
