package Aula01.Herança.Sobrescrita_Metodo;

// Arquivo Moto.java
public class Moto extends Veiculo {
    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tipo: Moto");
    }
}

