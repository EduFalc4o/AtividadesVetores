public class TrocaDeValores {
    public static void main(String[] args) {

        int[] numeros = {5, 10};

        System.out.println("Valores antes da troca:");
        System.out.println("Posição 0: " + numeros[0]);
        System.out.println("Posição 1: " + numeros[1]);

        int temp = numeros[0];
        numeros[0] = numeros[1];
        numeros[1] = temp;

        System.out.println("\nValores após a troca:");
        System.out.println("Posição 0: " + numeros[0]);
        System.out.println("Posição 1: " + numeros[1]);
    }
}
