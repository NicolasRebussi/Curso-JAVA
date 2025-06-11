import java.util.Scanner;
public class AoQuadrado {
    public static void main(String[] args) throws Exception {
        Scanner scanner =new Scanner(System.in);
        System.out.println("digite um numero para ser elevado ao quadrado:");
        int numero = scanner.nextInt();
        int resultado = numero * numero;
        System.out.println("O resultado de " + numero + " ao quadrado é: " + resultado);

        scanner.close();
    }
}
