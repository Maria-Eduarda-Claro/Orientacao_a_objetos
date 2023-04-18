import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int num, soma = 0;
        char continuar;

        do{
            System.out.print("Informe um numero:");
            num = entrada.nextInt();
            soma += num;

            System.out.println("Deseja continuar (S/N)");
            continuar = entrada.next().charAt(0);
        }while (continuar == 'S');
        System.out.println("A soma dos numeros é:"+ soma);
        entrada.close();
    }
}
