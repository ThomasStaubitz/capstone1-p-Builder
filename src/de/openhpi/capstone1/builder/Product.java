package de.openhpi.capstone1.builder;

import java.util.ArrayList;

public class Product {
	private ArrayList<Part> parts;
	private ArrayList<Connector> connectors;
	
	public Product() {
		parts = new ArrayList<>();
		connectors = new ArrayList<>();
	}
	
	public void addPart(Part p) {
		parts.add(p);
	}
	
	public void addConnector(Connector c) {
		connectors.add(c);
	}
	
	public Part getPart(int index) {
		return parts.get(index);
	}
	
	
	public String toString() {
		String out = "Product Plan: \n\n";
		out += "List of parts: \n";
		for (Part p : parts) {
			out += p+"\n";
		}
		out += "------------\n";
		
		out += "List of connections: \n";
		for (Connector c : connectors) {
			out += c+"\n";
		}
		
		return out;
	}

	public int noOfParts() {
		return parts.size();
	}

	public int getIndex(Object o) {
		return parts.indexOf(o);
	}
}
