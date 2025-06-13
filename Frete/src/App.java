import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Digite o valor do produto: ");
        double valorProduto = scanner.nextDouble();
        
        boolean cobraFrete = valorProduto < 100.0; 
        double valorComFrete = valorProduto;
        
        if (cobraFrete) {
            valorComFrete += 15.0;
        }

        System.out.println("Valor final: R$ " + valorComFrete);

        scanner.close();
    }
}
