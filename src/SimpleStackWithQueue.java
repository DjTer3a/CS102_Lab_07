
public class SimpleStackWithQueue {
    SimpleQueue2 q ;
    SimpleQueue2 q2;


    public SimpleStackWithQueue(){
        q = new SimpleQueue2();
        q2 = new SimpleQueue2();
    }
    
    
    public String push(String data){
        if(!q.isEmpty()){
            q.enqueue(data);
            while(!q.isEmpty()){
                Node temp = q.dequeue();
                q2.enqueue(temp.getNode());
            }
            q = q2;
            q2 = new SimpleQueue2();
            
            return data;
        }
        else{
            q.enqueue(data);
            return data;
        }
    }

    public String pop(){
        if(!q.isEmpty()){
            while(!q.isEmpty()){
                Node temp = q.dequeue();
                q2.enqueueReverse(temp.getNode());
            }
            q = q2;
            q2 = new SimpleQueue2();
        }
        String out = q.dequeue().getNode(); 
        while(!q.isEmpty()){
            Node temp = q.dequeue();
            q2.enqueueReverse(temp.getNode());
        }
        q = q2;
        q2 = new SimpleQueue2(); 
        return out; 
    }

    public String toString(){
            return q.toString();
    }

        
        
        
        
}

