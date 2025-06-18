import java.util.Scanner;

public class App {
    
        static final Integer IDADE_MINIMA_PARA_APOSENTAR = 55;
        static final Integer TEMPO_MINIMO_DE_CONTRIBUICAO = 25;
    public static void main(String[] args) throws Exception {

       

        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantos anos você tem?");
        Integer idade = scanner.nextInt();
 
        System.out.println("Quantos anos de contribuição?");
        Integer tempo = scanner.nextInt();

        boolean idadeMinimaParaAposentar = idade >= IDADE_MINIMA_PARA_APOSENTAR;
        boolean tempoMinimoDeContrinuicao = tempo >= TEMPO_MINIMO_DE_CONTRIBUICAO;

        Boolean podeApesentar = idadeMinimaParaAposentar && tempoMinimoDeContrinuicao;


        if (podeApesentar) {
            System.out.println("Você pode se aposentar!");
        } else {
            System.out.println("Você não pode se aposentar!");
        }

        scanner.close();
    }
}
