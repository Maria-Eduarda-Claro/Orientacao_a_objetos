package Clube;


import java.util.Scanner;

public class Principal{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int Id;
        String Nome;
        int Idade;
        int QntDependentes;
        Double valorTitulo;
        int titulo;


        System.out.println("Informe seu nome:");
        Nome= teclado.next();

        System.out.println("Informe sua idade:");
        Idade = teclado.nextInt();

        System.out.println("Informe a quantidade de dependentes:");
        QntDependentes = teclado.nextInt();

        System.out.println("Informe o valor do titulo:");
        valorTitulo = teclado.nextDouble();

        System.out.println("Ouro - 1, Pata - 2, Bronze - 3");
        titulo = teclado.nextInt();



        if (titulo == 1){
            SocioOuro socioOuro = new SocioOuro(1, Nome, Idade, QntDependentes, valorTitulo);
            Double valorTituloNovo = socioOuro.CalcularValorTitulo();
            System.out.println("Nome: " + socioOuro.getNome());
            System.out.println("Idade: " + socioOuro.getIdade());
            System.out.println("Dependentes: " + socioOuro.getQntDependentes());
            System.out.println("Valor Ouro: " + valorTituloNovo);

        } else if (titulo == 2) {
            SocioPrata socioPrata = new SocioPrata( 2,Nome, Idade, QntDependentes, valorTitulo);
            Double valorTituloNovo = socioPrata.CalcularValorTitulo();

            System.out.println("Nome: " + socioPrata.getNome());
            System.out.println("Idade: " + socioPrata.getIdade());
            System.out.println("Dependentes: " + socioPrata.getQntDependentes());
            System.out.println("Valor padrão: " + socioPrata.getValorTitulo());
            System.out.println("Valor prata: " + valorTituloNovo);

        } else if (titulo == 3) {
            SocioBronze socioBronze = new SocioBronze( 3, Nome, Idade, QntDependentes, valorTitulo);
            Double valorTituloNovo = socioBronze.CalcularValorTitulo();

            System.out.println("Nome: " + socioBronze.getNome());
            System.out.println("Idade: " + socioBronze.getIdade());
            System.out.println("Dependentes: " + socioBronze.getQntDependentes());
            System.out.println("Valor padrão: " + socioBronze.getValorTitulo());
            System.out.println("Valor bronze: " + valorTituloNovo);


        }



    }
}
