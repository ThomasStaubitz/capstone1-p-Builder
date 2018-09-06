package de.openhpi.capstone1.builder;

public class UndirectedConnectionBuilder extends ConnectionBuilder {

	@Override
	public Part buildPart(String partNum) {
		Part p = super.buildPart(partNum);
		
		if (canAddConnector()) {
			int i = currentProduct.getIndex(p);
			buildConnector(currentProduct.getPart(i-1), currentProduct.getPart(i));
			buildConnector(currentProduct.getPart(i), currentProduct.getPart(i-1));
		}
		return p;
	}
}