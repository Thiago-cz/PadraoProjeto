public class CamisetaVasco extends Camiseta{

    public CamisetaVasco(String modelo) {
        super(modelo);
    }
    


    @Override
    void mostarCamiseta() {
        System.out.println(this.getModelo());

    }
}
