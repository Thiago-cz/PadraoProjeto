public class Main {
    public static void main(String[] args) {    
        FacadeVendaPacoteViagem facade = new FacadeVendaPacoteViagem();

        // Exemplo de compra
        facade.comprarPacote("Thiago", "123.456.789-00",
                "Executiva", "4B",
                "Executivo", 2,
                "Luxo", "Crédito", 6);
    }
}