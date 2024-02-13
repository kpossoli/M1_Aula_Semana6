package Aula01.Herança.Heranca_Produto;

public class Vestuario extends Produto {
    private String tamanho;

    public Vestuario(String nome, double preco, String tamanho) {
        super(nome, preco);
        this.tamanho = tamanho;
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Tamanho: " + tamanho);
    }
}
