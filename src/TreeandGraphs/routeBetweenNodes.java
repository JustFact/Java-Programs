package TreeandGraphs;

/*Route Between Nodes: Given a directed graph, design an algorithm to find out whether there is a route between 
two nodes. */

public class routeBetweenNodes {
	
	public static boolean isConnected(MyNode node1, MyNode node2) {
		Queue q = new Queue();
		q.push(node1);
		node1.setVisited(true);
		while(!q.isEmpty()) {
			MyNode r =  q.pop();
			for(MyNode c : r.getVertices()) {
				if(c==null) {
					//continue;
					break;
				}
				if(c.isVisited() == false) {
					c.setVisited(true);
					q.push(c);
				}
				if(c==node2){
					return true;
				}
				
			}
		}
		return false;
	}
			

	public static void main(String[] args) {
		MyGraph g = new MyGraph();
		int number_of_nodes = 10;
		g = g.RandomGraph(number_of_nodes, 60);
		MyNode[] temp = g.getNodes();
		g.show();
		System.out.println(isConnected(temp[0],temp[number_of_nodes-1]));
		
	}
}
/*	TODO:
 * 	MAKE NODES UNIQUE
 * 	MAKE WEIGHTED EDGES IN GRAPH
 * */