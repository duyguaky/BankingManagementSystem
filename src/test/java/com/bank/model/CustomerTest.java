
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

@Test
void shouldUpdateCustomerFirstName() {

    Customer customer = new Customer(
        "C001",
        "Ayşe",
        "Yılmaz",
        "ayse@example.com"
    );

    customer.setFirstName("Zeynep");

    assertEquals("Zeynep", customer.getFirstName());
}

@Test
void shouldUpdateCustomerLastName() {

    Customer customer = new Customer(
        "C001",
        "Ayşe",
        "Yılmaz",
        "ayse@example.com"
    );

    customer.setLastName("Demir");

    assertEquals("Demir", customer.getLastName());
}

@Test
void shouldUpdateCustomerEmail() {

    Customer customer = new Customer(
        "C001",
        "Ayşe",
        "Yılmaz",
        "ayse@example.com"
    );

    customer.setEmail("yeni@example.com");

    assertEquals("yeni@example.com", customer.getEmail());
}

}
