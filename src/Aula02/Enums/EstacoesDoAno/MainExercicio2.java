/*
Exercício 2:
Tarefa: Enumeração para Estações do Ano.
1. Crie uma enumeração chamada EstacoesDoAno representando as estações do ano.
2. Adicione constantes para cada estação (por exemplo, PRIMAVERA, VERAO, etc.).
3. Escreva um método que receba uma estação do ano como parâmetro e imprima uma mensagem associada a essa
estação.
 */

package Aula02.Enums.EstacoesDoAno;

public class MainExercicio2 {
    public static void main(String[] args) {
        // Chamando o método para imprimir uma mensagem associada a uma estação do ano
        imprimirMensagemEstacao(EstacoesDoAno.VERAO);
    }

    // Método para imprimir uma mensagem associada a uma estação do ano
    public static void imprimirMensagemEstacao(EstacoesDoAno estacao) {
        switch (estacao) {
            case PRIMAVERA:
                System.out.println("Estamos na primavera, época das flores.");
                break;
            case VERAO:
                System.out.println("Estamos no verão, época de calor e praia.");
                break;
            case OUTONO:
                System.out.println("Estamos no outono, época das folhas secas.");
                break;
            case INVERNO:
                System.out.println("Estamos no inverno, época de frio e neve.");
                break;
            default:
                System.out.println("Estação inválida!");
        }
    }
}
