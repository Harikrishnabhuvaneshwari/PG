package com.pg.java.immutable;

//goto below link for further explanation on why immutable class itself is final.
//https://stackoverflow.com/questions/12306651/why-would-one-declare-an-immutable-class-final-in-java

public class ImmutableClass {

	public final int speed;

	public int getSpeed() {
		return speed;
	}

	public ImmutableClass(int speed) {
		this.speed=speed;
	}

}
