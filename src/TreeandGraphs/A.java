package TreeandGraphs;

//MAKING A RANDOMIZED GRAPH	

public class A {
	
	public static void main(String[] args) {
		MyGraph g = new MyGraph();
		double initial = System.currentTimeMillis();
		g = g.RandomGraph(450, 450);
		double fina = System.currentTimeMillis();
		g.show();
		
		BST t = new BST();
		

		
		System.out.println("Time: "+(fina-initial));
	}
}