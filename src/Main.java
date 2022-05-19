public class Main {
    public static void main(String[] args) {
        Node nodeA=new Node("A");
        Node nodeB=new Node("B");
        Node nodeC=new Node("C");
        Node nodeD=new Node("D");
        Node nodeE=new Node("E");
        Node nodeF=new Node("F");
        Node nodeG=new Node("G");
        Node nodeH=new Node("H");
        Node nodeI=new Node("I");
        Node nodeJ=new Node("J");
        Node nodeK=new Node("K");


        nodeA.addNeighbor(nodeB);
        nodeA.addNeighbor(nodeC);

        nodeB.addNeighbor(nodeD);
        nodeB.addNeighbor(nodeE);

        nodeC.addNeighbor(nodeF);
        nodeC.addNeighbor(nodeG);

        nodeD.addNeighbor(nodeH);

        nodeE.addNeighbor(nodeI);
        nodeE.addNeighbor(nodeJ);

        nodeF.addNeighbor(nodeK);



        DFS dfs=new DFS();
        dfs.run(nodeA);





    }
}
