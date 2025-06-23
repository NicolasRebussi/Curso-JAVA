public class App {
    public static void main(String[] args) throws Exception {
        // Criando 4 vetores de Double (um para cada semana)
        Double[] semanaUm = new Double[]{ 1000.0, 1500.0, 1250.0, 2100.0, 1350.0, 970.0, 0.0 };
        Double[] semanaDois = new Double[]{ 1050.0, 2500.0, 3250.0, 1100.0, 1430.0, 900.0, 0.0 };
        Double[] semanaTres = new Double[]{ 1700.0, 1300.0, 1450.0, 2000.0, 1390.0, 800.0, 0.0 };
        Double[] semanaQuatro = new Double[]{ 2100.0, 1600.0, 1850.0, 2100.0, 1220.0, 998.0, 0.0 };
        
        // lembre: mes[i][j] i indica a semana e j indica o dia
        // Agora criamos uma matriz (vetor bidimensional) chamada "mes"
        Double[][] mes = new Double[][] { semanaUm, semanaDois, semanaTres, semanaQuatro };

        // Variável para armazenar o maior faturamento encontrado
        double maiorFaturamento = 0.0;

        // Variável para saber em qual semana ocorreu esse maior faturamento
        int indiceMaiorSemana = 0;

        // Vamos percorrer cada semana (linha da matriz)
        for (int i = 0; i < mes.length; i++) {
            double totalSemana = 0.0;

            // Agora percorremos os dias da semana atual
            for (int j = 0; j < mes[i].length; j++) {
                totalSemana += mes[i][j];  // somando o valor do dia ao total da semana
            }

            // Se esse total for maior que o maior faturamento registrado até agora
            if (totalSemana > maiorFaturamento) {
                maiorFaturamento = totalSemana;       // atualiza o novo maior
                indiceMaiorSemana = i;                // guarda qual semana foi essa
            }
        }

        System.out.println("A semana com maior faturamento foi a semana " + (indiceMaiorSemana + 1));
        System.out.println("O valor do faturamento foi: R$ " + maiorFaturamento);
    }
}
