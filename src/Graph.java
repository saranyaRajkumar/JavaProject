// JAVA program to print all 
// paths from a source to
// destination.
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;




// A directed graph using
// adjacency list representation
public class Graph {

	// No. of vertices in graph
	private int v; 
	
	// adjacency list 
	private ArrayList<Integer>[] adjList; 
	
	//Constructor
	public Graph(int vertices){
		
		//initialise vertex count
		this.v = vertices;
		
		// initialise adjacency list
		initAdjList(); 
	}
	
	// utility method to initialise
	// adjacency list
	@SuppressWarnings("unchecked")
	private void initAdjList()
	{
		adjList = new ArrayList[v];
		
		for(int i = 0; i < v; i++)
		{
			adjList[i] = new ArrayList<>();
		}
	}
	
	// add edge from u to v
	public void addEdge(int u, int v)
	{
		// Add v to u's list.
		adjList[u].add(v); 
	}
	
	// add edge from u to v
		public void addEdgeDSLOVC(StreamBasic st)
		{
			// Add v to u's list.
			//adjList[].add(v); 
		}
		
	// Prints all paths from
	// 's' to 'd'
	public void printAllPaths(int s, int d) 
	{
		boolean[] isVisited = new boolean[v];
		ArrayList<Integer> pathList = new ArrayList<>();
		
		//add source to path[]
		pathList.add(s);
		
		//Call recursive utility
		printAllPathsUtil(s, d, isVisited, pathList);
	}

	// A recursive function to print
	// all paths from 'u' to 'd'.
	// isVisited[] keeps track of
	// vertices in current path.
	// localPathList<> stores actual
	// vertices in the current path
	private void printAllPathsUtil(Integer u, Integer d,
									boolean[] isVisited,
							List<Integer> localPathList) {
		
		// Mark the current node
		isVisited[u] = true;
		
		if (u.equals(d)) 
		{
			System.out.println(localPathList);
		}
		
		// Recur for all the vertices
		// adjacent to current vertex
		for (Integer i : adjList[u]) 
		{
			if (!isVisited[i])
			{
				// store current node 
				// in path[]
				localPathList.add(i);
				printAllPathsUtil(i, d, isVisited, localPathList);
				
				// remove current node
				// in path[]
				localPathList.remove(i);
			}
		}
		
		// Mark the current node
		isVisited[u] = false;
	}

	// Driver program
	public static void main(String[] args) 
	{
		// Create a sample graph
		Graph g = new Graph(6);
		g.addEdge(0,1);
		g.addEdge(2,1);
		g.addEdge(0,2);
		g.addEdge(0,3);
		g.addEdge(2,0);
		
		g.addEdge(1,3);
		
		Map<String,Integer> st= new HashMap<String,Integer>();
	
		// arbitrary source
		int s = 2;
	
		// arbitrary destination
		int d = 3;
	
		System.out.println("Following are all different paths from "+s+" to "+d);
		g.printAllPaths(s, d);
		
		
		    Device d1 = new Device("1");
			Device d2 = new Device("2");
			Device d3 = new Device("4");
			Device d10 = new Device("3");
			Device d11 = new Device("5");
			Device d5 = new Device("11");
			
			Device d6 = new Device("7");
			Device d7 = new Device("9");
			Device d9 = new Device("10");
			
			
			g.addEdgeDSLOVC((new StreamBasic(d1,d2)));
			g.addEdgeDSLOVC(new StreamBasic(d2,d3));
			g.addEdgeDSLOVC(new StreamBasic(d3,d9));
			g.addEdgeDSLOVC(new StreamBasic(d2,d11));
			g.addEdgeDSLOVC(new StreamBasic(d11,d7));
			g.addEdgeDSLOVC(new StreamBasic(d7,d5));
			g.addEdgeDSLOVC(new StreamBasic(d5,d9));
		/*	g.addEdge(0,2);
			g.addEdge(0,3);
			g.addEdge(2,0);
			
			g.addEdge(1,3);
		*/
		/*	
			List<StreamBasic> npeList = new LinkedList<>();
			npeList.add(new StreamBasic(d6));
			npeList.add(new StreamBasic(d2));
			npeList.add(new StreamBasic(d3));
			npeList.add(new StreamBasic(d10));
			npeList.add(new StreamBasic(d4));
			npeList.add(new StreamBasic(d5));
			npeList.add(new StreamBasic(d9));
			npeList.add(new StreamBasic(d7));
			npeList.add(new StreamBasic(d11));*/
			
				
	}
}

class Device{
	
	private String name;
	Device(String name){
		
		this.name=name;
	
		
	}
	
	public String toString(){
		
		return this.name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
}

 class StreamBasic {

	Device device;
	
	
	StreamBasic(Device startDevice,Device endDevice){
		
		this.endDevice=endDevice;
		this.startDevice=startDevice;
	}
	private Device startDevice;
	public Device getStartDevice() {
		return startDevice;
	}

	public void setStartDevice(Device startDevice) {
		this.startDevice = startDevice;
	}

	public Device getEndDevice() {
		return endDevice;
	}

	public void setEndDevice(Device endDevice) {
		this.endDevice = endDevice;
	}
	private Device endDevice;
	
	
	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}
	 static void passingValue(String welcome){
		welcome = "raj";
	}
}
// This code is contributed by Himanshu Shekhar.
