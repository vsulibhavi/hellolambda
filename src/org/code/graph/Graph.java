package org.code.graph;

public class Graph {

	int graph[][];
	int nodes;
	
	public Graph(int nodes) {

		graph = new int[nodes][nodes];
		this.nodes = nodes;
	
	}
	
	public void addEdge(int nodei, int nodej,int wieght)
	{
		graph[nodei][nodej] = wieght;
		
	}
	
	
	public void trace()
	{
		for(int i = 0 ; i< nodes;i++)
		{
			for(int j=0; j< nodes; j++)
			{
				System.out.print(graph[i][j] + " ");
				
			}
			
			System.out.println("\n");
		
		}
		
	}
	

	
}
