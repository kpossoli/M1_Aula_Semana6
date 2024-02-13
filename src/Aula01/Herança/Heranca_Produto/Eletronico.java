package Aula01.Herança.Heranca_Produto;

public class Eletronico extends Produto {
    private int voltagem;

    public Eletronico(String nome, double preco, int voltagem) {
        super(nome, preco);
        this.voltagem = voltagem;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Voltagem: " + voltagem + "V");
    }
}

