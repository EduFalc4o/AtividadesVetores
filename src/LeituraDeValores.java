import java.util.Scanner;

public class LeituraDeValores {
        public static void main(String[] args) {

            int[] numeros = new int[3];

            Scanner sc = new Scanner(System.in);


            System.out.print("Insira o primeiro número: ");
            numeros[0] = sc.nextInt();

            System.out.print("Insira o segundo número: ");
            numeros[1] = sc.nextInt();

            System.out.print("Insira o terceiro número: ");
            numeros[2] = sc.nextInt();


           double media = (numeros[0] + numeros[1] + numeros[2]) /3.0;
            System.out.println("a media é :" + media);

            sc.close();
        };
    }
