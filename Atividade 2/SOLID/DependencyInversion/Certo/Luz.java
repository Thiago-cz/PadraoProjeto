package SOLID.DependencyInversion.Certo;

public class Luz implements Dispositivo {

    @Override
    public void ligar() {
        System.out.println("Luz ligada");
    }

    @Override
    public void desligar() {
        System.out.println("Luz desligada");
    }

}
