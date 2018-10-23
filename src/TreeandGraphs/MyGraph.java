package TreeandGraphs;

import java.util.Random;

public class MyGraph {
	public static int size = 1;
	private MyNode vertices[];
	public int count;
	
	public MyGraph() {
		vertices = new MyNode[size];
		count = 0;
	}
	
	public void addNode(MyNode x) {
		if(vertices.length==count) {
//			System.out.println("resizing");
			MyNode[] temp = new MyNode[size*2];
			for(int i = 0; i<vertices.length;i++) {
				temp[i] = vertices[i];
			}
			size *= 2;
			vertices = temp;
		}
		vertices[count] = x;
		count++;
	}
	
	public boolean isEmpty() {
		return count==0;
	}
	
	public MyNode[] getNodes() {
		return vertices;
	}
	
	public MyGraph RandomGraph(int vertices, int range) {
		MyGraph g = new MyGraph();
		MyNode[] node = new MyNode[vertices];
		Random r = new Random();
		
		//Making nodes
		int number = vertices;
		while(number>0) {
			node[number-1] = new MyNode(r.nextInt(range));
			number--;
		}
		//adding adjacent nodes;
		number = vertices;
		while(number>0) {
			int size = r.nextInt(5);
			while(size>0) {
				int random_index = r.nextInt(vertices);
				node[number-1].addAdjacent(node[random_index]);
				size--;
			}
			number--;
		}
		//adding nodes to graphs
		number = vertices;
		while(number>0) {
			g.addNode(node[number-1]);
			number--;
		}
		return g;
	}
	
	public void show() {
		MyNode[] temp = this.getNodes();
		int i = 0;
		for(MyNode c : temp) {
			if(c==null) {
//				continue;
				break;
			}
//			System.out.print(i+++")\t"+c.getValue()+"("+c.hashCode()+")"+"\t(Size: "+c.getVertices().length+")\t");
			System.out.print(i+++")\t"+c.getValue()+"\t(Size: "+c.getVertices().length+")\t");
			for(MyNode k : c.getVertices()) {
				if(k==null) {
					break;
				}
//				System.out.print(" "+k.getValue()+"("+k.hashCode()+"),");
				System.out.print(" "+k.getValue());
			}
			System.out.println();
		}
	}
}
