package com.pg.java.interfacee;

/**
 * If a class implements multiple interfaces that contains same default methods then
 * the implemented class must override the default method and inside that overridden
 * method it may call the required default method by using InterfaceName.super.methodName()
 * or may have their own implementation.
 * 
 * @author hprakash
 *
 */
public class InterfaceTest implements Left, Right {
	
	/**
	 * 
	 */
	@Override
	public void m1() {
		Left.super.m1();
		Right.super.m1();
		System.out.println("Own implementation");
	}

	public static void main(String[] args) {
		InterfaceTest interfaceTest=new InterfaceTest();
		interfaceTest.m1();
	}
	
}
