import java.util.ArrayList;
import java.util.List;

class PremiumAccountAdapter implements Account {
    private final Database database;
    private List<User> users = new ArrayList<>();

    public PremiumAccountAdapter(Database database) {
        this.database = database;
    }

    public void addUser(User user) {
        users.add(user);
        System.out.println("Usuário " + user.getName() + " adicionado à conta premium.");
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
