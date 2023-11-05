/**
 * Name: Jon Organ
 * Course: CS-665 Software Designs & Patterns
 * Date: 11/5/2023
 * File Name: CustomerData_HTTPS.java
 * Description: This file contains the CustomerData_HTTPS interface. 
 */

package legacy_system;

public interface CustomerData_HTTPS {
    void printCustomer(int customerId);
    void getCustomer_HTTPS(int customerId);
    void visit(CustomerData_USB customerData_USB);
}