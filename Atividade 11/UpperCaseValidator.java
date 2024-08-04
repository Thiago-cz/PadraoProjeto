public class UpperCaseValidator extends LoginValidatorChain {
    @Override
    public boolean validate(String login, String password) {
        if (!password.matches(".*[A-Z].*")) {
            System.out.println("A senha deve conter pelo menos um caractere maiúsculo");
            return false;
        }
        return next != null ? next.validate(login, password) : true;
    }
}