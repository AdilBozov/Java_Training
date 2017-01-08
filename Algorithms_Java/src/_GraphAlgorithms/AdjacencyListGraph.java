package _GraphAlgorithms;

import java.util.ArrayList;
import java.util.List;

class Graph{
	
	
	public ArrayList<Integer>[] ChildNodes = new ArrayList[6];
	public String[] NodeNames;
	
	public ArrayList<Integer>[] getChildNodes() {
		return ChildNodes;
	}
	public void setChildNodes(ArrayList<Integer>[] childNodes) {
		ChildNodes = childNodes;
	}
	public String[] getNodeNames() {
		return NodeNames;
	}
	public void setNodeNames(String[] nodeNames) {
		NodeNames = nodeNames;
	}
	
	public Graph(ArrayList<Integer>[] childNodes, String[] nodeNames){
		this.ChildNodes = childNodes;
		this.NodeNames = nodeNames;
	}
	
}

public class AdjacencyListGraph extends Graph{



	public AdjacencyListGraph(ArrayList<Integer>[] childNodes, String[] nodeNames) {
		super(childNodes, nodeNames);
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	

	}

}
