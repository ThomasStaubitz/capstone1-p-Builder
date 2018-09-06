package de.openhpi.capstone1.builder;

public class Connector {
	private Part[] connection;
	
	public Connector (Part start, Part end) {
		connection = new Part[2];
		this.connection[0] = start;
		this.connection[1] = end;
	}
	
	public Part[] getParts() {
		return connection;
	}
	
	public Part getStart() {
		return connection[0];
	}
	
	public Part getEnd() {
		return connection[1];
	}
	
	@Override
	public String toString() {
		return getStart() + "---->" + getEnd();
	}
}
