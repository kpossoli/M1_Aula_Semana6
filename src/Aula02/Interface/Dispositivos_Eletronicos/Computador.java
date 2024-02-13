package Aula02.Interface.Dispositivos_Eletronicos;

// Implementação da interface DispositivoEletronico para Computador
public class Computador implements DispositivoEletronico {
    @Override
    public void ligar() {
        System.out.println("Computador ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Computador desligado");
    }

    @Override
    public void verificarStatus() {
        System.out.println("Verificando status do computador");
    }
}
