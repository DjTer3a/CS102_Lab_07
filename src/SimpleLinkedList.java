
public class SimpleLinkedList extends Node{
    Node nodeList;

    public SimpleLinkedList(){
        super(null);
        nodeList = new Node(null);
    }

    public boolean isEmpty(){
        if(nodeList == null){
            return true;
        }
        else{
            return true;
        }
    }

    public void addToHead(String data){
        Node nodeToAdd = new Node(data);
        nodeToAdd.next = nodeList;
        nodeList = nodeToAdd;
    }

    public int Length(){
        int counter = 0;
        Node currentNode = nodeList;
        while(currentNode != null){
            currentNode = currentNode.next;
            counter++;
        }
        return counter;
    }

    public void addToTail(String data){
        Node nodeToAdd = new Node(data);
        Node currentNode = nodeList;
        int counter = 0;
        int counter2=0;
        while(currentNode != null){
            currentNode = currentNode.next;
            counter++;
        }

        nodeToAdd.next = currentNode;
        currentNode = nodeToAdd;
        while(counter <counter2){
            nodeList = nodeList.next;
            counter2++;
        }
        
        nodeList = nodeToAdd;
    }

    public String removeFromHead(){
        Node temp = nodeList;
        if(temp == null){
            return "null";
        }
        nodeList = nodeList.next;
        return temp.toString();            
    }

    public Node get(int index){
        Node currentNode = nodeList;
        int counter =0;
            while( counter < Length() && Length()!= 0){
                if(counter == index){
                    return currentNode;
                }
                else{
                    currentNode = currentNode.next;
                    counter++;
                } 
            }
            return nodeList = new Node(null);    
    }

    public String toString(){
        String out = "";
        Node currentNode = nodeList;
        
    

        while(currentNode != null){
            out += currentNode.string + ", ";
            currentNode = currentNode.next;
        }

        if(currentNode == null){
            out+= "null";
        }
            return out;
        
    }

 }