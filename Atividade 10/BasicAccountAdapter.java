import java.util.ArrayList;
import java.util.List;

class BasicAccountAdapter implements Account {
    private final Database database;
    private List<User> users = new ArrayList<>();

    public BasicAccountAdapter(Database database) {
        this.database = database;
    }

    public void addUser(User user) {
        if (users.size() < 10) {
            users.add(user);
            System.out.println("Usuário " + user.getName() + " adicionado à conta básica.");
        } else {
            System.out.println("Conta básica permite até 10 usuários.");
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
