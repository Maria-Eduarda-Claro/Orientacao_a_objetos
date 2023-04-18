import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int num;

        System.out.println("Informe um numero:");
        num = entrada.nextInt();

        for (int i = 0; i <= 10; i++) {
            int resultado = num * i;
            System.out.printf("%d x %d = %d\n", num, i, resultado);
        }
    }
}
