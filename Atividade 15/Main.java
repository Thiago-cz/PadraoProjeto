public class Main {
    public static void main(String[] args) {
        // Criar o pedido real
        RealOrder realOrder = new RealOrder("Laptop", 2);

        // Aplicar o Proxy para verificar estoque
        ProxyOrder proxyOrder = new ProxyOrder(realOrder);

        // Aplicar desconto
        Discount baseDiscount = new BaseDiscount(1000);
        Discount couponDiscount = new CouponDiscount(baseDiscount, 100);
        double finalPrice = couponDiscount.applyDiscount(1000);
        System.out.println("Preco final com desconto: " + finalPrice);

        // Configurar Chain of Responsibility
        OrderHandler stockHandler = new StockHandler();
        OrderHandler paymentHandler = new PaymentHandler();
        stockHandler.setNextHandler(paymentHandler);

        // Processar o pedido
        stockHandler.handle(proxyOrder);
    }
}
