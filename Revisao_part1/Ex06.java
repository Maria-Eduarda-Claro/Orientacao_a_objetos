import java.util.Scanner;
public class Ex06 {
    public static void main(String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe sua idade em anos:");
        int ano = entrada.nextInt();
        System.out.println("Informe sua idade em meses:");
        int meses = entrada.nextInt();
        System.out.println("Informe sua idade em dias:");
        int dias = entrada.nextInt();

        int diasTotais = (ano * 360) + (meses * 30) + dias;

        System.out.println("A idade em dias é:" + diasTotais);

    }
}
