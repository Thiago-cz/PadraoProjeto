package Parte1.Modificado;
public class Main {
    public static void main(String[] args) {

        /*Lista de opcoes
            Samsung:
                Botao:
                    1 -> Galaxy J5
                    2 -> Galaxy J5 Prime
                TouchScrenn:
                    1 -> Galaxy S 20
            Apple:
                Botao:
                    1 -> Iphone 7
                TouchScreen:
                    1 -> Iphone 15
                    2 -> Iphone 11
        */


        IFabricaCelular apple = new Apple();
        IFabricaCelular samsung = new Samsung();

        ICelularTouchScreen iphone11 = apple.celularTouchScreen("128 GB", "Full HD", 6.1, "Branco", 3000,2);
        ICelularBotao iphone7 = apple.celularBotao("32 GB", "HD", 4, "Preto", 1000, 1);
        ICelularTouchScreen iphone15 = apple.celularTouchScreen("128 GB", "Full HD", 6.5, "Branco", 6000, 1);

        ICelularBotao j5Prime = samsung.celularBotao("32 GB", "HD", 4.8, "Prata", 900, 2);
        ICelularBotao j5 = samsung.celularBotao("16 GB", "HD", 4.3, "Prata", 600, 1);
        ICelularTouchScreen s20 = samsung.celularTouchScreen("128 GB", "Full HD", 6.5, "Branco", 2800, 1);

        iphone11.exibirInfoTouchScreen();
        System.out.println("\n");
        iphone7.exibirInfoBotao();
        System.out.println("\n");
        iphone15.exibirInfoTouchScreen();
        System.out.println("\n");
        j5.exibirInfoBotao();
        System.out.println("\n");
        s20.exibirInfoTouchScreen();
        System.out.println("\n");
        j5Prime.exibirInfoBotao();
    }
}
