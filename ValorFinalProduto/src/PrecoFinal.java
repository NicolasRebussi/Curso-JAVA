import java.util.Scanner;

public class PrecoFinal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();

        System.out.print("Digite a quantidade de produtos: ");
        int quantidadeProduto = scanner.nextInt();

        // Calcula o subtotal
        double subtotal = valorProduto * quantidadeProduto;

        // Inicializa desconto como 0
        double desconto = 0.0;

        // Verifica se o desconto será aplicado
        if (quantidadeProduto > 10) {
            desconto = subtotal * 10 / 100; // 10% do subtotal
        }

        // Calcula o valor final
        double valorFinal = subtotal - desconto;

        // Exibe o resultado
        System.out.println("O valor final do produto é: R$ " + valorFinal);

        scanner.close();
    
    }
}
