class AluguelCarro {
    public double reservarCarro(String tipoCarro) {
        double preco = 0;
        switch (tipoCarro) {
            case "Econômica":
                preco = 150;
                break;
            case "Executiva":
                preco = 150 * 2; // 100% do valor da diária econômica
                break;
            case "Luxo":
                preco = 150 * 2 * 2; // 100% do valor da diária executiva
                break;
        }
        return preco;
    }
}