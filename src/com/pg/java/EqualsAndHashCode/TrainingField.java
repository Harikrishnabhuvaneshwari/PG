package com.pg.java.EqualsAndHashCode;

import java.util.HashMap;
import java.util.Map;

public class TrainingField {

	String str;

	public TrainingField(String str) {
		this.str=str;
	}

	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return !this.str.equals(((TrainingField)obj).str);
	}

	//	|

	// hashCode method is native method(foreign method) in java. Native methods are those methods they
	// have implementation in other programming languages such as c,c++ and are loaded during runtime.

	//	Contract b/w equals and hashcode:

	//	1.If two objects are equal(by equals method) then they both
	//	will have same hashcode(by hashCode method).
	//	2.If two objects have same hashcode(by hashCode method) then we can't guarntee that
	//	the two objects are equal(by equals method) ex: strings "FB" and "Ea" has same hashcodes
	//	eventhough they are not equal.
	//	
	//	As we can't guarntee that each object will have unique hashcode,
	//	we have to design hashcode method in such a way that  should produce
	//	unique hashcode for each object.
	//	
	//	|

	@Override
	public int hashCode() {
		return str.hashCode();
	}

	public static void main(String[] args) {
		TrainingField tr=new TrainingField("FB");
		TrainingField tr2=new TrainingField("Ea");
		Map<TrainingField,String> m=new HashMap<>();
		m.put(tr,"FB");
		m.put(tr2,"Ea");
		System.out.println(m);
		System.out.println(tr.hashCode());
		System.out.println(tr2.hashCode());
		System.out.println("FB".hashCode());
		System.out.println("Ea".hashCode());
		System.out.println(tr.equals(tr2));
	}

}
