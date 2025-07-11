package primeiraclasse;
public class validaQuantidade {
    public static void main(String[] args) {

        Produto produto = new Produto();
		produto.nome = "Produto A";
		produto.quantidadeEstoque = 5;

      System.out.println("Necessário repor estoque do produto " + produto.nome + "? " + eNecessarioReporEstoque(produto));
	}
	
	static Boolean eNecessarioReporEstoque(Produto produto) {
		if (produto.quantidadeEstoque < Produto.QUANTIDADE_MINIMA_ESTOQUE) {
			return true;
		}
		
		return false;
	}
}