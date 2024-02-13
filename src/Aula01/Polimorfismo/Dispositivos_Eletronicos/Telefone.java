package Aula01.Polimorfismo.Dispositivos_Eletronicos;

class Telefone extends DispositivoEletronico {
    @Override
    public void ligar() {
        System.out.println("Ligando telefone...");
    }
}