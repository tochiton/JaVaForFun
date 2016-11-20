import java.io.*;
import java.util.*;

public class Graph {

    private int V;
    private LinkedList<Integer> adj [];   //adjacency list

    //constructor
    Graph(int v){
        V = v;
        adj = new LinkedList[V];
        for(int i = 0; i < V; i++){
            adj[i] = new LinkedList<Integer>();
        }
    }

    //function to add and edge into a Graph
    void addEdge(int v, int w){
        adj[v].add(w);
    }

    void topologicalSortUtil(int v, boolean visited[], Stack stack){
        visited[v] = true;
        Integer i;

        Iterator<Integer> it = adj[v].iterator();
        while(it.hasNext()){
            i = it.next();
            if(!visited[i])
                topologicalSortUtil(i, visited, stack);
        }
        stack.push(new Integer(v));
    }
    void topologicalSort(){
        Stack stack = new Stack();

        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;

        // Call the recursive helper function to store
        // Topological Sort starting from all vertices
        // one by one
        for (int i = 0; i < V; i++)
            if (visited[i] == false)
                topologicalSortUtil(i, visited, stack);

        // Print contents of stack
        while (stack.empty()==false)
            System.out.print(stack.pop() + " ");
    }


       /*
    int count [] = {30,56,78,95,21,36,34};
    Set<Integer> set = new HashSet<Integer>();


    for(int j = 0; j < 7; j++) {
        set.add(count[j]);
    }
        System.out.println(set);

    TreeSet sortedSet = new TreeSet<Integer>(set);
    System.out.println(sortedSet);
*/
}
