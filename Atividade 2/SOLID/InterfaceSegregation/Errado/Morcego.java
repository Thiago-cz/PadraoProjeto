package SOLID.InterfaceSegregation.Errado;

public class Morcego implements IAve{
    @Override
    public void comer() {
        
    }
    
    //A implementação da interface IAve está errada, pois morcegos são mamiferos, e não botam ovos.
    @Override
    public void botarOvos() {
    
    }

    @Override
    public void voar() {
    }
    
}
