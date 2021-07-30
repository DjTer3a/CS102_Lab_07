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


public class SimpleStackWithQueue {

    //PROPERTIES
    SimpleQueue2 q ;
    SimpleQueue2 q2;


    //CONSTRUCTOR
    public SimpleStackWithQueue(){
        q = new SimpleQueue2();
        q2 = new SimpleQueue2();
    }
    
    
    //pushes value into the stack
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


    //pops value out of the stack
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


    //prints stack as string
    public String toString(){
            return q.toString();
    }      
}

