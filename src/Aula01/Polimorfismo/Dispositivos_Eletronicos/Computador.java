package Aula01.Polimorfismo.Dispositivos_Eletronicos;

class Computador extends DispositivoEletronico {
    @Override
    public void ligar() {
        System.out.println("Ligando computador...");
    }
}
