public class CamisetaBrasil extends Camiseta{

    public CamisetaBrasil(String modelo) {
        super(modelo);
    }

    @Override
    void mostarCamiseta() {
        System.out.println(this.getModelo());

    }
    
}
