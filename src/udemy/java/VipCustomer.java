package udemy.java;

public class VipCustomer {

    private String name;
    private int creditLimit;
    private String email;

    // constructor with default values
    public VipCustomer() {
        this("unknown", 1000, "youremail@email.com");
    }

    // constructor to set two fields and the third as default value
    public VipCustomer(String name, int creditLimit) {
        this(name, creditLimit, "email@email.com");
        this.name = name;
        this.creditLimit = creditLimit;
    }

    // constructor to set all fields
    public VipCustomer(String name, int creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    // getter methods

    public String getName() {
        return this.name;
    }

    public int getCreditLimit() {
        return this.creditLimit;
    }

    public String getEmail() {
        return this.email;
    }
}
