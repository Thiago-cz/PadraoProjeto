package SOLID.DependencyInversion.Certo;

public class Interruptor {
    private Dispositivo dispositivo;

    // Nesse caso a classe será implementada por Dispositivo, o que não faz
    // diferença qual dispositivo será ligado na classe, desde que seja um disposito
    // posso troca-lo sem estragar a classe Interruptor.
    public Interruptor(Dispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void ligarDispositivo() {
        this.dispositivo.ligar();
    }

    public void desligarDispositivo() {
        this.dispositivo.desligar();
    }
}
