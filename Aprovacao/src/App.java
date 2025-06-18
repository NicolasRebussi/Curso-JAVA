import java.util.Scanner;
public class App {
    static final Double NOTA_MINIMA_GERAL = 150.0;
    static final Double NOTA_MIMA_GERAL = 60.0;
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner (System.in);
        System.out.println("Digite sua nota de Matemática: ");
        Double notaMatematica = scanner.nextDouble();
        System.out.println("Digite sua nota de Português:");
        Double notaPortugues = scanner.nextDouble();

        Boolean notaGeral = notaMatematica + notaPortugues >= NOTA_MINIMA_GERAL;
        Boolean minimoMatematica = notaMatematica >= NOTA_MIMA_GERAL;
        Boolean minimoPortugues = notaPortugues >= NOTA_MIMA_GERAL;

        if (notaGeral && minimoMatematica && minimoPortugues) {
            System.out.println("Aprovados");
        } 
        else if (notaGeral && !minimoMatematica && !minimoPortugues) {
            System.out.println("Reprovado em Matemática e Português");
        }
        else if (notaGeral && minimoMatematica && !minimoPortugues) {
            System.out.println("Reprovado em Português");
        }
        else if (notaGeral && !minimoMatematica && minimoPortugues) {
            System.out.println("Reprovado em Matemática");
        }
        else if (!notaGeral && minimoMatematica && minimoPortugues) {
            System.out.println("Nota geral de 150 pontos, não atingida ");
        }
        
        scanner.close();
    }
}
