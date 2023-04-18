import java.util.Scanner;
public class Ex07 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o valor de A:");
        double valorA = entrada.nextDouble();
        System.out.println("Informe o valor de B:");
        double valorB = entrada.nextDouble();
        System.out.println("Informe o valor de C:");
        double valorC = entrada.nextDouble();

        double soma = valorA + valorB;
        if (soma < valorC){
            System.out.printf("A soma é menor que o valor de C");
        }
        else{
            System.out.printf("A soma é maior que o valor de C" );
        }
    }
}
