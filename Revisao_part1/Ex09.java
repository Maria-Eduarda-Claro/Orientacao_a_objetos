import java.util.Scanner;

public class Ex09 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe um numero:");
        double numero = entrada.nextDouble();

        if(numero > 0){
            double valor = numero * 2;
            System.out.println("Valor:" + valor);
        }
        else{
            double valor = numero * 3;
            System.out.println("Valor:" + valor);
        }


    }
}
