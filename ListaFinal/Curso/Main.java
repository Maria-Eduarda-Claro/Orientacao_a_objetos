import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Marketing marketing = new Marketing(1, "", "", 0.0);
        Direito direito = new Direito(1, "", "", 0.0);
        Sistemas sistemas = new Sistemas(1,"","",0.0);

        int opcao;
        System.out.println("Selecione 1 para selecionar o curso de Marketing" +
                " \n 2 para o curso de Direito \n 3 para o curso de sistemas");
        opcao = teclado.nextInt();

        if (opcao == 1) {

            System.out.println("Marketing: ");
            System.out.println("Informe o código do aluno: ");
            marketing.setCodigo(teclado.nextInt());

            System.out.println("Informe o nome do aluno: ");
            marketing.setNomeAluno(teclado.next());

            System.out.println("Informe o nome do curso desejado: ");
            marketing.setNomeCurso(teclado.next());

            marketing.calcularMensalidade();

            /********************************
             * Apresentar Informações dentro do IF
             ********************************/
            System.out.println("********* Curso 1 - Marketing *******");
            System.out.println("Codigo: "+ marketing.getCodigo());
            System.out.println("Nome do aluno: " + marketing.getNomeAluno());
            System.out.println("Nome do curso: " + marketing.getNomeCurso());
            System.out.println("Valor final: " + marketing.getValorPadrao());

        }if(opcao == 2){

            System.out.println("Direito: ");
            System.out.println("Informe o código do aluno: ");
            direito.setCodigo(teclado.nextInt());

            System.out.println("Informe o nome do aluno: ");
            direito.setNomeAluno(teclado.next());

            System.out.println("Informe o nome do curso desejado: ");
            direito.setNomeCurso(teclado.next());

            direito.calcularMensalidade();

            /********************************
             * Apresentar Informações dentro do IF
             ********************************/
            System.out.println("********* Curso 2 - Direito *******");
            System.out.println("Codigo: "+ direito.getCodigo());
            System.out.println("Nome do aluno: " + direito.getNomeAluno());
            System.out.println("Nome do curso: " + direito.getNomeCurso());
            System.out.println("Valor final: " + direito.getValorPadrao());

        }if(opcao == 3){

            System.out.println("Sistemas: ");
            System.out.println("Informe o código do aluno: ");
            sistemas.setCodigo(teclado.nextInt());

            System.out.println("Informe o nome do aluno: ");
            sistemas.setNomeAluno(teclado.next());

            System.out.println("Informe o nome do curso desejado: ");
            sistemas.setNomeCurso(teclado.next());

            sistemas.calcularMensalidade();

            /********************************
             * Apresentar Informações dentro do IF
             ********************************/
            System.out.println("********* Curso 3 - Sistemas *******");
            System.out.println("Codigo: "+ sistemas.getCodigo());
            System.out.println("Nome do aluno: " + sistemas.getNomeAluno());
            System.out.println("Nome do curso: " + sistemas.getNomeCurso());
            System.out.println("Valor final: " + sistemas.getValorPadrao());
        }
    }
}