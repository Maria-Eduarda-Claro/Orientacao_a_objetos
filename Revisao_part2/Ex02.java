import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num, inicio, fim;

        System.out.println("Informe um numero:");
        num = entrada.nextInt();
        System.out.println("Informe o numero de inicio:");
        inicio = entrada.nextInt();
        System.out.println("Informe o numero de parada");
        fim = entrada.nextInt();

        for (int i = inicio; i <= fim; i++){
            int resultado = num * i;
            System.out.printf("%d x %d = %d\n", num, i, resultado);
        }
    }
}
