public class HashTableCoded {

    private Node[] hashTable;
    private int sizeOfTable;

    public Table(int size){
        hashTable = new Node[size];
        sizeOfTable = size;
    }

    public int hash(String key){
        int index = 0;

        int temp;

        for(int i=0; i<key.length(); i++){
            temp = (int) key.charAt(i);

            index += temp;
        }

        index %= sizeOfTable;

        return index;

    }

    public void insert(String key, Node value){
        if(hashTable[hash(key)] != null){
            Node container = hashTable[hash(key)];

            while(container.next != null){
                container = container.next;
            }

            container.next = value;

        }else{
            hashTable[hash(key)] = value;
        }
    }

    public boolean lookup(String key) {
        boolean ack = false;

        Node container = hashTable[hash(key)];

        if(container != null){
            while(container != null){
                if(container.key.equals(key)){
                    ack = true;
                    break;
                }
                container = container.next;
            }
        }

        return ack;
    }


    public void printTable(){
        for(int i=0; i<hashTable.length; i++){

            if(hashTable[i] != null){
                Node container = hashTable[i];

                while(container != null){
                    System.out.println("Key : " + container.key + " Value : " + container.value + " Next : " + container.next);
                    container = container.next;
                }
            }
        }
    }





    public static void main(String[] args) {
        HashTableCoded tab = new Table(50);

        tab.insert("Ahmad", new Node("Ahmad", 21));
        tab.insert("Ans", new Node("Ans", 17));
        tab.insert("Aqib", new Node("Aqib", 14));
        tab.insert("Arslan", new Node("Arslan", 25));
        tab.insert("Ammar", new Node("Ammar", 13));
        tab.insert("Maaz", new Node("Maaz", 15));
        tab.insert("Aneeq", new Node("Aneeq", 11));

        tab.printTable();


    }
}
