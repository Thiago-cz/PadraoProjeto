public class SpecialCharValidator extends LoginValidatorChain {
    @Override
    public boolean validate(String login, String password) {
        if (!password.matches(".*[@#$%&*].*")) {
            System.out.println("A senha deve conter pelo menos um caractere especial (@, #, $, %, &, *)");
            return false;
        }
        return next != null ? next.validate(login, password) : true;
    }
}