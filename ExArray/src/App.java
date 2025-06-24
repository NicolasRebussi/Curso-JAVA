// Importa a classe Scanner para ler dados do usuário via console
import java.util.Scanner;

// Declara a classe principal do programa
public class App {

    // Método principal, onde o programa começa a ser executado
    public static void main(String[] args) {

        // Cria o objeto scanner para receber entradas do usuário
        Scanner scanner = new Scanner(System.in);

        // Solicita ao usuário quantos alunos serão registrados
        System.out.print("Digite o número de alunos: ");
        int numAlunos = scanner.nextInt(); // Lê e armazena o número de alunos

        // Solicita ao usuário quantas provas cada aluno fez
        System.out.print("Digite o número de provas: ");
        int numProvas = scanner.nextInt(); // Lê e armazena o número de provas

        // Cria uma matriz bidimensional (2D) para armazenar as notas
        // Cada linha da matriz representa um aluno
        // Cada coluna da matriz representa uma prova
        double[][] notas = new double[numAlunos][numProvas];

        // Laço externo: percorre cada aluno (cada linha da matriz)
        for (int i = 0; i < numAlunos; i++) {
            // Exibe o número do aluno atual (começando de 1 para o usuário)
            System.out.println("\n==> Aluno " + (i + 1));

            // Laço interno: percorre cada prova do aluno atual
            for (int j = 0; j < numProvas; j++) {
                // Solicita a nota do aluno na prova atual
                System.out.print("Digite a nota da prova " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble(); // Armazena a nota na matriz
            }
        }

        // Mostra as notas e a média de cada aluno
        System.out.println("\n=== Resultados ===");

        // Laço externo: percorre novamente cada aluno
        for (int i = 0; i < numAlunos; i++) {
            double soma = 0; // variável para acumular as notas do aluno

            // Exibe as notas do aluno atual
            System.out.print("Notas do aluno " + (i + 1) + ": ");

            // Laço interno: percorre cada prova do aluno atual
            for (int j = 0; j < numProvas; j++) {
                System.out.print(notas[i][j] + " "); // Mostra a nota
                soma += notas[i][j]; // Soma a nota atual à variável "soma"
            }

            // Calcula a média do aluno dividindo a soma pelo número de provas
            double media = soma / numProvas;

            // Exibe a média formatada com duas casas decimais
            System.out.printf("| Média: %.2f\n", media);
        }

        scanner.close();
    }
}
