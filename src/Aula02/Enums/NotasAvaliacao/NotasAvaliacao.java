package Aula02.Enums.NotasAvaliacao;

public enum NotasAvaliacao {
    APROVADO(7.0),
    RECUPERACAO(5.0),
    REPROVADO(0.0);

    private double mediaNecessaria;

    NotasAvaliacao(double mediaNecessaria) {
        this.mediaNecessaria = mediaNecessaria;
    }

    public double getMediaNecessaria() {
        return mediaNecessaria;
    }

    // Método que retorna o enum correspondente a uma média
    public static NotasAvaliacao obterNotaPelaMedia(double media) {
        for (NotasAvaliacao nota : NotasAvaliacao.values()) {
            if (media >= nota.mediaNecessaria) {
                return nota;
            }
        }
        return null; // Retorna null se a média não estiver associada a nenhuma nota
    }
}