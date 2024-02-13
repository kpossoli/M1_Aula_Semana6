package Aula02.Interface.Veiculo;

// Implementação da interface Veiculo para Bicicleta
public class Bicicleta implements Veiculo {
    private boolean ligado;
    private int velocidade;

    @Override
    public void ligar() {
        ligado = true;
        System.out.println("Bicicleta ligada");
    }

    @Override
    public void desligar() {
        ligado = false;
        System.out.println("Bicicleta desligada");
    }

    @Override
    public int obterVelocidade() {
        return velocidade;
    }
}

