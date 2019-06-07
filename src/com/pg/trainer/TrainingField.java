package com.pg.trainer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class TrainingField implements Interf{

	String str;

	public TrainingField(String str) {
		this.str=str;
	}

	@Override
	public boolean equals(Object obj) {
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

		Interf interf=n->n*n;
		System.out.println(interf.test(455));

		Set<Integer> set=new HashSet<>();
		set.add(2);
		set.add(1);
		set.add(3);
		set.add(0);
		set.add(-1);
		System.out.println(set);

		Thread t=new Thread(()-> {for(int i=0;i<10;i++){System.out.println("child method");}});
		t.start();
		for(int i=0;i<10;i++){
			System.out.println("main thread");
		}
		
		TrainingField t1=new TrainingField("f"){
			@Override
			public void syso() {
				System.out.println("syso");
			}
		};
		t1.syso();
		interf.print("dddddddddd");
		tr.print("f");
	}
	
	public void syso() {

	}

	@Override
	public int test(int n) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public void print(Object s){
		System.out.println("-------------");
	}
	
}
