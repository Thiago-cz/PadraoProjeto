class ParadoxDatabase implements Database {
    @Override
    public void connect() {
        System.out.println("Conectando ao banco de dados Paradox.");
    }

    @Override
    public void performTransaction() {
        System.out.println("Realizando transação única no banco de dados Paradox.");
    }
}