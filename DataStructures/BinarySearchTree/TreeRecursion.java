import java.util.LinkedList;
import java.util.Queue;

public class TreeRecursion {

    private Node root;

    public TreeRecursion(int d){
        root = new Node(d);
    }


    public void insert(int d){
        Node newNode = new Node(d);
        Node currentNode = root;
        
        System.out.println(insertingNode(d, currentNode, newNode));
    }
    
    public String insertingNode(int d, Node r, Node nn){
        String statement = "";
        if(r.data > d){
            if(r.left == null){
                r.left = nn;
                statement =  "Inserted";
            }
            r = r.left;
            insertingNode(d, r, nn);
        }else if(r.data < d){
            if(r.right == null){
                r.right = nn;
                statement = "Inserted";
            }
            r = r.right;
            insertingNode(d, r, nn);
        }else{
            statement = "No duplicate data";
        }
        
        return statement;
    }

    public void printTree(){
        Queue<Node> container = new LinkedList<>();

        Node currentNode = root;

        container.add(currentNode);

        while(!container.isEmpty()){
            currentNode = container.remove();
            System.out.println(currentNode.data);

            if(currentNode.left != null){
                container.add(currentNode.left);
            }

            if(currentNode.right != null) {
                container.add(currentNode.right);
            }

        }

    }
    
    
    public static void main(String[] args){
        TreeRecursion tr = new TreeRecursion(10);

        tr.insert(20);
        tr.insert(5);
        tr.insert(3);
        tr.insert(24);
        tr.insert(60);
        tr.insert(18);
        tr.insert(6);

        tr.printTree();
    }

}
