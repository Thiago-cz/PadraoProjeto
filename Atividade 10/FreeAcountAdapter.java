class FreeAccountAdapter implements Account {
    private final Database database;
    private User user;

    public FreeAccountAdapter(Database database) {
        this.database = database;
    }

    public void addUser(User user) {
        if (this.user == null) {
            this.user = user;
            System.out.println("Usuário " + user.getName() + " adicionado à conta gratuita.");
        } else {
            System.out.println("Conta gratuita permite apenas um usuário.");
        }
    }

    @Override
    public void connectToDatabase() {
        database.connect();
    }

    @Override
    public void performDatabaseTransaction() {
        database.performTransaction();
    }
}
