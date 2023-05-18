public class testaEncapsulamento {

    public static void main(String[] args) {
        Encapsulamento encapsulamento = new Encapsulamento();

        encapsulamento.setNome("Maria");
        encapsulamento.setSalario(5000.00);

        System.out.println("Nome:" + encapsulamento.getNome());
        System.out.println("Salario:" + encapsulamento.getSalario());


    }
}
