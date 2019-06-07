package com.pg.java.AnnonymousVsLambda;

/**
 * Driver class to check  d/b anonymous inner class and lambda expression.
 * 
 * 1.Anonymous inner class and lambda expressions are totally different.
 * 2.We can replace a certain implementation of anonymous inner class but not all.
 * 3.Only functional interface implementation of anonymous inner class is replaced
 * by lambda expression.
 * 4.Anonymous inner class can extend concrete class,abstract class and implement 
 * all interfaces but lambda expression is only applicable for functional interfaces.
 * 
 * 
 * @author hprakash
 *
 */
public class Driver {

	int speed=99;

	void check(){

		Interf annonymousInnerClass=new Interf() {
			int speed=100;   // instance variable
			@Override
			public void check() {
				//this always refers annonymous inner class instance in this case
				System.out.println("Annonymous inner class -->speed variable "+this.speed);
			}
		};

		int x=0;
		Interf lambdaExp=()->{
			int speed=200;	// local variable
			//this always refers current class instance
			System.out.println("Lambda Expression -->speed variable "+this.speed);
			System.out.println(x); // local variable used within lambda expression is
			//			implicitly final i.e., you cannot change its value.
		};
		annonymousInnerClass.check();
		lambdaExp.check();
	}

	public static void main(String[] args) {
		Driver driver=new Driver();
		driver.check();
	}

}
