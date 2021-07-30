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


public class SimpleQueue2 {

    //PROPERTIES
    SimpleLinkedList queue;


    //CONSTRUCTOR
    public SimpleQueue2()
    {
        queue = new SimpleLinkedList();
    }


    //checks if the queue is empty or not
    public boolean isEmpty(){
        return queue.isEmpty();
    }


    //enques node to tail
    public Node enqueue(String data){
        queue.addToTail(data);
        return queue.nodeTail();
    }


    //enques node to head
    public Node enqueueReverse(String data){
        queue.addToHead(data);
        return queue.nodeList;
    }


    //deques node to from head
    public Node dequeue(){
       return  queue.removeFromHead();
        
    }


    //returns length of the queue
    public int Length(){
        return queue.Length();
    }


    //returns string representation of the queue
    public String toString(){
        return queue.toString();
    }
}
