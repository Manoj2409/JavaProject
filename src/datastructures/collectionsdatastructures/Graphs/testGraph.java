package datastructures.collectionsdatastructures.Graphs;

public class testGraph {
    public static void main(String[] args) {
        Graphs graphs=new Graphs();
        graphs.addVertex("Something");
        graphs.addVertex("A");
        graphs.addVertex("B");
        graphs.addEdge("A","B");
        graphs.printGraph();
        //graphs.removeEdge("A","B");
        graphs.removeVertex("A");
        graphs.printGraph();
    }
}
