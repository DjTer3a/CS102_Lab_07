public class SimpleQueue {
    Node start, end;
  
    public SimpleQueue()
    {
        start = end = null;
    }

  
    public boolean isEmpty(){
        if( start == null && end == null && start == end){
            return true;
        }
        else{
            return false;
        }
    }

    public Node enqueue(String data){
        Node temp = new Node(data);

        if(end == null){
            start = end = temp;
            return temp;
        }

        end.next = temp;
        end = temp;
        return temp;
    }

    public Node dequeue(){
        if(start == null){
            return start;
        }

        start = start.next;

        if(start == null){
            end = null;
        }

        return start;
    }

}
