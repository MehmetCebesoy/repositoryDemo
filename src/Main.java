import java.util.concurrent.Callable;

//generic constraints:generik kısıtlar
public class Main {

    public static void main(String[] args) {
        Validator validator=new Validator();
        Customer customer=new Customer();
        validator.validate(customer);

    }
}
