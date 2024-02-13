/*
Exercício 23:
Tarefa: Enumeração para Estações do Ano.
1. Crie uma enumeração chamada EstacoesDoAno representando estações com valores associados à temperatura média.
2. Adicione constantes para estações como PRIMAVERA(20), VERAO(30), etc.
3. Escreva um método que receba uma temperatura como parâmetro e retorne o correspondente enum utilizando o método
valueOf().
 */

package Aula02.Enums.EstacoesDoAno2;

public class MainExercicio23 {
    public static void main(String[] args) {
        // Testando o método que retorna o enum correspondente a uma temperatura
        EstacoesDoAno estacao = EstacoesDoAno.obterEstacaoPelaTemperatura(25);
        System.out.println("Estação correspondente à temperatura 25°C: " + estacao);
    }
}