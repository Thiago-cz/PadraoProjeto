public class CamisetaFluminense extends Camiseta{

    public CamisetaFluminense(String modelo) {
        super(modelo);
    }
    

    @Override
    void mostarCamiseta() {
        System.out.println(this.getModelo());

    }
}
