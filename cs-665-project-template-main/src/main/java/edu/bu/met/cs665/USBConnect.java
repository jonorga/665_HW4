/**
 * Name: Jon Organ
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/5/2023
 * File Name: USBConnect.java
 * Description: This file contains the USBConnect class.
 */

package legacy_system;

public class USBConnect implements CustomerData_USB {
    public int customer_USB;

    public void printCustomer(int customerId) {
        System.out.println("The customer ID is: " + customerId);
    }

    public void getCustomer_USB(int customerId) {
        customer_USB = customerId * 2;
        // Do something here to get customer USB (check PDF for what that means)
    }

    public void accept(CustomerData_HTTPS customerData_HTTPS) {
        // Do whatever you're supposed to do with accept
    }
}