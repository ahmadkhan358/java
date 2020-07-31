import java.util.*;

public class Tree {

    private Node root;

    public Tree(int d){
        root = new Node(d);
    }

    public void insert(int d){
        Node newNode = new Node(d);
        Node currentNode = root;

        while(true){
            if(currentNode.data > d){
                if(currentNode.left == null){
                    currentNode.left = newNode;
                    break;
                }
                currentNode = currentNode.left;
            }else if(currentNode.data < d){
                if(currentNode.right == null){
                    currentNode.right = newNode;
                    break;
                }
                currentNode = currentNode.right;
            }else {
                System.out.println("No duplicate nodes allowed");
                break;
            }
        }
    }


    public void delete(int d){
        Node currentNode = root;
        Node rootNode = null;
        while(true){
            if(currentNode.data == d) {

                break;
            }else if(currentNode.data > d){
                rootNode = currentNode;
                currentNode = currentNode.left;
            }else{
                rootNode = currentNode;
                currentNode = currentNode.right;
            }
        }
        if (currentNode.left == null && currentNode.right == null) {
            System.out.println("Data of deleted node " + currentNode.data);
            if (rootNode.left == currentNode) {
                rootNode.left = null;
            } else if (rootNode.right == currentNode) {
                rootNode.right = null;
            }
        } else if (currentNode.right == null && currentNode.left != null) {
            System.out.println("Data of deleted node " + currentNode.data);
            if(currentNode == root){
                root = currentNode.left;
                currentNode.left = null;
            }else {
                if (rootNode.left == currentNode) {
                    rootNode.left = currentNode.left;
                    currentNode.left = null;
                    currentNode = null;
                } else if (rootNode.right == currentNode) {
                    rootNode.right = currentNode.left;
                    currentNode.left = null;
                    currentNode = null;
                }
            }
        } else if (currentNode.left == null && currentNode.right != null) {
            System.out.println("Data of deleted node " + currentNode.data);
            if(currentNode == root){
                root = currentNode.right;
                currentNode.right = null;
            }else {
                if (rootNode.left == currentNode) {
                    rootNode.left = currentNode.right;
                    currentNode.right = null;
                    currentNode = null;
                } else if (rootNode.right == currentNode) {
                    rootNode.right = currentNode.right;
                    currentNode.right = null;
                    currentNode = null;
                }
            }

        } else if (currentNode.right != null && currentNode.left != null) {
            Node successor = currentNode.right;
            Node successorParent = currentNode;

            if (successor.left == null) {
                System.out.println("Data of deleted node " + currentNode.data);

                System.out.println("Data of successor " + successor.data);

                if(currentNode == root){
                    successor.left = currentNode.left;
                    root = successor;
                }else{
                    if(rootNode.left == currentNode){
                        rootNode.left = successor;
                    }else if(rootNode.right == currentNode){
                        rootNode.right = successor;
                    }
                    successor.left = currentNode.left;
                }

                currentNode.left = null;
                currentNode.right = null;

            }else{
                while (successor.left != null) {
                    successorParent = successor;
                    successor = successor.left;
                }
                System.out.println("Data of deleted node " + currentNode.data);

                System.out.println("Data of successor " + successor.data);

                if(currentNode == root){
                   root = successor;
                }else {

                    if (rootNode.right == currentNode) {
                        rootNode.right = successor;
                    } else if (rootNode.left == currentNode) {
                        rootNode.left = successor;
                    }
                }

                successor.right = currentNode.right;
                successor.left = currentNode.left;

                successorParent.left = null;
                currentNode.right = null;
                currentNode.left = null;
                currentNode = null;
            }
        }
    }

    public Node findNode(int d){
        Node currentNode = root;

        while(true){
            if(currentNode.data == d){
                break;
            }else if(currentNode.data > d){
                if(currentNode.left != null){
                    currentNode = currentNode.left;
                }else{
                    currentNode = null;
                    break;
                }

            }else if (currentNode.data < d){

                if(currentNode.right != null) {
                    currentNode = currentNode.right;
                }else{
                    currentNode = null;
                    break;
                }
            }
        }

        return currentNode;
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


    public static void main(String[] args) {
        Tree numbers = new Tree(10);

        numbers.insert(20);
        numbers.insert(5);
        numbers.insert(3);
        numbers.insert(24);
        numbers.insert(60);
        numbers.insert(18);
        numbers.insert(23);

        if(numbers.findNode(91) != null){
            System.out.println("Found");
        }else{
            System.out.println("Not Found");
        }
    }
}
