/**
 * Lab_07 Instructions found on moodle
 * 
 * Style guidlines URL:-
 * http://www.cs.bilkent.edu.tr/~adayanik/cs101/practicalwork/styleguidelines.htm
 * 
 * 
 * @author Mostafa Higazy
 * @version 30/07/2021
 */


public class SimpleLinkedList{

    //PROPERTIES
    Node nodeList;


    //CONSTRUCTOR
    public SimpleLinkedList(){
        nodeList = null;
    }


    //checks if the list is empty or not
    public boolean isEmpty(){
        if(nodeList == null){
            return true;
        }
        else{
            return false;
        }
    }


    //adds node to the head of list
    public void addToHead(String data){
        Node nodeToAdd = new Node(data);
        nodeToAdd.next = nodeList;
        nodeList = nodeToAdd;
    }


    //returns length of the list
    public int Length(){
        int counter = 0;
        Node currentNode = nodeList;
        while(currentNode != null){
            currentNode = currentNode.next;
            counter++;
        }
        return counter;
    }


    //adds node to the tail of list
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


    //gets the node at the tail of list
    public Node nodeTail(){
        Node currentNode;
        currentNode = nodeList;

        while(currentNode.next != null){
            currentNode = currentNode.next;
        }

        return currentNode;
    }
    

    //removes node from the head of the list
    public Node removeFromHead(){
        Node temp = nodeList;
        if(temp == null){
            return null;
        }
        nodeList = nodeList.next;
        temp.next = null;
        return temp;            
    }


    //gets node at an index
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


    //returns list as a string representation
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
