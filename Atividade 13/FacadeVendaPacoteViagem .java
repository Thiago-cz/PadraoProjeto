class FacadeVendaPacoteViagem {
    private PassagemAerea passagemAerea;
    private ReservaHotel reservaHotel;
    private AluguelCarro aluguelCarro;
    private Pagamento pagamento;

    public FacadeVendaPacoteViagem() {
        this.passagemAerea = new PassagemAerea();
        this.reservaHotel = new ReservaHotel();
        this.aluguelCarro = new AluguelCarro();
        this.pagamento = new Pagamento();
    }

    public void comprarPacote(String nome, String cpf, String classeVoo, String assento,
            String tipoQuarto, int numeroPessoas, String tipoCarro,
            String formaPagamento, int parcelas) {
        double precoPassagem = passagemAerea.reservarAssento(classeVoo, assento);
        double precoHotel = reservaHotel.reservarQuarto(tipoQuarto, numeroPessoas);
        double precoCarro = aluguelCarro.reservarCarro(tipoCarro);
        double total = precoPassagem + precoHotel + precoCarro;
        double totalFinal = pagamento.calcularTotalComDesconto(total, formaPagamento, parcelas);

        System.out.println("Dados do Comprador:");
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Dados da Compra:");
        System.out.println("Classe do Voo: " + classeVoo);
        System.out.println("Assento: " + assento);
        System.out.println("Quarto do Hotel: " + tipoQuarto);
        System.out.println("Tipo de Carro: " + tipoCarro);
        System.out.println("Forma de Pagamento: " + formaPagamento);
        System.out.println("Parcelas: " + parcelas);
        System.out.printf("Valor Total do Pacote: R$ %.2f\n", totalFinal);
    }
}