 import java.util.Scanner;
public class ResultadoIMC {
    // O IMC IMC = PESO / (ALTURA * ALTURA)
    public static void main(String[] args) throws Exception 
    {
        double peso;
        double altura;
        double imc;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite seu peso em kg: ");
        peso = scanner.nextDouble();
        System.out.print("Digite sua altura em metros:");
        altura = scanner.nextDouble();
        imc =peso / (altura * altura);
        System.out.printf("Seu IMC é: %.2f\n", imc);
        if (imc < 18) {
            System.out.println("Você está abaixo do peso.");
        }
        else if (imc < 24.9) {
            System.out.println("Você está com o pesso normal.");
        }
        else if (imc < 30) {
            System.out.println("Você está acima do peso.");
        }
        else if (imc < 34.9) {
            System.out.println("Você está com obesidade grau 1.");
        }
        else if (imc < 39.9) {
            System.out.println("Você está com obesidade grau 2.");
        }
        else {
            System.out.println("Você está com obesidade grau 3.");
        }
        
        scanner.close();
    }
    
}
