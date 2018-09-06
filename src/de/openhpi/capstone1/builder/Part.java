package de.openhpi.capstone1.builder;

public class Part {
	private String number;
	
	public Part (String number) {
		this.number = number;
	}
	
	public String getNumber() {
		return number;
	}
	
	@Override
	public String toString() {
		return "Part " + number;
	}
}
