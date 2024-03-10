public class CamisetaFlamengo extends Camiseta{

    public CamisetaFlamengo(String modelo) {
        super(modelo);
    }
    

    @Override
    void mostarCamiseta() {
        System.out.println(this.getModelo());

    }
}
