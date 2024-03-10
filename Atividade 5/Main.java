
public class Main {
    public static void main(String[] args) {


        Marca umbro = FabricaMarca.escolheMarca(5);



        Camiseta camisetaFluminense = umbro.criarCamiseta(1);

        camisetaFluminense.mostarCamiseta();
    }
}
