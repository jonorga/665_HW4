/**
 * Name: Jon Organ
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/5/2023
 * File Name: CustomerData_USB.java
 * Description: This file contains the CustomerData_USB interface. It contains the methods printCustomer,
 * getCustomer_USB, and accept.
 */

package legacy_system;

public interface CustomerData_USB {
    void printCustomer(int customerId);
    void getCustomer_USB(int customerId);
    void accept(CustomerData_HTTPS customerData_HTTPS);
}