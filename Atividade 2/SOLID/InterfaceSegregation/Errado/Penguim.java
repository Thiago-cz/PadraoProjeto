package SOLID.InterfaceSegregation.Errado;

public class Penguim implements IAve{
    
    @Override
    public void comer() {
    
    }

    @Override
    public void botarOvos() {
    
    }
        //A implementação da interface IAve está errada, pois mesmo que sejam aves, pinguins não voam.

    @Override
    public void voar() {
    
    }
    
}
