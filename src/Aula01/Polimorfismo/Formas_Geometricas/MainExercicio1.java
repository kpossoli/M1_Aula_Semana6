/*
Exercício 1:
Tarefa: Polimorfismo em Formas Geométricas.
1. Crie uma classe base chamada Forma com métodos como calcularArea e calcularPerimetro.
2. Derive duas classes, Circulo e Quadrado, da classe Forma.
3. Implemente métodos específicos para calcular a área e o perímetro de cada forma.
4. Utilize polimorfismo ao chamar os métodos calcularArea e calcularPerimetro para instâncias de ambas as
formas.
 */

package Aula01.Polimorfismo.Formas_Geometricas;

public class MainExercicio1 {
    public static void main(String[] args) {
        Forma circulo = new Circulo(5);
        Forma quadrado = new Quadrado(4);

        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());

        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());
    }
}