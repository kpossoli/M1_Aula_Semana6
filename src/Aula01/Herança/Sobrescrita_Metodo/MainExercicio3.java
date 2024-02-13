/*
Exercício 3:
Tarefa: Sobrescrita de Método.
1. Crie uma classe base chamada Veiculo com um método chamado exibirInfo que imprima informações gerais do
veículo.
2. Derive duas classes, Carro e Moto, da classe Veiculo.
3. Sobrescreva o método exibirInfo nas classes derivadas para incluir informações específicas de cada tipo de veículo.
4. Crie instâncias de Carro e Moto e chame o método exibirInfo para cada uma.
 */

package Aula01.Herança.Sobrescrita_Metodo;

public class MainExercicio3 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.exibirInfo();

        Moto moto = new Moto();
        moto.exibirInfo();
    }
}
