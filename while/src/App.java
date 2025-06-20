// Declaração da classe principal chamada App.
// Em Java, todo código precisa estar dentro de uma classe.
public class App {

    // Método principal (main) onde o programa começa a executar.
    // É obrigatório em aplicações Java.
    public static void main(String[] args) throws Exception {

        // Imprime uma mensagem no console informando o que o programa vai fazer.
        System.out.println("Mutiplos de 3 usando while;");

        // Criação de um array (vetor) do tipo Integer, contendo os números de 1 a 20.
        // Integer é a classe que "embrulha" o tipo primitivo int, permitindo que ele seja tratado como objeto.
        Integer[] numeros = new Integer[] {
            1, 2, 3, 4, 5,
            6, 7, 8, 9, 10,
            11, 12, 13, 14, 15,
            16, 17, 18, 19, 20
        };

        // Criação da variável de controle do laço while.
        // Ela representa o índice atual do array que está sendo acessado.
        int i = 0;

        // Início do laço while:
        // - Esse laço executa enquanto a condição (i < numeros.length) for verdadeira.
        // - numeros.length retorna o tamanho do array (que é 20).
        // - Ou seja, o laço vai de i = 0 até i = 19.
        while (i < numeros.length) {

            // Verifica se o número atual é múltiplo de 3.
            // Para isso, usamos o operador % (módulo), que retorna o resto da divisão.
            // Se o resto for 0, então o número é divisível por 3.
            if (numeros[i] % 3 == 0) {

                // Se a condição for verdadeira (ou seja, é múltiplo de 3),
                // imprime o número atual no console.
                System.out.println(numeros[i]);
            }

            // Incrementa o valor de i em 1.
            // Isso é importante para evitar um loop infinito.
            // Sem esse incremento, o valor de i nunca mudaria e o laço nunca terminaria.
            i++;
        }

        // Quando a condição do while deixa de ser verdadeira (i == 20),
        // o laço termina e o programa chega ao fim.
    }
}
// Fim do método main e da classe App.
// O programa imprime todos os números de 1 a 20 que são múltiplos de 3.