package Aula01.Herança.Sobrescrita_Metodo;

public class Carro extends Veiculo {
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo: Carro");
    }
}

