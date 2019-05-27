package com.pg.java.designpatterns.singleton;

public class DoubleCheckMethod {

	private static volatile DoubleCheckMethod SINGLETON=null;
	private DoubleCheckMethod(){

	}

	/**
	 * Double check method for creating singleton instance
	 * @return
	 */
	public static DoubleCheckMethod getInstance(){
		if(SINGLETON==null){
			synchronized (DoubleCheckMethod.class) {
				if(SINGLETON==null){
					SINGLETON=new DoubleCheckMethod();
				}
			}
		}
		return SINGLETON;
	}

}
