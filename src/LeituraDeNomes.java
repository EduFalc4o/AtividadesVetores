import java.util.Scanner;

public class LeituraDeNomes {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String[] vetor = new String[3];

        System.out.println("insira o primeiro nome desejado :");
        vetor[0] = input.nextLine();
        System.out.println("insira o segundo nome desejado :");
        vetor[1] = input.nextLine();
        System.out.println("insira o terceiro nome desejado:");
        vetor[2] = input.nextLine();

        System.out.println("primeiro nome:" + vetor[0]);
        System.out.println("segundo nome:" + vetor[1]);
        System.out.println("terceiro nome:" + vetor[2]);

        }
    }
