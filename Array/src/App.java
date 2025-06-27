import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 1. Pergunta ao usuário quantas tarefas ele deseja cadastrar
        System.out.print("Digite o número de tarefas que deseja cadastrar: ");
        int n = scanner.nextInt(); // lê o número inteiro
        scanner.nextLine(); // consome a quebra de linha que ficou no buffer

        // 2. Cria um array de String com o tamanho informado
        String[] tarefas = new String[n];

        // 3. Loop para inserir cada tarefa
        for (int i = 0; i < n; i++) {
            System.out.print("Digite a tarefa " + (i + 1) + ": ");
            tarefas[i] = scanner.nextLine(); // nextLine permite frases completas
        }

        // 4. Imprime todas as tarefas depois que todas forem digitadas
        System.out.println("Suas tarefas são:");
        for (int i = 0; i < n; i++) {
            System.out.println((i + 1) + ": " + tarefas[i]);
            
        }

        scanner.close();
    }
}
