package Aula02.Interface.Operacao_Matemática;

// Implementação da interface OperacaoMatematica para CalculadoraBasica
public class CalculadoraBasica implements OperacaoMatematica {
    @Override
    public double somar(double a, double b) {
        return a + b;
    }

    @Override
    public double subtrair(double a, double b) {
        return a - b;
    }

    @Override
    public double multiplicar(double a, double b) {
        return a * b;
    }
}

