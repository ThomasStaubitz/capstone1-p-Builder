package de.openhpi.capstone1.builder;

public class Director {
	private Director() {}
	
	public static void construct(Builder builder) {
		builder.buildProduct();
		builder.buildPart("27-44");
		builder.buildPart("22-33");
	}
}
