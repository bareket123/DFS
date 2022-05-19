import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Node {
    private String name;
    private boolean visited;
    private List<Node> neighbors=new ArrayList<>();

    public Node(String name){
        this.name=name;

    }


    public boolean isVisited(){
        return visited;
    }
    public void addNeighbor(Node neighbor){
        this.neighbors.add(neighbor);

    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Node> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Node> neighbors) {
        this.neighbors = neighbors;
    }

    public String toString(){
        return "name is: " + name;
    }
}
