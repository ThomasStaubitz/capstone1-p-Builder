package de.openhpi.capstone1.builder;

public class DirectedConnectionBuilder extends ConnectionBuilder {

	@Override
	public Part buildPart(String partNum) {
		Part p = super.buildPart(partNum);
		
		if (canAddConnector()) {
			int i = currentProduct.getIndex(p);
			buildConnector(currentProduct.getPart(i-1), currentProduct.getPart(i));
		}
		return p;
	}
}
