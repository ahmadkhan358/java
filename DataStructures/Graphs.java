import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graphs {

    private int noOfNodes;
    private Map<Integer, List<Integer>> adjacentList;

    public MyGraph(){
        noOfNodes = 0;
        adjacentList = new HashMap<>();
    }


    public void addVertex(int vertex){
        List<Integer> value = new ArrayList<>();
        adjacentList.put(vertex, value);
        noOfNodes++;
    }

    public void addEdge(int vertex1, int vertex2){
       List<Integer> values1 = adjacentList.get(vertex1);
       List<Integer> values2 = adjacentList.get(vertex2);
       values1.add(vertex2);
       values2.add(vertex1);
    }

    public void printGraph(){
        int calculations = 0;
        for(int key: adjacentList.keySet()){
            System.out.print(key + " --> ");
            List<Integer> values = adjacentList.get(key);
            for (int value: values){
                System.out.print(value + " ");
                calculations++;
            }
            System.out.print("\n");
        }

        System.out.println(calculations);
    }

    public static void main(String[] args) {
        MyGraph graph = new MyGraph();

        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);

        graph.printGraph();

        graph.addEdge(0,1);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(1,2);
        graph.addEdge(2,4);
        graph.addEdge(3,4);
        graph.addEdge(4,5);
        graph.addEdge(5,6);

        graph.printGraph();
    }

}
