package tutor;

import java.util.logging.Level;

public class Customer {
private final String name;
private final String address;


    public Customer(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public static void main(String... args) {
        CustomerScala eric = new CustomerScala("Eric", "29 Acacia Road");
    }
}

 final class Loggerj{
    private static final Loggerj INSTANCE = new Loggerj();

    private Loggerj(){}

    public static Loggerj getLogger(){
        return INSTANCE;
    }

    public void log(Level level, String string) {
        System.out.printf("%s %s%n", level, string);
    }


}
