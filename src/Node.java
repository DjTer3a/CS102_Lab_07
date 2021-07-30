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


public class Node {


    //PROPERTIES
    Node next;
    String string;


    //CONSTRUCTOR
    public Node(String string2){
        this.string = string2;
        next = null;
    }


    //getter for node
    public String getNode(){
        if(string == null){
            return null;
        }
        else{
            return string;
        }
        
    }
}
