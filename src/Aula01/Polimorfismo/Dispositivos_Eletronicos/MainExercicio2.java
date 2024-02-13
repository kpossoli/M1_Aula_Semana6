/*
Exercício 2:
Tarefa: Polimorfismo em Dispositivos Eletrônicos.
1. Crie uma classe base chamada DispositivoEletronico com um método chamado ligar.
2. Derive duas classes, Telefone e Computador, da classe DispositivoEletronico.
3. Implemente métodos específicos para ligar cada dispositivo eletrônico.
4. Crie instâncias de ambos os dispositivos e chame o método ligar para cada um.
 */

package Aula01.Polimorfismo.Dispositivos_Eletronicos;

public class MainExercicio2 {
    public static void main(String[] args) {
        DispositivoEletronico telefone = new Telefone();
        DispositivoEletronico computador = new Computador();

        telefone.ligar();
        computador.ligar();
    }
}
