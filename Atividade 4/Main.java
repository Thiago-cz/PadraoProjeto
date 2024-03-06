import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        int fabrica = Integer.parseInt(JOptionPane.showInputDialog("Bem vindo a fabrica de OVO. Escolha seu OVO\n" +
                "Escolha sua fabrica" +
                "1 - Nestle" +
                "2 - Garoto" +
                "3 - Lactea" +
                "4 - Hershey" +
                "5 - Ferreiro"));

        switch (fabrica) {
            case 1:
                IFabricaDeOvoDePascoa nestle = new Nestle();
                int produtoNeste = Integer.parseInt(JOptionPane.showInputDialog("Escolha seu ovo de pascoa" +
                        "1 - Alpino\n" +
                        "2 - Classic\n" +
                        "3 - Kit Kat"));
                switch (produtoNeste) {
                    case 1:
                        IOvoDePascoa alpino = nestle.criarOvoPremium(337, "preto", 15, 5, 8.5);
                        alpino.exibirInfoOvoDePascoa();
                        break;
                    case 2:
                        IOvoDePascoa classic = nestle.criarOvoPadrao(185, "marrom escuro", 13, 2.5, 5);
                        classic.exibirInfoOvoDePascoa();
                        break;
                    case 3:
                        IOvoDePascoa kitKat = nestle.criarOvoBasico(227, "preto", 20, 8, 5);
                        kitKat.exibirInfoOvoDePascoa();
                    default:
                        break;
                }
                break;
            case 2:
                IFabricaDeOvoDePascoa garoto = new Garoto();
                int produtoGaroto = Integer.parseInt(JOptionPane.showInputDialog("Escolha seu ovo de pascoa" +
                        "1 - Crocante\n" +
                        "2 - Talento\n" +
                        "3 - Baton ao leite"));
                switch (produtoGaroto) {
                    case 1:
                        IOvoDePascoa crocante = garoto.criarOvoPremium(215, "preto", 15, 5.3, 9.3);
                        crocante.exibirInfoOvoDePascoa();
                    case 2:
                        IOvoDePascoa talento = garoto.criarOvoPadrao(350, "marrom escuro", 13, 2.5, 7.3);
                        talento.exibirInfoOvoDePascoa();
                    case 3:
                        IOvoDePascoa batonAoLeite = garoto.criarOvoBasico(172, "preto", 20, 8.1, 6.8);
                        batonAoLeite.exibirInfoOvoDePascoa();
                        break;
                    default:
                        break;
                }
                break;

            case 3:
                IFabricaDeOvoDePascoa lactea = new Lactea();
                int produtoLactea = Integer.parseInt(JOptionPane.showInputDialog("Escolha seu ovo de pascoa" +
                        "1 - Ao leite\n" +
                        "2 - Oreo\n" +
                        "3 - Sonho de Valsa"));

                switch (produtoLactea) {

                    case 1:
                        IOvoDePascoa aoLeite = lactea.criarOvoPremium(170, "preto", 15, 5, 8.5);
                        aoLeite.exibirInfoOvoDePascoa();
                        ;
                        break;
                    case 2:
                        IOvoDePascoa oreo = lactea.criarOvoPadrao(257, "marrom escuro", 13, 2.5, 5);
                        oreo.exibirInfoOvoDePascoa();
                        break;
                    case 3:
                        IOvoDePascoa sonhoDeValsa = lactea.criarOvoBasico(227, "preto", 20, 8, 5);
                        sonhoDeValsa.exibirInfoOvoDePascoa();
                        break;

                }
                break;
            case 4:
                IFabricaDeOvoDePascoa hershey = new Hershey();
                int produtoHershey = Integer.parseInt(JOptionPane.showInputDialog("Escolha seu ovo de pascoa" +
                        "1 - Hershey1\n" +
                        "2 - Hershey2\n" +
                        "3 - Hershey3"));
                switch (produtoHershey) {
                    case 1:
                        IOvoDePascoa hershey1 = hershey.criarOvoPremium(336, "preto", 15, 5, 8.5);
                        hershey1.exibirInfoOvoDePascoa();
                        break;
                    case 2:
                        IOvoDePascoa hershey2 = hershey.criarOvoPadrao(225, "preto", 15, 5, 8.5);
                        hershey2.exibirInfoOvoDePascoa();
                        break;
                    case 3:
                        IOvoDePascoa hershey3 = hershey.criarOvoBasico(137, "preto", 15, 5, 8.5);
                        hershey3.exibirInfoOvoDePascoa();
                        break;

                }
                break;

            case 5:
                IFabricaDeOvoDePascoa ferreiro = new Ferreio();
                int produtoFerreiro = Integer.parseInt(JOptionPane.showInputDialog("Escolha seu ovo de pascoa" +
                        "1 - FerreiroRocher1\n" +
                        "2 - FerreiroRocher2\n" +
                        "3 - FerreiroRocher3"));
                switch (produtoFerreiro) {
                    case 1:
                        IOvoDePascoa ferreiroRocher1 = ferreiro.criarOvoPremium(336, "preto", 15, 5, 8.5);
                        ferreiroRocher1.exibirInfoOvoDePascoa();
                    case 2:
                        IOvoDePascoa ferreiroRocher2 = ferreiro.criarOvoPremium(336, "preto", 15, 5, 8.5);
                        ferreiroRocher2.exibirInfoOvoDePascoa();

                    case 3:
                        IOvoDePascoa ferreiroRocher3 = ferreiro.criarOvoPremium(336, "preto", 15, 5, 8.5);
                        ferreiroRocher3.exibirInfoOvoDePascoa();

                    default:
                        break;
                }
                break;
            default:
                break;
        }

    }
}
