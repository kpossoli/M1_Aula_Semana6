/*
Exercício 3:
Tarefa: Interface para Operações Matemáticas.
1. Crie uma interface chamada OperacaoMatematica.
2. Defina métodos na interface, como somar, subtrair, e multiplicar.
3. Implemente a interface em duas classes diferentes, como CalculadoraBasica e CalculadoraCientifica.
4. Crie instâncias de ambas as classes e chame os métodos definidos pela interface.
 */

package Aula02.Interface.Operacao_Matemática;

public class MainExercicio3 {
    public static void main(String[] args) {
        OperacaoMatematica calcBasica = new CalculadoraBasica();
        OperacaoMatematica calcCientifica = new CalculadoraCientifica();

        System.out.println("Soma (5 + 3) = " + calcBasica.somar(5, 3));
        System.out.println("Subtração (5 - 3) = " + calcBasica.subtrair(5, 3));
        System.out.println("Multiplicação (5 * 3) = " + calcBasica.multiplicar(5, 3));

        System.out.println("Soma (5 + 3) = " + calcCientifica.somar(5, 3));
        System.out.println("Subtração (5 - 3) = " + calcCientifica.subtrair(5, 3));
        System.out.println("Multiplicação (5 * 3) = " + calcCientifica.multiplicar(5, 3));
    }
}

