/**
 * Name: Jon Organ
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/5/2023
 * File Name: USBConnectVisitor.java
 * Description: This file contains the USBConnectVisitor class. This class implements the CustomerData_HTTPS
 * interface. This class also contains the customer_HTTPS variable to store their data. It also contains the
 * methods required by the interface (printCustomer, getCustomer_HTTPS, and visit) as well as a helper method
 * (returnCustomer_HTTPS)
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

    /**
     * This method gets then returns the customer_HTTPS
     * @return int
     */
    public int returnCustomer_HTTPS(int customerId) {
        getCustomer_HTTPS(customerId);
        return customer_HTTPS;
    }

    /**
     * This method visits the CustomerData_USB object and allows for it's control over the old
     * API
     */
    public void visit(CustomerData_USB customerData_USB) {
        customerData_USB.getCustomer_USB(customer_HTTPS / 3);
        customerData_USB.printCustomer(customer_HTTPS / 3);
    }
}