package SOLID.DependencyInversion.Errado;

public class Interruptor {
    private Luz luz;

    public Interruptor() {
        // Dependencia forte da classe luz, o que está errado. Caso precise
        // reaproveitar a classe Interruptor será necessario modificar a classe trocando
        // a luz. Tambem não consigo reaproveitar a classe para ligar outros tipos de
        // "dispositivos" pois estou preso a classe luz.
        this.luz = new Luz();
    }

    public void ligarDispositivo() {
        this.luz.ligar();
    }

    public void desligarDispositivo() {
        this.luz.desligar();
    }
}
