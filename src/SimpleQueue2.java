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

    public Node dequeue(){
        queue.removeFromHead();
        return queue.get(0);
    }

    public String toString(){
        return queue.toString();
    }
}
