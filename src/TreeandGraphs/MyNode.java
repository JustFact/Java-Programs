package TreeandGraphs;

public class MyNode{
	private int data;
	private int adjacentCount;
	private MyNode[] vertices;
	private boolean isVisited;
	private int size;
	
	//n1 = new MyNode(#);
	public MyNode(int value){
		this.data = value;
		this.adjacentCount = 1;
		this.vertices = new MyNode[adjacentCount];
		this.isVisited = false;
		this.size = 0;
	}
	
	public MyNode() {}
	
	public void setVisited(boolean x) {
		this.isVisited = x;
	}
	
	public boolean isVisited() {
		return this.isVisited;
	}
	
	//n1.getValue();
	public int getValue() {
		return this.data;
	}
	
	//n1.getVertices();
	public MyNode[] getVertices() {
		return this.vertices;
	}
	
	//n1.addAdjacent(n2);
	public void addAdjacent(MyNode x) {
		if(vertices.length == size) {
			MyNode[] temp = new MyNode[adjacentCount*2];
			for(int i = 0; i<vertices.length; i++) {
				temp[i] = vertices[i];
			}
			vertices = temp;
			adjacentCount *= 2;
		}
			vertices[size] = x;
			size++;
	}
}
