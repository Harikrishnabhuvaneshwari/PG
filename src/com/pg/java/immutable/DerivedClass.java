package com.pg.java.immutable;

public class DerivedClass extends ImmutableClass {
	int speed;

	@Override
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public DerivedClass(int speed) {
		super(speed);
		this.speed=speed;
	}

	public static void main(String[] args) {
		DerivedClass derivedClass=new DerivedClass(200);
		ImmutableClass immutableClass=derivedClass;
		System.out.println(immutableClass.getSpeed());
		derivedClass.setSpeed(99);
		System.out.println(immutableClass.getSpeed());

	}

}
