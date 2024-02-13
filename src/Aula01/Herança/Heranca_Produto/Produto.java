package Aula01.Herança.Heranca_Produto;
public class Produto {
    protected String nome;
    protected double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Preço: R$" + preco);
    }
}
