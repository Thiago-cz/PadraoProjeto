public class CamisetaBotafogo extends Camiseta{

    public CamisetaBotafogo(String modelo) {
        super(modelo);
    }

    @Override
    void mostarCamiseta() {
        System.out.println(this.getModelo());

    }
    
}
