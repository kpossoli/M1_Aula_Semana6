/*
Exercício 1:
Tarefa: Enumeração para Dias da Semana.
1. Crie uma enumeração chamada DiasDaSemana representando os dias da semana.
2. Adicione constantes para cada dia (por exemplo, DOMINGO, SEGUNDA, etc.).
3. Escreva um método que receba um dia da semana como parâmetro e imprima uma mensagem associada a esse dia.
 */

package Aula02.Enums.DiasDaSemana;
public class MainExercicio1 {
    public static void main(String[] args) {
        // Chamando o método para imprimir uma mensagem associada a um dia da semana
        imprimirMensagemDia(DiasDaSemana.SEGUNDA);
    }

    // Método para imprimir uma mensagem associada a um dia da semana
    public static void imprimirMensagemDia(DiasDaSemana dia) {
        switch (dia) {
            case DOMINGO:
                System.out.println("Hoje é domingo, dia de descanso.");
                break;
            case SEGUNDA:
                System.out.println("Hoje é segunda-feira, início da semana.");
                break;
            case TERCA:
                System.out.println("Hoje é terça-feira, mais um dia de trabalho.");
                break;
            case QUARTA:
                System.out.println("Hoje é quarta-feira, metade da semana já passou.");
                break;
            case QUINTA:
                System.out.println("Hoje é quinta-feira, a semana está quase acabando.");
                break;
            case SEXTA:
                System.out.println("Hoje é sexta-feira, dia de ficar feliz!");
                break;
            case SABADO:
                System.out.println("Hoje é sábado, dia de diversão.");
                break;
            default:
                System.out.println("Dia inválido!");
        }
    }
}

