public class Main {
    public static void main(String[] args) {
        LoginValidatorChain loginValidator = new LoginValidator();
        loginValidator.setNext(new UpperCaseValidator());
        loginValidator.setNext(new LowerCaseValidator());
        loginValidator.setNext(new SpecialCharValidator());
        loginValidator.setNext(new NumberValidator());
        loginValidator.setNext(new ConsecutiveNumberValidator());
        loginValidator.setNext(new LengthValidator());

        // Teste com login e senha válidos
        System.out.println("Teste 1:");
        boolean isValid = loginValidator.validate("user1", "Abc@123de");
        System.out.println("Login e senha válidos: " + isValid);

        // Teste com login inválido
        System.out.println("\nTeste 2:");
        isValid = loginValidator.validate("invalidUser", "Abc@123de");
        System.out.println("Login e senha válidos: " + isValid);

        // Teste com senha inválida
        System.out.println("\nTeste 3:");
        isValid = loginValidator.validate("user2", "abc123");
        System.out.println("Login e senha válidos: " + isValid);
    }
}