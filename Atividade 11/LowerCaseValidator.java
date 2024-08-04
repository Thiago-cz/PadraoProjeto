public class LowerCaseValidator extends LoginValidatorChain {
    @Override
    public boolean validate(String login, String password) {
        if (!password.matches(".*[a-z].*")) {
            System.out.println("A senha deve conter pelo menos um caractere minúsculo");
            return false;
        }
        return next != null ? next.validate(login, password) : true;
    }
}