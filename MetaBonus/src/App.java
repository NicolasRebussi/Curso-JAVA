import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Qual a meta de faturamento?");
        Double meta = scanner.nextDouble();
        System.out.println("Qual o valor do faturamento?");
        Double faturamento = scanner.nextDouble();
        System.out.println("Qual a media salarial?");
        Double mediaSalarial = scanner.nextDouble();

        Boolean metaBatida = faturamento >= meta;
        Boolean oitentaPorcentoMeta = faturamento >= meta * 0.8;
        Boolean noBonus = faturamento < meta * 0.8;


        if (metaBatida) {
            System.out.println("Meta batida! Bônus de 100% do salário: " + mediaSalarial);
        } else if (oitentaPorcentoMeta) {
            Double bonusOitenta = mediaSalarial * 0.8;
            System.out.println("Meta de 80% batida! bônus de 80% do salário: " + bonusOitenta);
        } else if (noBonus) {
            System.out.println("Meta não batida! Sem bônus.");
        }

        scanner.close();

    }
}
