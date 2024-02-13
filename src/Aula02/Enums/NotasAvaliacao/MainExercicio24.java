/*
Exercício 24:
Tarefa: Enumeração para Notas de Avaliação.
1. Crie uma enumeração chamada NotasAvaliacao representando notas com valores associados à média necessária.
2. Adicione constantes para notas como APROVADO(7.0), RECUPERACAO(5.0), etc.
3. Escreva um método que receba uma média como parâmetro e retorne o correspondente enum utilizando o método
valueOf()
 */

package Aula02.Enums.NotasAvaliacao;

public class MainExercicio24 {
    public static void main(String[] args) {
        // Testando o método que retorna o enum correspondente a uma média
        NotasAvaliacao nota = NotasAvaliacao.obterNotaPelaMedia(6.0);
        System.out.println("Nota correspondente à média 6.0: " + nota);
    }
}