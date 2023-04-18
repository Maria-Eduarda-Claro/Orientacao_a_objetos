import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

            System.out.print("Digite o tipo de figura (L para losango ou T para triângulo): ");
            String tipo = entrada.nextLine();
            System.out.print("Digite o número de linhas: ");
            int linhas = entrada.nextInt();

            if (tipo.equalsIgnoreCase("L")) {
                losango(linhas);
            } else if (tipo.equalsIgnoreCase("T")) {
                triangulo(linhas);
            } else {
                System.out.println("Tipo de figura inválido.");
            }
        }
        public static void losango(int linhas) {
            for (int i = 1; i <= linhas; i++) {
                System.out.println(" ".repeat(linhas - i) + "%".repeat(2 * i - 1));
            }
            for (int i = linhas - 1; i >= 1; i--) {
                System.out.println(" ".repeat(linhas - i) + "%".repeat(2 * i - 1));
            }
        }
        public static void triangulo(int linhas) {
            for (int i = 1; i <= linhas; i++) {
                System.out.println("%".repeat(i));
            }


    }
}
