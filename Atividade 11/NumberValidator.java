public class NumberValidator extends LoginValidatorChain {
    @Override
    public boolean validate(String login, String password) {
        if (!password.matches(".*\\d.*")) {
            System.out.println("A senha deve conter pelo menos um número");
            return false;
        }
        return next != null ? next.validate(login, password) : true;
    }
}