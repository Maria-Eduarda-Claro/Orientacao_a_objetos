import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int negativos = 0;

        for (int i = 1; i <= 5 ; i++){
            System.out.print("Digite o " + i + "º valor: ");
            int valor = entrada.nextInt();
            if (valor < 0) {
                negativos++;
            }

            System.out.print("Foram digitados " + negativos + " valores negativos\n");

        }
    }
}