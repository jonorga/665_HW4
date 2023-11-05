/**
 * Name: Jon Organ
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/5/2023
 * File Name: USBConnect.java
 * Description: This file contains the USBConnect class.
 */

package legacy_system;

public class USBConnect implements CustomerData_USB {
    public int customer_USB = 0;

    /**
     * This method gets then prints the customer_USB
     */
    public void printCustomer(int customerId) {
        getCustomer_USB(customerId);
        System.out.println("The customer USB is: " + customer_USB);
    }

    /**
     * This method would retrieve customer data by connecting to external disks through a USB
     * connection and access binary files. As a place holder, it sets the customer_USB to double
     * the customerId
     */
    public void getCustomer_USB(int customerId) {
        customer_USB = customerId * 2;
    }

    public int returnCustomer_USB(int customerId) {
        getCustomer_USB(customerId);
        return customer_USB;
    }

    public void accept(CustomerData_HTTPS customerData_HTTPS) {
        customerData_HTTPS.visit(this);
    }
}