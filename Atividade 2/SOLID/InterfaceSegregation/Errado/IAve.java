package SOLID.InterfaceSegregation.Errado;

public interface IAve {
    //A interface está errada, pois esta muito generica, o que vai estragar o comportamento de algumas classes. O certo seria dividi-la.
    public void comer();
    public void botarOvos();
    public void voar();
}
