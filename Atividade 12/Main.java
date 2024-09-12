public class Main {
    public static void main(String[] args) {
        CaixaAssinatura caixaBronze = LojaQuadrinhos.criarCaixaAleatoria("Bronze");
        caixaBronze.listarItens();

        System.out.println();

        CaixaAssinatura caixaPlatina = LojaQuadrinhos.criarCaixaAleatoria("Platina");
        caixaPlatina.listarItens();
    }
}
