
public class SimpleLinkedList{
    Node nodeList;

    public SimpleLinkedList(){
        nodeList = null;
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
        if(nodeList == null){
            Node temp = new Node(data);
            temp.next = null;
            nodeList =temp;
        }
        else{
            Node currentNode = nodeTail();
            Node tail = new Node(data);
            currentNode.next = tail;
        }
    }

    public Node nodeTail(){
        Node currentNode;
        currentNode = nodeList;

        while(currentNode.next != null){
            currentNode = currentNode.next;
        }

        return currentNode;
    }

    public String removeFromHead(){
        Node temp = nodeList;
        if(temp == null){
            return null;
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
            return out;
        
    }

 }
