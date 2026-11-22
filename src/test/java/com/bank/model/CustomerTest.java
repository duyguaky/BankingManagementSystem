
package com.bank.model;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CustomerTest {

    @Test
    void shouldCreateCustomerWithCorrectInformation() {

        Customer customer = new Customer(
            "C001",
            "Ayşe",
            "Yılmaz",
            "ayse@example.com"
        );

        assertEquals("C001", customer.getCustomerId());
        assertEquals("Ayşe", customer.getFirstName());
        assertEquals("Yılmaz", customer.getLastName());
        assertEquals("ayse@example.com", customer.getEmail());
    }
}
