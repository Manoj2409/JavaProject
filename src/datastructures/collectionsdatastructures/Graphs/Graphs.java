package datastructures.collectionsdatastructures.Graphs;

import java.util.ArrayList;
import java.util.HashMap;

public class Graphs {
    private HashMap<String, ArrayList<String>> adjList =new HashMap<>();
    public void printGraph(){
        System.out.println(adjList);
    }
    public Boolean addVertex(String newVertex){
        if(adjList.get(newVertex)==null){
            adjList.put(newVertex,new ArrayList<>());
            return true;
        }
        return false;
    }
    public boolean addEdge(String s1, String s2){
        if(adjList.containsKey(s1) && adjList.containsKey(s2)){
            adjList.get(s1).add(s2);
            adjList.get(s2).add(s1);
            return true;
        }
        return false;
    }

    public boolean removeEdge(String vertex1, String vertex2){
        if(adjList.containsKey(vertex1) && adjList.containsKey(vertex2)){
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex){
        if(adjList.containsKey(vertex)){
            //remove the vertex and find the edges and remove the edges containing vertex
            for(String otherVertex : adjList.get(vertex)){
                adjList.get(otherVertex).remove(vertex);
            }
            adjList.remove(vertex);
            return true;
        }
        return false;
    }

}