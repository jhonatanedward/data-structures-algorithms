package datastructures.graph;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<String, ArrayList<String>> adjList = new HashMap<String, ArrayList<String>>();

    public boolean addVertex(String vertex) {
        if(adjList.get(vertex) == null) {
            adjList.put(vertex, new ArrayList<>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String from, String to) {
        if(adjList.get(from) != null && adjList.get(to) != null) {
            this.adjList.get(from).add(to);
            this.adjList.get(to).add(from);
            return true;
        }
        return false;
    }

    public boolean removeEdge(String vertice1, String vertice2) {
        if(adjList.get(vertice1) != null && adjList.get(vertice2) != null) {
            adjList.get(vertice1).remove(vertice2);
            adjList.get(vertice2).remove(vertice1);
            return true;
        }
        return false;
    }

    public boolean removeVertice(String vertex) {
        if(adjList.get(vertex) == null) return false;
        for(String verticeConectado : adjList.get(vertex)) {
            adjList.get(verticeConectado).remove(vertex);
        }
        adjList.remove(vertex);
        return true;
    }

    public void printGraph() {
        System.out.println(adjList);
    }

}
