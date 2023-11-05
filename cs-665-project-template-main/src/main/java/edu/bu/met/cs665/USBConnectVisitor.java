/**
 * Name: Jon Organ
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/5/2023
 * File Name: USBConnectVisitor.java
 * Description: This file contains the USBConnectVisitor class.
 */

package legacy_system;

public class USBConnectVisitor implements CustomerData_HTTPS {
    public int customer_HTTPS;

    public void printCustomer(int customerId) {
        System.out.println("The customer ID is: " + customerId);
    }

    public void getCustomer_HTTPS(int customerId) {
        customer_HTTPS = customerId * 3;
        // Do something here to get customer HTTPS (check PDF for what that means)
    }

    public void visit(CustomerData_USB customerData_USB) {
        // Check pattern for what visit means
    }
}