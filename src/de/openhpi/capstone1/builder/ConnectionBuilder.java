package de.openhpi.capstone1.builder;

public abstract class ConnectionBuilder implements Builder {
	
	protected Product currentProduct;
	
	@Override
	public void buildProduct() {
		currentProduct = new Product();
	}

	@Override
	public Product getProduct() {
		return currentProduct;
	}
	
	@Override
	public Part buildPart(String partNum) {
		Part p = new Part(partNum);
		currentProduct.addPart(p);
		return p;
	}

	@Override
	public void buildConnector(Part partA, Part partB) {
		Connector c = new Connector(partA, partB);
		currentProduct.addConnector(c);
	}
	
	/**
	 * We can only add a connector when the current product has at least two parts that can be connected
	 * @return
	 */
	protected boolean canAddConnector() {
		return currentProduct.noOfParts() > 0 && currentProduct.noOfParts() % 2 == 0;
	}
}