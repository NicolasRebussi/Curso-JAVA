import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    System.out.print("Digite o primeiro número: ");
    double num1 = scanner.nextDouble();
    System.out.print("Digite o segundo número: ");
    double num = scanner.nextDouble();
        System.out.print("Operação [1 = + | 2 = - | 3 = * | 4 = /]: ");
        Integer operacao = scanner.nextInt();
        double resultado = 0;

        if (operacao.equals(1)) {
            resultado = num1 + num;
            System.out.println("Resultado: " + resultado);
        } else if (operacao.equals(2)) {
            resultado = num1 - num;
            System.out.println("Resultado: " + resultado);
        } else if (operacao.equals(3)) {
            resultado = num1 * num;
            System.out.println("Resultado: " + resultado);
        } else if (operacao.equals(4)) {
            if (num != 0) {
                resultado = num1 / num;
                System.out.println("Resultado: " + resultado);
            } else {
                System.out.println("Erro: Divisão por zero não é permitida.");
            }
        } else {
            System.out.println("Operação inválida.");
        }
    }
}
