package algo.graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Vertex
{
    public Integer data;
    private boolean visited;
    public List<Vertex> neighbours = new LinkedList<>();

    public List<Vertex> getNeighbours() {
        return neighbours;
    }

    public void setNeighbours(List<Vertex> neighbours) {
        this.neighbours = neighbours;
    }


    Vertex(Integer data)
    {
        this.data = data;
    }


    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }


}

public class BFS1 {
    private Vertex startVertex;
    BFS1(Vertex startVertex)
    {
        this.startVertex = startVertex;
    }
    public void traverse()
    {
        Queue<Vertex> queue = new LinkedList<>();
        queue.add(startVertex);
        while(!queue.isEmpty())
        {

            Vertex current=queue.poll();
            if(!current.isVisited()) {
                current.setVisited(true);
                System.out.print(current.data+" ");
                queue.addAll(current.neighbours);
            }
        }
    }
    public static  void main(String args[])
    {
        Vertex v0= new Vertex(0);
        Vertex v1= new Vertex(1);
        Vertex v2= new Vertex(2);
        Vertex v3= new Vertex(3);
        Vertex v4= new Vertex(4);
        Vertex v5= new Vertex(5);
        Vertex v6= new Vertex(6);
        v0.setNeighbours(Arrays.asList(v1,v5,v6));
        v1.setNeighbours(Arrays.asList(v3,v4,v5));
        v4.setNeighbours(Arrays.asList(v2,v6));
        v6.setNeighbours(Arrays.asList(v0));
        BFS1 bfs1 = new BFS1(v0);
        bfs1.traverse();


    }
}
