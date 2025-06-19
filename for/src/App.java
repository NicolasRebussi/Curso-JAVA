// Declaração da classe principal chamada App.
// Em Java, toda aplicação precisa de pelo menos uma classe.
public class App {

    // Método principal do programa - ponto de entrada da aplicação.
    // É onde o Java começa a executar o código.
    // - public: pode ser chamado por qualquer classe.
    // - static: pode ser executado sem precisar criar um objeto da classe.
    // - void: não retorna nenhum valor.
    // - String[] args: permite passar argumentos pela linha de comando.
    // - throws Exception: permite que o método trate ou propague exceções.
    public static void main(String[] args) throws Exception {

        // Criação de um array de objetos Integer com os números de 1 a 20.
        // Integer é uma classe wrapper (invólucro) para o tipo primitivo int.
        // Isso permite que os valores sejam tratados como objetos.
        Integer[] numeros = new Integer[] {
            1, 2, 3, 4, 5,
            6, 7, 8, 9, 10,
            11, 12, 13, 14, 15,
            16, 17, 18, 19, 20
        };

        // Estrutura de repetição for:
        // Usada para percorrer (iterar) todos os elementos do array.
        // Começa com i = 0 (primeiro índice do array)
        // Continua enquanto i for menor que o tamanho do array (20 elementos)
        // i++ aumenta o valor de i em 1 a cada repetição.
        for (int i = 0; i < numeros.length; i++) {

            // Pega o elemento atual do array na posição i
            // e o armazena na variável 'numero'.
            // Exemplo: se i == 0, numero = numeros[0], que é 1.
            Integer numero = numeros[i];

            // Verifica se o número atual é múltiplo de 3.
            // A operação 'numero % 3' retorna o resto da divisão.
            // Se o resto for 0, o número é divisível por 3 (ou seja, múltiplo).
            if (numero % 3 == 0)

                // Se a condição for verdadeira, imprime uma mensagem no console.
                // O '+' é usado para concatenar (juntar) strings com valores.
                // Aqui, imprime o número que é múltiplo de 3.
                System.out.println("esse número é múltiplo de 3: " + numero);
        }

        // Quando o laço termina (i chega a 20), o programa chega ao fim
        // e encerra a execução do método main.
    }
}
