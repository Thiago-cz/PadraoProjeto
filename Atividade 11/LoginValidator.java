public class LoginValidator extends LoginValidatorChain {
    private static final String[] VALID_LOGINS = {"user1", "user2", "user3"};

    @Override
    public boolean validate(String login, String password) {
        boolean isValid = false;
        for (String validLogin : VALID_LOGINS) {
            if (validLogin.equals(login)) {
                isValid = true;
                break;
            }
        }
        if (!isValid) {
            System.out.println("Login inválido");
            return false;
        }
        return next != null ? next.validate(login, password) : true;
    }
}