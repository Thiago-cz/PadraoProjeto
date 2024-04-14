import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String username = JOptionPane.showInputDialog("Para prosseguir digite seu email");
        String password = JOptionPane.showInputDialog("Para prosseguir digite sua senha");
        String code = VerifyCode.verifyCode();

        if (code != null) {
            LoggedInUser user = new LoggedInUser(new User(username, password), code);
            Login login = Login.getLogin();
            login.addUser(user);
        }


        String username1 = JOptionPane.showInputDialog("Para prosseguir digite seu email");
        String password1 = JOptionPane.showInputDialog("Para prosseguir digite sua senha");
        String code1 = VerifyCode.verifyCode();

        if (code1 != null) {
            LoggedInUser user1 = new LoggedInUser(new User(username1, password1), code1);
            Login login1 = Login.getLogin();
            login1.addUser(user1);
        }


        String username2 = JOptionPane.showInputDialog("Para prosseguir digite seu email");
        String password2 = JOptionPane.showInputDialog("Para prosseguir digite sua senha");
        String code2 = VerifyCode.verifyCode();

        if (code2 != null) {
            LoggedInUser user2 = new LoggedInUser(new User(username2, password2), code2);
            Login login2 = Login.getLogin();
            login2.addUser(user2);
        }


        String username3 = JOptionPane.showInputDialog("Para prosseguir digite seu email");
        String password3 = JOptionPane.showInputDialog("Para prosseguir digite sua senha");
        String code3 = VerifyCode.verifyCode();

        if (code3 != null) {
            LoggedInUser user = new LoggedInUser(new User(username3, password3), code3);
            Login login = Login.getLogin();
            login.addUser(user);
        }

        String username4 = JOptionPane.showInputDialog("Para prosseguir digite seu email");
        String password4 = JOptionPane.showInputDialog("Para prosseguir digite sua senha");
        String code4 = VerifyCode.verifyCode();

        if (code4 != null) {
            LoggedInUser user = new LoggedInUser(new User(username4, password4), code4);
            Login login = Login.getLogin();
            login.addUser(user);
        }
        String username5 = JOptionPane.showInputDialog("Para prosseguir digite seu email");
        String password5 = JOptionPane.showInputDialog("Para prosseguir digite sua senha");
        String code5 = VerifyCode.verifyCode();

        if (code5 != null) {
            LoggedInUser user = new LoggedInUser(new User(username5, password5), code5);
            Login login = Login.getLogin();
            login.addUser(user);
        }

        Login login1 = Login.getLogin();
        Login login2 = Login.getLogin();
        Login login3 = Login.getLogin();

        JOptionPane.showMessageDialog(null, "Mostrando usuarios logados login1: "+ login1.getUsersLogged());
        JOptionPane.showMessageDialog(null, "Mostrando usuarios logados login2: "+ login2.getUsersLogged());
        JOptionPane.showMessageDialog(null, "Mostrando usuarios logados login3: "+ login3.getUsersLogged());
        
        
        JOptionPane.showMessageDialog(null, "Removendo um usuario de login1");
        login1.removeUser(JOptionPane.showInputDialog("Digite o username")); 
        
        JOptionPane.showMessageDialog(null, "Mostrando usuarios logados login1: "+ login1.getUsersLogged());
        JOptionPane.showMessageDialog(null, "Mostrando usuarios logados login2: "+ login2.getUsersLogged());
        JOptionPane.showMessageDialog(null, "Mostrando usuarios logados login3: "+ login3.getUsersLogged());
        
        JOptionPane.showMessageDialog(null, "Removendo um usuario de login3");
        login3.removeUser(JOptionPane.showInputDialog("Digite o username")); 
        
        JOptionPane.showMessageDialog(null, "Mostrando usuarios logados login1: "+ login1.getUsersLogged());
        JOptionPane.showMessageDialog(null, "Mostrando usuarios logados login2: "+ login2.getUsersLogged());
        JOptionPane.showMessageDialog(null, "Mostrando usuarios logados login3: "+ login3.getUsersLogged());

        JOptionPane.showMessageDialog(null, "Criando um usuario em login2");


        String username6 = JOptionPane.showInputDialog("Para prosseguir digite seu email");
        String password6 = JOptionPane.showInputDialog("Para prosseguir digite sua senha");
        String code6 = VerifyCode.verifyCode();

        if (code6 != null) {
            LoggedInUser user = new LoggedInUser(new User(username6, password6), code6);
            
            login2.addUser(user);
        }

        JOptionPane.showMessageDialog(null, "Mostrando usuarios logados login1: "+ login1.getUsersLogged());
        JOptionPane.showMessageDialog(null, "Mostrando usuarios logados login2: "+ login2.getUsersLogged());
        JOptionPane.showMessageDialog(null, "Mostrando usuarios logados login3: "+ login3.getUsersLogged());

        JOptionPane.showMessageDialog(null, "Criando um usuario em login1");


        String username7 = JOptionPane.showInputDialog("Para prosseguir digite seu email");
        String password7 = JOptionPane.showInputDialog("Para prosseguir digite sua senha");
        String code7 = VerifyCode.verifyCode();

        if (code7 != null) {
            LoggedInUser user = new LoggedInUser(new User(username7, password7), code7);
            
            login1.addUser(user);
        }

        JOptionPane.showMessageDialog(null, "Mostrando usuarios logados login1: "+ login1.getUsersLogged());
        JOptionPane.showMessageDialog(null, "Mostrando usuarios logados login2: "+ login2.getUsersLogged());
        JOptionPane.showMessageDialog(null, "Mostrando usuarios logados login3: "+ login3.getUsersLogged());

    }

}
