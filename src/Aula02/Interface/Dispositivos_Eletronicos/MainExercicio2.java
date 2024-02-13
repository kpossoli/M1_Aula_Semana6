/*
Exercício 2:
Tarefa: Interface para Dispositivos Eletrônicos.
1. Crie uma interface chamada DispositivoEletronico.
2. Defina métodos na interface, como ligar, desligar, e verificarStatus.
3. Implemente a interface em duas classes diferentes, como Telefone e Computador.
4. Crie instâncias de ambas as classes e chame os métodos definidos pela interface.
 */

package Aula02.Interface.Dispositivos_Eletronicos;

// Programa principal para o Exercício 2
public class MainExercicio2 {
    public static void main(String[] args) {
        DispositivoEletronico telefone = new Telefone();
        DispositivoEletronico computador = new Computador();

        telefone.ligar();
        telefone.verificarStatus();
        telefone.desligar();

        computador.ligar();
        computador.verificarStatus();
        computador.desligar();
    }
}
