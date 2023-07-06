import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Plano1 planoUm = new Plano1(1, "", 0.0);
        Plano2 planoDois = new Plano2(1, "", 0.0);

        int opcao;
        System.out.println("Selecione 1 para o Plano 1 ou 2 para o Plano 2");
        opcao = teclado.nextInt();

        if (opcao == 1) {

            System.out.println("Plano 1: ");
            System.out.println("Informe o código do produto: ");
            planoUm.setCodigo(teclado.nextInt());

            System.out.println("Informe o nome do produto: ");
            planoUm.setNome(teclado.next());

            System.out.println("Informe o valor do produto: ");
            planoUm.setValorPadrao(teclado.nextDouble());

            planoUm.calcularMensalidade();

            /********************************
             * Apresentar Informações dentro do IF
             ********************************/
            System.out.println("********* Plano 1 *******");
            System.out.println("Codigo: "+ planoUm.getCodigo());
            System.out.println("Nome do produto: " + planoUm.getNome());
            System.out.println("Valor final: " + planoUm.getValorPadrao());


        }if(opcao == 2){

            System.out.println("Plano 2: ");
            System.out.println("Informe o código do produto: ");
            planoDois.setCodigo(teclado.nextInt());

            System.out.println("Informe o nome do produto: ");
            planoDois.setNome(teclado.next());

            System.out.println("Informe o valor do produto: ");
            planoDois.setValorPadrao(teclado.nextDouble());

            planoDois.calcularMensalidade();

            /********************************
             * Apresentar Informações dentro do IF
             ********************************/
            System.out.println("********* Plano 2 *******");
            System.out.println("Codigo: "+ planoDois.getCodigo());
            System.out.println("Nome do produto: " + planoDois.getNome());
            System.out.println("Valor final: " + planoDois.getValorPadrao());
        }
    }
}