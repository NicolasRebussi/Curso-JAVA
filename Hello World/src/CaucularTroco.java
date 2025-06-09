import java.util.Scanner;

public class CaucularTroco {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();
        System.out.print("Digite o valor pago: ");
        double valorPago = scanner.nextDouble();

        if (valorPago < valorProduto) {
            Double valorFaltante = valorProduto - valorPago;
            System.out.printf("Valor faltante: R$ %.2f%n", valorFaltante);
        } else {
            Double troco = valorPago - valorProduto;
            System.out.println ("Troco: R$ " + String.format("%.2f", troco));
        }

        scanner.close();
    }
}
