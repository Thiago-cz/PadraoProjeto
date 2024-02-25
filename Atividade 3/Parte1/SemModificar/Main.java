package Parte1.SemModificar;
public class Main {
    public static void main(String[] args){
        IFabricaCelular apple = new Apple();
        IFabricaCelular samsung = new Samsung();

        ICelularBotao iphone7 = apple.celularBotao("32 GB", "HD", 4, "Preto", 1000);
        ICelularTouchScreen iphone15 = apple.celularTouchScreen("128 GB", "Full HD", 6.5, "Branco", 6000);

        ICelularBotao j5 = samsung.celularBotao("16 GB", "HD", 4.3, "Prata", 600);
        ICelularTouchScreen s20 = samsung.celularTouchScreen("128 GB", "Full HD", 6.5, "Branco", 2800);

        iphone7.exibirInfoBotao();
        System.out.println("\n");
        iphone15.exibirInfoTouchScreen();
        System.out.println("\n");
        j5.exibirInfoBotao();
        System.out.println("\n");
        s20.exibirInfoTouchScreen();
    }
    
    
}
