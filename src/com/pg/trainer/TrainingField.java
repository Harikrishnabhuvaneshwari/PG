package com.pg.trainer;

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
