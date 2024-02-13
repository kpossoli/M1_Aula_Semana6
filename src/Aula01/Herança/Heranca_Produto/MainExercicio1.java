/*
Exercício 1:
Tarefa: Herança em Produtos.
1. Crie uma classe base chamada Produto com atributos como nome e preco.
2. Derive duas classes, Eletronico e Vestuario, da classe Produto.
3. Adicione atributos e métodos específicos para cada classe derivada, como voltagem para Eletronico e tamanho
para Vestuario.
 */

package Aula01.Herança.Heranca_Produto;

public class MainExercicio1 {
    public static void main(String[] args) {
        Eletronico celular = new Eletronico("Celular", 999.99, 110);
        celular.exibirInfo();

        Vestuario camiseta = new Vestuario("Camiseta", 29.99, "M");
        camiseta.exibirInfo();
    }
}