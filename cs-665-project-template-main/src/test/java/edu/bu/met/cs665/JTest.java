package test;

import legacy_system.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JTest {

	@Test
	public void TestCurrentSystemBase() {
		USBConnectVisitor usbConnectTest = new USBConnectVisitor();
		usbConnectTest.getCustomer_HTTPS(20);
		usbConnectTest.printCustomer(20);

		assertEquals(60, usbConnectTest.returnCustomer_HTTPS(20), 0);
	}

	@Test
	public void TestOldSystemBase() {
		USBConnect usbConnectTest = new USBConnect();
		usbConnectTest.getCustomer_USB(20);
		usbConnectTest.printCustomer(20);

		assertEquals(40, usbConnectTest.returnCustomer_USB(20), 0);
	}

	@Test
	public void TestVisitingAbilities() {
		USBConnectVisitor usbConnectVisitorTest = new USBConnectVisitor();
		USBConnect usbConnectTest = new USBConnect();
		usbConnectTest.getCustomer_USB(20);
		usbConnectVisitorTest.getCustomer_HTTPS(30);
		usbConnectVisitorTest.visit(usbConnectTest);


		assertEquals(60, usbConnectTest.customer_USB, 0);
	}
}
