/**
 * Name: Jon Organ
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/5/2023
 * File Name: USBConnectVisitor.java
 * Description: This file contains the USBConnectVisitor class.
 */

package legacy_system;

public class USBConnectVisitor implements CustomerData_HTTPS {
    public int customer_HTTPS = 0;

    /**
     * This method gets then prints the customer_HTTPS
     */
    public void printCustomer(int customerId) {
        getCustomer_HTTPS(customerId);
        System.out.println("The customer HTTPS is: " + customer_HTTPS);
    }

    /**
     * This method would access customer data through a secure HTTPS connection and a REST API
     * connecting to an external server. As a place holder, it sets the customer_HTTPS to triple
     * the customerId
     */
    public void getCustomer_HTTPS(int customerId) {
        customer_HTTPS = customerId * 3;
    }

    public int returnCustomer_HTTPS(int customerId) {
        getCustomer_HTTPS(customerId);
        return customer_HTTPS;
    }

    public void visit(CustomerData_USB customerData_USB) {
        customerData_USB.getCustomer_USB(customer_HTTPS / 3);
        customerData_USB.printCustomer(customer_HTTPS / 3);
    }
}