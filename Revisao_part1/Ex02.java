import java.util.Scanner;
public class Ex02 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o primeiro numero:");
        double numero1 = entrada.nextDouble();
        System.out.println("Informe o segundo numero:");
        double numero2 = entrada.nextDouble();
        System.out.println("Informe o terceiro numero:");
        double numero3 = entrada.nextDouble();
        System.out.println("Informe o quarto numero:");
        double numero4 = entrada.nextDouble();
        System.out.println("Informe o quinto numero:");
        double numero5 = entrada.nextDouble();

        double soma = numero1 + numero2 + numero3 + numero4 + numero5;
        double media = soma / 5;

        System.out.println("A media dos numeros é:" + media);

    }
}
