import java.util.Scanner;
public class AlunoAprovada {
    public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);

        System.out.println("Qual foi sua nota?");
        int nota = scanner.nextInt();

        boolean aprovado = nota >= 7;
        if (aprovado) { 
            System.out.println("Parabéns! Você foi aprovado.");
        }
        else {
            System.out.println("Infelizmente, você não foi aprovado.");
        }
        scanner.close();
        // Exemplo de uso do operador ternário

    }
}
