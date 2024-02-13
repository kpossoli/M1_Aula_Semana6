/*
Exercício1:
Tarefa: Interface para Veículos.
1. Crie uma interface chamada Veiculo.
2. Defina métodos na interface, como ligar, desligar, e obterVelocidade.
3. Implemente a interface em duas classes diferentes, como Carro e Bicicleta.
4. Crie instâncias de ambas as classes e chame os métodos definidos pela interface.
 */

package Aula02.Interface.Veiculo;

// Programa principal para o Exercício 1
public class MainExercicio1 {
    public static void main(String[] args) {
        Veiculo carro = new Carro();
        Veiculo bicicleta = new Bicicleta();

        carro.ligar();
        bicicleta.ligar();

        carro.desligar();
        bicicleta.desligar();
    }
}
