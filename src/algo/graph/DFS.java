package algo.graph;

import java.util.*;

class Vertex1 {
    Vertex1(Integer data) {
        this.data = data;
    }

    public Integer data;
    public boolean visited;
    public List<Vertex1> neigbours = new LinkedList<>();

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex1> getNeigbours() {
        return neigbours;
    }

    public void setNeigbours(List<Vertex1> neigbours) {
        this.neigbours = neigbours;
    }
}

public class DFS {
    Vertex1 vetex;
    Deque<Vertex1> stack = new LinkedList<>();

    DFS(Vertex1 vetex) {
        this.vetex = vetex;
    }

    void traverse() {
        stack.push(vetex);
        while (!stack.isEmpty()) {
            Vertex1 current = stack.poll();

            if (!current.isVisited()) {
                current.setVisited(true);
                System.out.print(current.data + " ");
               // Collections.reverse(current.getNeigbours());
                current.getNeigbours().forEach(stack::push);
            }
        }
    }

    void traverseRecursively(Vertex1 vertex) {

            vertex.setVisited(true);
            System.out.print(vertex.data + " ");
            vertex.getNeigbours().stream().filter(neighbour->!neighbour.isVisited()).forEach(this::traverseRecursively);
    }

    public static void main(String args[]) {
        Vertex1 v0= new Vertex1(0);
        Vertex1 v1= new Vertex1(1);
        Vertex1 v2= new Vertex1(2);
        Vertex1 v3= new Vertex1(3);
        Vertex1 v4= new Vertex1(4);
        Vertex1 v5= new Vertex1(5);
        Vertex1 v6= new Vertex1(6);
        v0.setNeigbours(Arrays.asList(v1,v5,v6));
        v1.setNeigbours(Arrays.asList(v3,v4));
        v6.setNeigbours(Arrays.asList(v2,v0));


        DFS dfs= new DFS(v0);
        //dfs.traverse();
        dfs.traverseRecursively(v0);



    }
}
