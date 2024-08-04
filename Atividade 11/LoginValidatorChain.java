public abstract class LoginValidatorChain {
    protected LoginValidatorChain next;

    public void setNext(LoginValidatorChain next) {
        this.next = next;
    }

    public abstract boolean validate(String login, String password);
}