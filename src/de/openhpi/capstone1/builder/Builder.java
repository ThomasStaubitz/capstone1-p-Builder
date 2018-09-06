package de.openhpi.capstone1.builder;

public interface Builder {
	public void buildProduct();
	public Part buildPart(String partNum);
	void buildConnector(Part partA, Part partB);
	
	public Product getProduct();
}
