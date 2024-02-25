package Parte2.Modificado;
public class Main {
    public static void main(String[] args) {
        /*
        Info modelos:
            Sonhos:
                Madeira:
                    1 -> Praia
                Concreto:
                    1 -> Moderna
                    2 -> Futurista
            Nosso Lar:
                Madeira:
                    1 -> Americana
                    2 -> Medieval
                Concreto:
                    1 -> Minimalista
         */

        IFabricaCasa nossoLar = new ConstrutoraNossoLar();
        IFabricaCasa sonhos = new ConstrutoraSonhos();
    
        ICasaMadeira praia = sonhos.casaMadeira(100, "Claro", 100000, 3, 2,1);
        ICasaMadeira americana = nossoLar.casaMadeira(180, "Escuro", 3000000, 5, 3,1);
        ICasaMadeira medieval = nossoLar.casaMadeira(130, "Escuro", 1500000, 2, 1,2);
    
        ICasaConcreto moderna = sonhos.casaConcreto(400, "Cinza, Beje e Azul", 500000, 4, 3,1);
        ICasaConcreto minimalista = nossoLar.casaConcreto(300, "Branco", 300000, 4, 2,1);
        ICasaConcreto futurista = nossoLar.casaConcreto(200, "Branco e azul", 800000, 6, 4,2);

        praia.exibirInfoCasaMadeira();
        System.out.println("\n");
        americana.exibirInfoCasaMadeira();
        System.out.println("\n");
        medieval.exibirInfoCasaMadeira();
        System.out.println("\n");
        futurista.exibirInfoCasaConcreto();
        System.out.println("\n");
        moderna.exibirInfoCasaConcreto();
        System.out.println("\n");
        minimalista.exibirInfoCasaConcreto();
    }

    
}
