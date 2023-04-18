import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe seu peso:");
        double peso = entrada.nextDouble();
        System.out.println("Informe sua altura:");
        double altura = entrada.nextDouble();

        double imc = peso / (altura * altura);

        if (peso < 18.5){
            System.out.println("Voce esta abaixo do peso");
        }else if(imc < 25){
            System.out.println("Voce esta no peso normal");
        }else if (imc < 30){
            System.out.println("voce esta acima do peso");
        }else{
            System.out.println("Voce esta obeso");

        }

    }
}
