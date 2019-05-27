package com.pg.java.designpatterns.builder;

/**
 * Builder pattern test class
 * @author hprakash
 *
 */
public class Builder {

	public static void main(String[] args) {
		InputComponent inputComponent=new InputComponent.Builder("input").build();
		System.out.println(inputComponent);
		inputComponent=new InputComponent.Builder("selfId").setValue("23").setHeight(2)
				.setWidth(2).setType("String").build();
		System.out.println(inputComponent);
	}

}
