
package com.bank.model;

public class Customer {

    private final String customerId;
    private String firstName;
    private String lastName;
    private String email;

    public Customer(String customerId,
                    String firstName,
                    String lastName,
                    String email) {

        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }
}
