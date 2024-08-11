import java.util.Random;

class LojaQuadrinhos {
    private static final Item[] ITENS_DISPONIVEIS = {
        new ItemSimples("Quadrinho", 15.0),
        new ItemSimples("Chaveiro", 5.0),
        new ItemSimples("Busto", 10.0),
        new ItemSimples("Adesivo", 1.0),
        new ItemSimples("Poster", 25.0),
        new ItemSimples("Camiseta", 25.0),
        new ItemSimples("Caneta", 3.0),
        new ItemSimples("Miniatura", 20.0)
    };

    public static CaixaAssinatura criarCaixaAleatoria(String nivel) {
        CaixaAssinatura caixa = new CaixaAssinatura(nivel);
        int quantidadeItens;

        switch (nivel.toLowerCase()) {
            case "bronze":
                quantidadeItens = 3;
                break;
            case "prata":
                quantidadeItens = 5;
                break;
            case "ouro":
                quantidadeItens = 7;
                break;
            case "platina":
                quantidadeItens = 10;
                break;
            default:
                throw new IllegalArgumentException("Nível de assinatura inválido");
        }

        Random random = new Random();
        for (int i = 0; i < quantidadeItens; i++) {
            Item itemAleatorio = ITENS_DISPONIVEIS[random.nextInt(ITENS_DISPONIVEIS.length)];
            caixa.adicionarItem(itemAleatorio);
        }

        return caixa;
    }
}