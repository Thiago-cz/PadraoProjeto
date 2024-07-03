public class AdapterPatternDemo {
    public static void main(String[] args) {
        Database paradox = new ParadoxDatabase();
        Database firebird = new FirebirdDatabase();
        Database mysql = new MysqlDatabase();

        Account freeAccount = new FreeAccountAdapter(paradox);
        Account basicAccount = new BasicAccountAdapter(firebird);
        Account premiumAccount = new PremiumAccountAdapter(mysql);

        User user1 = new User("Alice");
        User user2 = new User("Bob");

        System.out.println("Conta Gratuita:");
        ((FreeAccountAdapter) freeAccount).addUser(user1);
        ((FreeAccountAdapter) freeAccount).addUser(user2); // Deve falhar
        freeAccount.connectToDatabase();
        freeAccount.performDatabaseTransaction();

        System.out.println("\nConta Básica:");
        for (int i = 0; i < 11; i++) {
            ((BasicAccountAdapter) basicAccount).addUser(new User("User" + (i + 1)));
        }
        basicAccount.connectToDatabase();
        basicAccount.performDatabaseTransaction();

        System.out.println("\nConta Premium:");
        ((PremiumAccountAdapter) premiumAccount).addUser(user1);
        ((PremiumAccountAdapter) premiumAccount).addUser(user2);
        premiumAccount.connectToDatabase();
        premiumAccount.performDatabaseTransaction();
    }
}
