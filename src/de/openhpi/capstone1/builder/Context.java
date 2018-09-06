package de.openhpi.capstone1.builder;

public class Context {

	public static void main(String[] args) {
		Builder builder = new UndirectedConnectionBuilder();
//		Builder builder = new DirectedConnectionBuilder();
		
		Director.construct(builder);
		
		System.out.println(builder.getProduct());
	}

}
