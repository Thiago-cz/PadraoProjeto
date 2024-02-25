package Parte2.SemModificar;
public class Main {
    public static void main(String[] args) {
        IFabricaCasa nossoLar = new ConstrutoraNossoLar();
        IFabricaCasa sonhos = new ConstrutoraSonhos();
    
        ICasaMadeira praia = sonhos.casaMadeira(100, "Claro", 100000, 3, 2);
        ICasaMadeira americana = nossoLar.casaMadeira(180, "Escuro", 3000000, 5, 3);
    
        ICasaConcreto moderna = sonhos.casaConcreto(400, "Cinza, Beje e Azul", 500000, 4, 3);
        ICasaConcreto minimalista = nossoLar.casaConcreto(300, "Branco", 300000, 4, 2);
        
        praia.exibirInfoCasaMadeira();
        System.out.println("\n");
        americana.exibirInfoCasaMadeira();
        System.out.println("\n");
        moderna.exibirInfoCasaConcreto();
        System.out.println("\n");
        minimalista.exibirInfoCasaConcreto();
    }

    
}
