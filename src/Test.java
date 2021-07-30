public class Test {
    public static void main(String[] args) {
        
        SimpleLinkedList linkedList= new SimpleLinkedList();
        
        linkedList.addToHead("6");
        System.out.println(linkedList);
        linkedList.addToHead("1");
        System.out.println(linkedList);
        linkedList.addToTail("2");
        System.out.println(linkedList);
        linkedList.addToHead("3");
        System.out.println(linkedList);
        linkedList.addToHead("4");
        System.out.println(linkedList);
        linkedList.addToHead("5");
        System.out.println(linkedList);
        
        linkedList.removeFromHead();
        System.out.println(linkedList);

        System.out.println(linkedList.get(0).getNode());
        System.out.println(linkedList.get(1).getNode());
        System.out.println(linkedList.get(2).getNode());
        System.out.println(linkedList.get(3).getNode());
        System.out.println();
        linkedList.removeFromHead();
        System.out.println(linkedList);
        System.out.println(linkedList.get(0).getNode());
        System.out.println(linkedList.get(1).getNode());
        System.out.println(linkedList.get(2).getNode());
        System.out.println(linkedList.get(3).getNode());
        System.out.println(linkedList.get(8).getNode());


        SimpleQueue queue = new SimpleQueue();
        SimpleQueue queue2 = new SimpleQueue();
        queue.enqueue("1");
        queue.enqueue("2");
        System.out.println("Queue starts at : " + queue.start.string);
        System.out.println("Queue ends at : " + queue.end.string);
        queue.enqueue("3");
        queue.enqueue("4");
        System.out.println("Queue starts at : " + queue.start.string);
        System.out.println("Queue ends at : " + queue.end.string);
        queue.enqueue("5");
        queue.dequeue();
        System.out.println("Queue starts at : " + queue.start.string);
        System.out.println("Queue ends at : " + queue.end.string);
        System.out.println("Is queue empty? "+ queue.isEmpty());
        System.out.println("Is queue empty? "+ queue2.isEmpty());


        
        

        
    }
}
