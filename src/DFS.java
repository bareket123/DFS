import java.util.Stack;

public class DFS {


    public void run(  Node start ){
        Stack<Node> stack=new Stack<>();
        stack.add(start);
        while (!stack.empty()){
            Node currentNode=stack.pop();
            if (!currentNode.isVisited()){
                currentNode.setVisited(true);
                System.out.println(currentNode);
                for (Node neighbor: currentNode.getNeighbors()) {
                    if (!neighbor.isVisited())
                    stack.add(neighbor);

                }
            }

        }

    }
    public void runRecursive(Node node){
        if (!node.isVisited()){
            node.setVisited(true);
            System.out.println(node);
            for (Node neighbor: node.getNeighbors()) {
                if (!neighbor.isVisited())
                 runRecursive(neighbor);

            }
        }



    }


}
