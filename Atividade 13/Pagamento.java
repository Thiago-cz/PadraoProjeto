class Pagamento {
    public double calcularTotalComDesconto(double total, String formaPagamento, int parcelas) {
        double desconto = 0;
        double acrescimo = 0;

        switch (formaPagamento) {
            case "Pix":
                desconto = 0.10; // 10% de desconto
                break;
            case "Boleto":
                desconto = 0.05; // 5% de desconto
                break;
            case "Débito":
                desconto = 0; // valor normal
                break;
            case "Crédito":
                if (parcelas > 1) {
                    acrescimo = 0.0399 * (parcelas - 1); // 3.99% de juros por parcela a partir da 2ª
                }
                break;
        }

        return total * (1 - desconto) * (1 + acrescimo);
    }
}