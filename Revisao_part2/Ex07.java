import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int notas = 0, valor;
        String nome;

        for (int i = 1; i <= 10 ; i++){
            System.out.println("Informe o nome do aluno " + i + ':' );
            nome = entrada.nextLine();
            System.out.println("Digite a " + i + "º nota:");
            valor = entrada.nextInt();
            entrada.nextLine();
            System.out.print("Aluno: " + nome + "\n");

            if (valor < 6) {
                System.out.println("reprovado");
                notas++;
            }
            if (valor == 6 || valor == 7) {
                System.out.println("recuperação");
                notas++;
            }
            if (valor > 7) {
                System.out.println("aprovado");
                notas++;
            }
            System.out.println();
        }
    }
}
