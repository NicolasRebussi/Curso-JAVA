import java.util.Scanner;

public class App {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);	
        
        Double numeroEsquerdo = informeNumero(sc);

        imprimirTraco();

        Integer operacao = escolhaAOperacao(sc);

        imprimirTraco();

        Double numeroDireito = informeNumero(sc);

        imprimirTraco();

        Double resultado = realizarCalculo(operacao, numeroEsquerdo, numeroDireito);

        
        System.out.println("O resultado foi " + resultado);

        sc.close();
		
	}	

    static Double realizarCalculo(Integer operacao, Double numeroEsquerda, Double numeroDireita) {
		Double resultado = null;

        switch (operacao) {
		case 0:
			resultado = subtracao(numeroEsquerda, numeroDireita);
			break;
		case 1:
			resultado = adicao(numeroEsquerda, numeroDireita);
			break;
		default:
			System.err.println("Escolha uma operação válida!");
			System.exit(0);
		}
		
		return resultado;
	}

    static Double subtracao(Double numeroEsquerda, Double numeroDireita) {
		return numeroEsquerda - numeroDireita;
	}
	
	static Double adicao(Double numeroEsquerda, Double numeroDireita) {
		return numeroEsquerda + numeroDireita;
	}


    static Integer escolhaAOperacao(Scanner sc) {
		System.out.println("ESCOLHA A OPERAÇÃO");
		
		String[] operacoes = new String[] {"Subtração", "Adição"};
		
		for(int i = 0; i < operacoes.length; i++) {
			System.out.println("[" + i + "] " + operacoes[i]);
		}
        
        System.out.print("Digite a operação: ");
		
		return sc.nextInt();
    }

    static Double informeNumero(Scanner scanner) {
		System.out.print("Informe o número: ");
		return scanner.nextDouble();
	}
	
	static void imprimirTraco() {
		System.out.println("---------------------------------------");
	}




	
	
}