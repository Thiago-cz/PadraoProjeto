public class FabricaMarca {

    static Marca escolheMarca(int opcao) {
        switch (opcao) {
            case 1:
                return new Adidas();
            case 2:
                return new Kappa();
            case 3:
                return new Nike();
            case 4:
                return new Puma();
            case 5:
                return new Umbro();
            default:
                return new Adidas();
        }

        
    }

}
