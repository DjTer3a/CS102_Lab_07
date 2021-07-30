public class Node {
    Node head;
    Node next;
    String string;

    public Node(String string2){
        this.string = string2;
        next = null;
    }


    public String getNode(){
        if(string == null){
            return "null";
        }
        else{
            return string;
        }
        
    }
}
