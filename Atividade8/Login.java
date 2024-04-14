import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Login {

    static private Login login;
    private ArrayList<LoggedInUser> users;

    private Login() {
        this.users = new ArrayList<LoggedInUser>();
    }

    static synchronized Login getLogin() {
        if (login == null) {
            login = new Login();

        }

        return login;
    }

    public void addUser(LoggedInUser loggedInUser) {

        login.users.add(loggedInUser);
    }

    public String getUsersLogged() {
        String strUsers = "";
        for (LoggedInUser user : users) {
            strUsers = strUsers +
                    "\n\nNome: " + user.getUser().getUsername() +
                    "\nSenha: " + user.getUser().getPassword() +
                    "\nCodigo de verificacao: " + user.getStrVerifycode();
        }
        return strUsers;
    }

    public void removeUser(String username) {
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getUser().getUsername().equals(username)) {
                JOptionPane.showMessageDialog(null, "Usuario " + username + " removido com sucesso!!!");
                users.remove(i);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Não foi possivel encontrar o usuario!!");

    }

}