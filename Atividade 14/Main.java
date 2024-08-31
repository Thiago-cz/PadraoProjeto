public class Main {
    public static void main(String[] args) {
        try {
            IAssinatura assinatura = new AssinaturaBasica();
            assinatura = new VariosDispositivos(assinatura);
            assinatura = new FreteGratis(assinatura);
            assinatura = new CaixaSurpresa(assinatura);
            assinatura = new CashBack(assinatura);

            assinatura = new CashBack(assinatura); 
    
            System.out.println("Descrição: " + assinatura.getDescricao());
            System.out.println("Custo total: R$" + assinatura.getValor());
            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
