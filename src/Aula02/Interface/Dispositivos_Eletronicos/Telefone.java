package Aula02.Interface.Dispositivos_Eletronicos;

// Implementação da interface DispositivoEletronico para Telefone
public class Telefone implements DispositivoEletronico {
    @Override
    public void ligar() {
        System.out.println("Telefone ligado");
    }

    @Override
    public void desligar() {
        System.out.println("Telefone desligado");
    }

    @Override
    public void verificarStatus() {
        System.out.println("Verificando status do telefone");
    }
}
