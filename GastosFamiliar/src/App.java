
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner (System.in);
        System.out.println("digite o valor gasto com...");

        Double total = 0.0;
        System.out.print("Luz");
        total += scanner.nextDouble();
        System.out.print("Água");
        total += scanner.nextDouble();
        System.out.print("Telefone");
        total += scanner.nextDouble();
        System.out.print("Cartão");
        total += scanner.nextDouble();
        System.out.print("Alimentação");
        total += scanner.nextDouble();

        System.out.println("O total gasto foi: " + total);

       scanner.close();
    }
}
