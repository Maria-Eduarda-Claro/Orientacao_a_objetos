import java.util.Scanner;
public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String nome;
        int idade;
        int qntdDependentes;
        Double valorPadrao;
        int titulo;

        System.out.println("Informe seu nome:");
        nome = teclado.next();

        System.out.println("Informe sua idade:");
        idade = teclado.nextInt();

        System.out.println("Informe a quantidade de dependentes:");
        qntdDependentes = teclado.nextInt();

        System.out.println("Informe o valor do titulo:");
        valorPadrao = teclado.nextDouble();

        System.out.println("Informe 1 para OURO, 2 para PRATA e 3 para BRONZE");
        titulo = teclado.nextInt();

        if (titulo == 1) {
            SocioOuro socioOuro = new SocioOuro(nome, idade, qntdDependentes, valorPadrao);
            Double valorTituloNovo = socioOuro.calcularValorTitulo();

            System.out.println("Nome: " + socioOuro.getNome());
            System.out.println("Idade: " + socioOuro.getIdade());
            System.out.println("Dependentes: " + socioOuro.getQntdDependentes());
            System.out.println("Valor padrão: " + socioOuro.getValorPadrao());
            System.out.println("Valor ouro: " + valorTituloNovo);

        } else if (titulo == 2) {
            SocioPrata socioPrata = new SocioPrata(nome, idade, qntdDependentes, valorPadrao);
            Double valorTituloNovo = socioPrata.calcularValorTitulo();

            System.out.println("Nome: " + socioPrata.getNome());
            System.out.println("Idade: " + socioPrata.getIdade());
            System.out.println("Dependentes: " + socioPrata.getQntdDependentes());
            System.out.println("Valor padrão: " + socioPrata.getValorPadrao());
            System.out.println("Valor ouro: " + valorTituloNovo);

        } else if (titulo == 3) {
            SocioBronzePrata socioBronzePrata = new SocioBronzePrata(nome, idade, qntdDependentes, valorPadrao);
            Double valorTituloNovo = socioBronzePrata.calcularValorTitulo();

            System.out.println("Nome: " + socioBronzePrata.getNome());
            System.out.println("Idade: " + socioBronzePrata.getIdade());
            System.out.println("Dependentes: " + socioBronzePrata.getQntdDependentes());
            System.out.println("Valor padrão: " + socioBronzePrata.getValorPadrao());
            System.out.println("Valor ouro: " + valorTituloNovo);

        }
    }
}


