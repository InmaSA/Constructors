package udemy.java;

public class Main {

    public static void main(String[] args) {

        // call the constructor with no parameters, returns class with default values
        VipCustomer customer = new VipCustomer();

        System.out.println(customer.getName());
        System.out.println(customer.getCreditLimit());
        System.out.println(customer.getEmail());

        // call the constructor with two parameters
        VipCustomer customer1 = new VipCustomer("Peter", 2000);

        System.out.println(customer1.getName());
        System.out.println(customer1.getCreditLimit());
        System.out.println(customer1.getEmail());

        // call the constructor with the three parameters
        VipCustomer customer2 = new VipCustomer("Andrew", 3000, "andrew@andrew.com");

        System.out.println(customer2.getName());
        System.out.println(customer2.getCreditLimit());
        System.out.println(customer2.getEmail());
    }
}
