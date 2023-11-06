package test;

import legacy_system.*;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class JTest {

	@Test
	public void TestCurrentSystemBase() {
		System.out.println("TestCurrentSystemBase Test");
		USBConnectVisitor usbConnectTest = new USBConnectVisitor();
		usbConnectTest.getCustomer_HTTPS(20);
		usbConnectTest.printCustomer(20);

		assertEquals(60, usbConnectTest.returnCustomer_HTTPS(20), 0);
	}

	@Test
	public void TestOldSystemBase() {
		System.out.println("TestOldSystemBase Test");
		USBConnect usbConnectTest = new USBConnect();
		usbConnectTest.getCustomer_USB(20);
		usbConnectTest.printCustomer(20);

		assertEquals(40, usbConnectTest.returnCustomer_USB(20), 0);
	}

	@Test
	public void TestVisitingAbilities() {
		System.out.println("TestVisitingAbilities Test");
		USBConnectVisitor usbConnectVisitorTest = new USBConnectVisitor();
		USBConnect usbConnectTest = new USBConnect();
		usbConnectTest.getCustomer_USB(20);
		usbConnectVisitorTest.getCustomer_HTTPS(30);
		usbConnectVisitorTest.visit(usbConnectTest);


		assertEquals(60, usbConnectTest.customer_USB, 0);
	}

	@Test
	public void TestMoreVisitingCases() {
		System.out.println("TestMoreVisitingCases Test");
		USBConnectVisitor usbConnectVisitorTest = new USBConnectVisitor();
		USBConnect usbConnectTest = new USBConnect();
		usbConnectTest.getCustomer_USB(20);
		usbConnectVisitorTest.getCustomer_HTTPS(30);
		usbConnectVisitorTest.visit(usbConnectTest);
		usbConnectTest.getCustomer_USB(20);

		assertEquals(40, usbConnectTest.customer_USB, 0);
	}

	@Test
	public void TestVisitorVariable() {
		System.out.println("TestVisitorVariable Test");
		USBConnectVisitor usbConnectVisitorTest = new USBConnectVisitor();
		usbConnectVisitorTest.getCustomer_HTTPS(2);
		usbConnectVisitorTest.printCustomer(2);

		assertEquals(6, usbConnectVisitorTest.customer_HTTPS, 0);
	}
}
