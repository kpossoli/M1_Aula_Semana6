package Aula02.Interface.Veiculo;

// Implementação da interface Veiculo para Carro
public class Carro implements Veiculo {
    private boolean ligado;
    private int velocidade;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Carro ligado");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Carro desligado");
    }

    @Override
    public int obterVelocidade() {
        return velocidade;
    }
}

