/*
Exercício 2:
Tarefa: Herança em Formas Geométricas.
1. Crie uma classe base chamada Forma com métodos como calcularArea e calcularPerimetro.
2. Derive duas classes, Circulo e Quadrado, da classe Forma.
3. Implemente métodos específicos para cada classe derivada, como calcularRaio para Circulo e calcularLado
para Quadrado.
 */

package Aula01.Herança.Heranca_Forma;

public class MainExercicio2 {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println("Área do círculo: " + circulo.calcularArea());
        System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());

        Quadrado quadrado = new Quadrado(4);
        System.out.println("Área do quadrado: " + quadrado.calcularArea());
        System.out.println("Perímetro do quadrado: " + quadrado.calcularPerimetro());
    }
}

