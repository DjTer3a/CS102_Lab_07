
public class SimpleStackWithQueue {
    SimpleQueue2 q ;
    SimpleQueue2 q2;

    public SimpleStackWithQueue(){
        q = new SimpleQueue2();
        q2 = new SimpleQueue2();
    }
        
  
    
    public String push(String data){
        if(q.isEmpty()){
            q.enqueue(data);
            return data;
        }
        else{
            while(!q.isEmpty()){
                Node temp = q.dequeue();
                q2.enqueue(temp.getNode());
            }
            q = q2;
            return data;
        }
    }

    public String pop(){
      return q.dequeue().getNode();   
    }

    public String toString(){
            return q.toString();
    }

        
        
        
        
}

