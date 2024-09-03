import bankAccount.BankAccount;
import bankAccount.InsufficientFundsException;
import calculator.Calculator;
import calculator.DivisionByZeroException;
import emailValidator.EmailValidator;
import emailValidator.InvalidEmailException;

public class App {
    public static void main(String[] args) throws Exception {
        // Bank account task
        BankAccount account1 = new BankAccount("User1", 1000);
        account1.deposit(100);
        System.out.println(account1);
        account1.withdraw(500);
        System.out.println(account1);
        try {
            account1.withdraw(10000);
        } catch (InsufficientFundsException e) {
            System.out.println(e.getMessage());
        }

        // Calculator
        Calculator calculator = new Calculator();
        try {
            calculator.divide(10, 0);
        } catch (DivisionByZeroException e) {
            System.out.println(e.getMessage());
        }

        // Email validator
        EmailValidator emailValidator = new EmailValidator("ivanshumovich@gmail.com");
        try {
            emailValidator.validate();
            System.out.println("Succesfuly validate email!");
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }
}
