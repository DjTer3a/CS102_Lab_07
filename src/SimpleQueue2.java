public class SimpleQueue2 {
    SimpleLinkedList queue;
    public SimpleQueue2()
    {
        queue = new SimpleLinkedList();
    }
    public boolean isEmpty(){
        return queue.isEmpty();
    }

    public Node enqueue(String data){
        queue.addToTail(data);
        return queue.nodeTail();
    }
    public Node enqueueReverse(String data){
        queue.addToHead(data);
        return queue.nodeList;
    }

    public Node dequeue(){
       return  queue.removeFromHead();
        
    }

    public int Length(){
        return queue.Length();
    }

    public String toString(){
        return queue.toString();
    }
}
