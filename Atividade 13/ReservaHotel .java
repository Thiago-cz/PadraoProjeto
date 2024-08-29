class ReservaHotel {
    public double reservarQuarto(String tipoQuarto, int numeroPessoas) {
        double precoPorPessoa = 0;
        switch (tipoQuarto) {
            case "Simples":
                precoPorPessoa = 200;
                break;
            case "Executivo":
                precoPorPessoa = 200 * 1.5; // 150% do valor do quarto simples
                break;
            case "Suíte Presidencial":
                precoPorPessoa = 200 * 1.5 * 3; // 300% do valor do quarto executivo
                break;
        }
        return precoPorPessoa * numeroPessoas;
    }
}