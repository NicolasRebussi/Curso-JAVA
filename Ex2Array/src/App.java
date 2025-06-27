import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        
        int dias = 7;            // Total de dias da semana (7 dias)
        int horarios = 3;        // Três horários por dia: manhã, tarde e noite

        // Cria a matriz de temperaturas: 7 dias x 3 horários
        double[][] temperaturas = new double[dias][horarios];

        // Array com os nomes dos horários para exibir ao usuário
        String[] nomesHorarios = { "Manhã", "Tarde", "Noite" };

        // Leitura das temperaturas
        for (int i = 0; i < dias; i++ ){
            System.out.println("Dia: " + (i + 1));

            for (int j = 0; j < horarios; j++) {
                System.out.print("Digite a temperatura referente ao horário " + nomesHorarios[j] + ": ");
                temperaturas[i][j] = scanner.nextDouble(); // Armazena a temperatura na matriz
            }
        }

        double somaSemana = 0; // Inicializa a soma total das temperaturas da semana

        // Processa e exibe as informações
        for (int i = 0; i < dias; i++ ){
            double somaDia = 0; // Soma das temperaturas do dia atual

            System.out.print("Dia " + (i + 1) + ": ");

            for (int j = 0; j < horarios; j++) {
                // Exibe o nome do horário e a temperatura correspondente
                System.out.print(nomesHorarios[j] + ": " + temperaturas[i][j] + "°C  ");
                
                // Soma a temperatura do horário atual ao total do dia
                somaDia += temperaturas[i][j];
            }

            // Calcula a média do dia (3 horários)
            double mediaDia = somaDia / horarios;

            // Exibe a média do dia com duas casas decimais
            System.out.printf("| Média do dia: %.2f°C\n", mediaDia);

            // Soma a temperatura total do dia ao total da semana
            somaSemana += somaDia;
        }

        // Calcula a média da semana inteira (21 temperaturas: 7 dias * 3 horários)
        double mediaSemana = somaSemana / (dias * horarios);

        // Exibe a média da semana com duas casas decimais
        System.out.printf("\nMédia da semana: %.2f°C\n", mediaSemana);

        scanner.close(); // Fecha o Scanner para liberar memória
    }
}
