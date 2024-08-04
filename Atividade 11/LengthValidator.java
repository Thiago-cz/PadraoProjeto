public class LengthValidator extends LoginValidatorChain {
    @Override
    public boolean validate(String login, String password) {
        if (password.length() < 8 || password.length() > 16) {
            System.out.println("A senha deve ter entre 8 e 16 caracteres");
            return false;
        }
        return next != null ? next.validate(login, password) : true;
    }
}