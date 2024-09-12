public class Main {
    public static void main(String[] args) {
        CaixaAssinatura caixaBronze = LojaQuadrinhos.criarCaixaAleatoria("Bronze");
        caixaBronze.listarItens();

        System.out.println();

        CaixaAssinatura caixaPlatina = LojaQuadrinhos.criarCaixaAleatoria("Platina");
        caixaPlatina.listarItens();

        System.out.println();

        CaixaAssinatura caixaOuro = LojaQuadrinhos.criarCaixaAleatoria("Ouro");
        caixaOuro.listarItens();

        System.out.println();

        CaixaAssinatura caixaPrata = LojaQuadrinhos.criarCaixaAleatoria("Prata");
        caixaPrata.listarItens();
    }
}
