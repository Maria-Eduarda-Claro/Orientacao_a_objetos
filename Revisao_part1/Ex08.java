import java.util.Scanner;

public class Ex08 {
    public static void main (String [] args){
        Scanner entrada = new Scanner(System.in);

        System.out.println("Informe o seu nome:");
        String nome = entrada.nextLine();
        System.out.println("Informe seu estado civil:");
        String estadoCivil = entrada.nextLine();
        System.out.println("Informe seu sexo (com F ou M):");
        String sexo = entrada.nextLine();

        if(estadoCivil.equals("casada") && sexo.equals("F")){
            System.out.println("Informe o tempo de casada:");
            int tempo = entrada.nextInt();
            System.out.println("O tempo de casada é:" + tempo);
        }
        else{
                System.out.println("Nome:" + nome);
                System.out.println("estado civil:" + estadoCivil);
                System.out.println("sexo:" + sexo);

        }

    }
}
