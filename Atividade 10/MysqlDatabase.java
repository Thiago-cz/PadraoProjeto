class MysqlDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Conectando ao banco de dados MySQL.");
    }

    @Override
    public void performTransaction() {
        System.out.println("Realizando múltiplas transações no banco de dados MySQL.");
    }
}