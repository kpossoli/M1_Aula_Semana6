package Aula02.Enums.EstacoesDoAno2;

public enum EstacoesDoAno {
    PRIMAVERA(20),
    VERAO(30),
    OUTONO(15),
    INVERNO(5);

    private int temperaturaMedia;

    EstacoesDoAno(int temperaturaMedia) {
        this.temperaturaMedia = temperaturaMedia;
    }

    public int getTemperaturaMedia() {
        return temperaturaMedia;
    }

    // Método que retorna o enum correspondente a uma temperatura
    public static EstacoesDoAno obterEstacaoPelaTemperatura(int temperatura) {
        for (EstacoesDoAno estacao : EstacoesDoAno.values()) {
            if (temperatura >= estacao.temperaturaMedia) {
                return estacao;
            }
        }
        return null; // Retorna null se a temperatura não estiver associada a nenhuma estação
    }
}