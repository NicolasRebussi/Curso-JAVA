import java.util.Scanner;
public class YourClassName {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Entre com seu primeiro nome:");
        String firstName = scanner.nextLine();
        System.out.println("Entre com seu sobrenome:");
        String lastName = scanner.nextLine();
        System.out.println("Nome completo: " + firstName + " " + lastName);     

        scanner.close();
    }
}
