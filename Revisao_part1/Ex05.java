import java.util.Scanner;
public class Ex05 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        String nome = entrada.nextLine();
        System.out.println("Informe o seu salario:");
        double salario = entrada.nextDouble();
        System.out.println("Informe o mes em que você ingressou na empresa:");
        int mesDeEntrada = entrada.nextInt();
        System.out.println("Informe o mes atual:");
        int mesAtual = entrada.nextInt();

       int mesesTrabalhados = mesAtual - mesDeEntrada;
       double decimoTerceiro =(salario / 12) * mesesTrabalhados;
       double ferias = decimoTerceiro * 0.33;
       double salarioAno = decimoTerceiro + ferias +(salario + mesesTrabalhados);

       System.out.println("Nome:" + nome);
       System.out.println("Salario:" + salario);
       System.out.println("Ferias:"+ ferias);
       System.out.println("decimo terceiro:" + decimoTerceiro);
       System.out.println("O salario total é: " + salarioAno);
    }

}
