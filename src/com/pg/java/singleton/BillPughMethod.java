package com.pg.java.singleton;

/**
 * Bill Pugh way of creating singleton class.
 * @author hprakash
 *
 */
public class BillPughMethod {

	private BillPughMethod(){

	}

	/**
	 * Inner classes are loaded only when they are invoked, until then object 
	 * is not created from billPugMethod variable.
	 * 
	 * @author hprakash
	 */
	public static class Singleton{
		private static BillPughMethod billPughMethod=new BillPughMethod();

		public static BillPughMethod getInstance(){
			return billPughMethod;
		}

	}

	public static void main(String[] args) {
		System.out.println(BillPughMethod.Singleton.getInstance());
		System.out.println(BillPughMethod.Singleton.getInstance());
	}

}
