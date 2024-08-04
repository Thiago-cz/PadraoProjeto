public class ConsecutiveNumberValidator extends LoginValidatorChain {
    @Override
    public boolean validate(String login, String password) {
        if (password.matches(".*\\d{3}.*")) {
            System.out.println("A senha não pode conter 3 números consecutivos");
            return false;
        }
        return next != null ? next.validate(login, password) : true;
    }
}