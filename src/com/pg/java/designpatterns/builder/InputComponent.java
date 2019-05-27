package com.pg.java.designpatterns.builder;

import lombok.ToString;


/**
 * reference link https://medium.com/@ajinkyabadve/builder-design-patterns-in-java-1ffb12648850
 * 
 * Builder pattern was introduced to rescue us from the traditional telescopic constructor pattern.

 * @author hprakash
 *
 */
@ToString
public class InputComponent {
	private String id;
	private String name;
	private String type;
	private String value;
	private int height;
	private int width;

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getType() {
		return type;
	}

	public String getValue() {
		return value;
	}

	public int getHeight() {
		return height;
	}

	public int getWidth() {
		return width;
	}

	public static class Builder{
		private final String id;
		private String name;
		private String type;
		private String value;
		private int height;
		private int width;

		public Builder(String id){
			this.id=id;
		}

		public Builder setName(String name){
			this.name=name;
			return this;
		}

		public Builder setValue(String value){
			this.value=value;
			return this;
		}

		public Builder setType(String type){
			this.type=type;
			return this;
		}

		public Builder setHeight(int height){
			this.height=height;
			return this;
		}

		public Builder setWidth(int width){
			this.width=width;
			return this;
		}

		public InputComponent build(){
			InputComponent inputComponent=new InputComponent();
			inputComponent.height=this.height;
			inputComponent.id=this.id;
			inputComponent.name=this.name;
			inputComponent.type=this.type;
			inputComponent.value=this.value;
			inputComponent.width=this.width;
			return inputComponent;
		}

	}
}
