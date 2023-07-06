import java.util.Scanner;

public class Produtos {
    public Produtos() {
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ProdutoIndustria produtoIndustria = new ProdutoIndustria();
        ProdutoRevenda produtoRevenda = new ProdutoRevenda();

        System.out.println("Informe o código do produto: ");
        produtoIndustria.setCodigo(teclado.nextInt());

        System.out.println("Informe a descrição do produto: ");
        produtoIndustria.setDescricao(teclado.next());

        System.out.println("Informe o valor do produto: ");
        produtoIndustria.setValor(teclado.nextDouble());

        System.out.println("Informe o percentual do Produto comprado: ");
        produtoIndustria.setPercentualIpi(teclado.nextDouble());

        produtoIndustria.calcularIpi();

        System.out.println("Código: " + produtoIndustria.getCodigo() + "\nDescrição: " + produtoIndustria.getDescricao() + "\nO valor do produto alterado é: " + produtoIndustria.getValor());

        System.out.println("-------------- Revenda o Produto --------------");

        System.out.println("Informe o valor que você quer vender o produto: ");
        produtoRevenda.setValor(teclado.nextDouble());

        System.out.println("Informe o percentual cobrado em cima do Produto na revenda: ");
        produtoRevenda.setPercentualIems(teclado.nextDouble());

        produtoRevenda.calcularIcms();

        System.out.println("O valor do produto alterado é: " + produtoRevenda.getValor());

    }
}
